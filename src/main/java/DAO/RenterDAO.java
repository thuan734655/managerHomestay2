package DAO;

import Connect_database.Connect;
import Controller.Feature.Feature;
import Model.Renter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class RenterDAO implements QuerySQLInterface<Renter> {
    Connect connect = new Connect();
    public RenterDAO() {
    }
    @Override
    public ArrayList<Renter> selectALL() {
        ArrayList<Renter> listRenter = new ArrayList<>();

        Connection connection =connect.getConnection();
        try{
            // tao ra cau query sql
            String querySQL = "select * from RENTER";
            PreparedStatement st = connection.prepareStatement(querySQL);

            ResultSet rs =  st.executeQuery();

            // tao ra tung doi tuong RENTER de nhan du lieu tuong ung tu csdl truyen ve
            while ( rs.next()) {
                int idRenter = rs.getInt(1);
                int rentedRoom = rs.getInt(2);
                String surnameOfRenter = rs.getString(3);
                String middlenameOfRenter = rs.getString(4);
                String nameOfRenter = rs.getNString(5);
                String numberOfPhone = rs.getString(6);
                Date birth = rs.getDate(7);
                String gender = rs.getString(8);
                String citizenIdentificationCard = rs.getString(9);
                String email = rs.getString(10);

                Renter newRenter = new Renter(idRenter,rentedRoom,surnameOfRenter,middlenameOfRenter,nameOfRenter,numberOfPhone,birth,gender,citizenIdentificationCard,email);

                listRenter.add(newRenter);
            }

            connect.closeConnection(connection);

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return listRenter;
    }

    @Override
    public ArrayList<Renter> selectByConditon(String Condition,String content) {
        return null;
    }

    public ArrayList<Renter> findByNameAndBirth(String name,Date birth) {

        Feature feature = new Feature();
       java.sql.Date birthDateSQl = feature.parseDatetoSqlDate(birth);

        ArrayList<Renter> listRenter = new ArrayList<>();

        //chia  cac thanh phan cua ten thanh ho, ten dem, ten
        String[] nameRenter = name.split("\\s");
        String middleName = "";

        // ghep cac tu cua ten dem
        for(int i = 1; i < nameRenter.length-1; i++) {
            middleName += nameRenter[i];
        }



        Connection connection =connect.getConnection();
        try{

            // tao ra cau query sql
            String querySQL = "SELECT * FROM renter WHERE surnameOfRenter = ? and middlenameOfRenter = ? and nameOfRenter = ? and birth = ?";
            PreparedStatement st = connection.prepareStatement(querySQL);

            st.setString(1,nameRenter[0]);
            st.setString(2,middleName);
            st.setString(3,nameRenter[nameRenter.length-1]);
            st.setDate(4, birthDateSQl);


            ResultSet rs =  st.executeQuery();

            // tao ra tung doi tuong RENTER de nhan du lieu tuong ung tu csdl truyen ve
            while (rs.next()) {
                int idRenter = rs.getInt(1);
                int rentedRoom = rs.getInt(2);
                String surnameOfRenter = rs.getString(3);
                String middlenameOfRenter = rs.getString(4);
                String nameOfRenter = rs.getNString(5);
                String numberOfPhone = rs.getString(6);
                Date birthRenter = rs.getDate(7);
                String gender = rs.getString(8);
                String citizenIdentificationCard = rs.getString(9);
                String email = rs.getString(10);

                Renter newRenter = new Renter(idRenter,rentedRoom,surnameOfRenter,middlenameOfRenter,nameOfRenter,numberOfPhone,birthRenter,gender,citizenIdentificationCard,email);

                listRenter.add(newRenter);
            }

            connect.closeConnection(connection);

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return listRenter;
    }

    public Renter findByID(String ID) {
        Renter newRenter = null;
        Connection connection =connect.getConnection();
        try{

            // tao ra cau query sql
            String querySQL = "SELECT * FROM renter WHERE idRenter = ?";
            PreparedStatement st = connection.prepareStatement(querySQL);

            st.setString(1,ID);

            ResultSet rs =  st.executeQuery();

            // tao ra tung doi tuong RENTER de nhan du lieu tuong ung tu csdl truyen ve
                rs.next();
                int idRenter = rs.getInt(1);
                int rentedRoom = rs.getInt(2);
                String surnameOfRenter = rs.getString(3);
                String middlenameOfRenter = rs.getString(4);
                String nameOfRenter = rs.getNString(5);
                String numberOfPhone = rs.getString(6);
                Date birthRenter = rs.getDate(7);
                String gender = rs.getString(8);
                String citizenIdentificationCard = rs.getString(9);
                String email = rs.getString(10);

                 newRenter = new Renter(idRenter,rentedRoom,surnameOfRenter,middlenameOfRenter,nameOfRenter,numberOfPhone,birthRenter,gender,citizenIdentificationCard,email);



            connect.closeConnection(connection);

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return newRenter;
    }
    public int selectIDLastRow() {
        Connection connection =connect.getConnection();
        int idLastRow = 0;
        try{

            // tao ra cau query sql
            String querySQL = "SELECT idRenter FROM RENTER " + "ORDER BY idRenter DESC " + "LIMIT 1;";
            PreparedStatement st = connection.prepareStatement(querySQL);

            ResultSet rs =  st.executeQuery();
            rs.next();
            idLastRow = rs.getInt(1);

            connect.closeConnection(connection);

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return idLastRow;
    }


    @Override
    public int update(Renter renter) {
        // tao ket noi tu chuong trinh toi csdl
        Connection connection = connect.getConnection();

        // doi kieu du lieu date sang sqldate
        Feature feature = new Feature();
        java.sql.Date sqlDateOfBirth = feature.parseDatetoSqlDate(renter.getBirth());


        int checkPerform = 0;

        try{
            String querySQL =  "update RENTER " + " set rentedRoom = ?,  surnameOfRenter = ?, middlenameOfRenter = ?, nameOfRenter = ?,  numberOfPhone = ?, birth= ?,genderOfRenter = ?, citizenIdentificationCard = ? where idRenter = ?";
            PreparedStatement st = connection.prepareStatement(querySQL);
            st.setInt(1,renter.getRentedRoom());
            st.setString(2, renter.getSurnameOfRenter());
            st.setString(3, renter.getMiddlenameOfRenter());
            st.setString(4, renter.getNameOfRenter());
            st.setString(5,renter.getNumberOfPhone());
            st.setDate(6,sqlDateOfBirth);
            st.setString(7,renter.getGender());
            st.setString(8, renter.getCitizenIdentificationCard());
            st.setInt(9,renter.getIdRenter());

            // thuc thi cau query
            checkPerform = st.executeUpdate();
            //ngat ket noi voi csdl
            connect.closeConnection(connection);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return checkPerform;
    }

    @Override
    public int delete(Renter renter) {
        Connection connection = connect.getConnection();
        int checkPerform = 0;
        try{
            String querySQl = "UPDATE `rental_status` SET `rentalStatus`= if(idRenter = ? ,'không còn thuê','còn thuê');";
            PreparedStatement st = connection.prepareStatement(querySQl);

            st.setInt(1,renter.getIdRenter());

          checkPerform=  st.executeUpdate();

            //ngat ket noi voi csdl
            connect.closeConnection(connection);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return checkPerform;
    }

    @Override
    public int add(Renter renter) {
        // tao ket noi tu chuong trinh toi csdl
        Connection connection = connect.getConnection();

        // doi kieu du lieu date sang sqldate
        Feature feature = new Feature();
        java.sql.Date sqlDateOfBirth = feature.parseDatetoSqlDate(renter.getBirth());


        int checkPerform = 0;

        try{
            String querySQL = "insert into RENTER values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = connection.prepareStatement(querySQL);
            st.setInt(1,renter.getIdRenter());
            st.setInt(2,renter.getRentedRoom());
            st.setString(3, renter.getSurnameOfRenter());
            st.setString(4, renter.getMiddlenameOfRenter());
            st.setString(5, renter.getNameOfRenter());
            st.setString(6,renter.getNumberOfPhone());
            st.setDate(7,sqlDateOfBirth);
            st.setString(8,renter.getGender());
            st.setString(9, renter.getCitizenIdentificationCard());
            st.setString(10,renter.getEmail());


            // thuc thi cau query
             checkPerform = st.executeUpdate();

            //ngat ket noi voi csdl
            connect.closeConnection(connection);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return checkPerform;
    }
}
