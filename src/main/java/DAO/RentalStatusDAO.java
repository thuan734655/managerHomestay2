package DAO;

import Connect_database.Connect;
import Controller.Feature.Feature;
import Model.RentalStatus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;


public class RentalStatusDAO implements QuerySQLInterface<RentalStatus> {
    private Connect connect = new Connect();

    public RentalStatusDAO() {
    }

    @Override
    public ArrayList<RentalStatus> selectALL() {
        ArrayList<RentalStatus> listRentalStatus = new ArrayList<>();

        Connection connection = connect.getConnection();
        try{
            // tao ra cau query sql
            String querySQL = "select * from RENTAL_STATUS";
            PreparedStatement st = connection.prepareStatement(querySQL);

            ResultSet rs =  st.executeQuery();

            // tao ra tung doi tuong Room de nhan du lieu tuong ung tu csdl truyen ve
            while ( rs.next()) {
                int idRenter = rs.getInt(1);
                int idRoom = rs.getInt(2);
                Date rentalDay = rs.getDate(3);
                String rentalStatus = rs.getNString(4);
                String payForRoom = rs.getNString(5);

                RentalStatus newRentalStatus1 = new RentalStatus(idRenter,idRoom,rentalDay,rentalStatus,payForRoom);
                listRentalStatus.add(newRentalStatus1);
            }

            connect.closeConnection(connection);

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return listRentalStatus;
    }

    @Override
    public ArrayList<RentalStatus> selectByConditon(String Condition, String content) {
       return null;
    }

    public RentalStatus selectListRenterStillRentedByIdRoom(int idRoom) {
        Connection connection = connect.getConnection();

        RentalStatus rentalStatusRS = null;

        try{
            String query = "SELECT * FROM `rental_status` WHERE rentalStatus = 'Still rented' and idRoom = ?";
            PreparedStatement  st = connection.prepareStatement(query);
            st.setInt(1,idRoom);

            ResultSet rs = st.executeQuery();

            rs.next();
                int idRenter = rs.getInt(1);
                int idRoomRS = rs.getInt(2);
                Date rentalDay = rs.getDate(3);
                String rentalStatus = rs.getNString(4);
                String payForRoom = rs.getNString(5);
                int checkCreateBill = rs.getInt(6);
                Date newRentalDay = rs.getDate(7);

                RentalStatus newRentalStatus1 = new RentalStatus(idRenter,idRoomRS,rentalDay,rentalStatus,payForRoom,checkCreateBill,newRentalDay);
                rentalStatusRS = newRentalStatus1;
                connect.closeConnection(connection);
            }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return rentalStatusRS;
    }

    @Override
    public int update(RentalStatus rentalStatus) {
        // tao ket noi tu chuong trinh toi csdl
        Connection connection = connect.getConnection();

        //chuyen doi kieu du lieu date sang sqlDate
        Feature feature = new Feature();
       java.sql.Date sqlDate = feature.parseDatetoSqlDate(rentalStatus.getRentalDay());

        int checkPerform = 0;

        try{
            String querySQL =  "update RENTAL_STATUS" + " set " + " rentalDay = ?,"  +" rentalStatus = ?, " +  "payForRoom = ? " + " where idRenter= ? and idRoom = ?";
            PreparedStatement st = connection.prepareStatement(querySQL);
            st.setDate(1,sqlDate);
            st.setNString(2, rentalStatus.getRentalStatus());
            st.setNString(3, rentalStatus.getPayForRoom());
            st.setInt(4, rentalStatus.getIdRenter());
            st.setInt(5, rentalStatus.getIdRoom());


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

    public int updateSatus(String content, int idRoom,int idRenter) {
        // tao ket noi tu chuong trinh toi csdl
        Connection connection = connect.getConnection();


        int checkPerform = 0;

        try{
            String querySQL =  "update RENTAL_STATUS" + " set " + " rentalStatus = ? " + " where idRenter = ? and idRoom = ?";
            PreparedStatement st = connection.prepareStatement(querySQL);
            st.setString(1,content);
            st.setInt(2,idRenter);
            st.setInt(3,idRoom);


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

    public int updateNewRentalDayAndCreateBill(int idRoom,int idRenter, Date newRentalDay) {
        // tao ket noi tu chuong trinh toi csdl
        Connection connection = connect.getConnection();
        Feature feature = new Feature();

        // chuyen doi tu Date sang sqlDate
        java.sql.Date newRentalDaySQL = feature.parseDatetoSqlDate(newRentalDay);

        int checkPerform = 0;

        try{
            String querySQL =  "update RENTAL_STATUS" + " set " + " createdBill = ?, "  + " newRentalDay = ? " + " where idRenter = ? and idRoom = ?";
            PreparedStatement st = connection.prepareStatement(querySQL);
            st.setInt(1,0);
            st.setDate(2, newRentalDaySQL);
            st.setInt(3,idRenter);
            st.setInt(4,idRoom);


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

    // kiem tra xem nguoi thue tro co con dang thue hay khong
    public String checkRenter_status( int idRenter,int idRoom) {
        // tao ket noi tu chuong trinh toi csdl
        Connection connection = connect.getConnection();


        String resultIdRenter = "";

        try{

            /// kiem tra xem idRenter va Idroom co cung ton tai trong RenterStatus hay khong
            boolean checkEmptyIdroomAndIdRenter =  false;

            String querySQLSelect =  "select idRoom,idRenter from rental_status";
            PreparedStatement stSelect = connection.prepareStatement(querySQLSelect);

            ResultSet rsSelect =  stSelect.executeQuery();

            while(rsSelect.next()) {
                if(rsSelect.getInt(1) == idRoom && idRenter == rsSelect.getInt(2)) {
                    checkEmptyIdroomAndIdRenter = true;
                    break;
                }
            }
            if(checkEmptyIdroomAndIdRenter) {

                String querySQL =  "select rentalStatus  from rental_status " + " where idRenter = ? and idRoom = ?";
                PreparedStatement st = connection.prepareStatement(querySQL);
                st.setInt(1,idRenter);
                st.setInt(2,idRoom);


                // thuc thi cau query
                ResultSet rs = st.executeQuery();
                rs.next();

                resultIdRenter = rs.getString(1);
            }

            //ngat ket noi voi csdl
            connect.closeConnection(connection);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return resultIdRenter;
    }

    @Override
    public int delete(RentalStatus rentalStatus) {

        Connection connection = connect.getConnection();

        int checkPerform = 0;

        try{
            String querySQl = "delete from RENTAL_STATUS where idRenter = ? and idRoom = ?";
            PreparedStatement st = connection.prepareStatement(querySQl);
            st.setInt(1,rentalStatus.getIdRenter());
            st.setInt(2,rentalStatus.getIdRoom());


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
    public int add(RentalStatus rentalStatus) {
        // tao ket noi tu chuong trinh toi csdl
        Connection connection = connect.getConnection();

        //chuyen doi kieu du lieu date sang sqlDate
        Feature feature = new Feature();
        java.sql.Date sqlDate = feature.parseDatetoSqlDate(rentalStatus.getRentalDay());


        int checkPerform = 0;

        try{
            String querySQL = "insert into RENTAL_STATUS values (?,?,?,?,?,0,null)";
            PreparedStatement st = connection.prepareStatement(querySQL);
            st.setInt(1, rentalStatus.getIdRenter());
            st.setInt(2, rentalStatus.getIdRoom());
            st.setDate(3,sqlDate);
            st.setNString(4, rentalStatus.getRentalStatus());
            st.setNString(5, rentalStatus.getPayForRoom());



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
