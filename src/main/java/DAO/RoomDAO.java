package DAO;

import Connect_database.Connect;
import Model.Room;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RoomDAO  implements QuerySQLInterface<Room> {
    Connect connect = new Connect();
    public RoomDAO() {

    }

    @Override
    public ArrayList<Room> selectALL() {
        ArrayList<Room> listRoom = new ArrayList<>();

        Connection connection = connect.getConnection();
        try{
            // tao ra cau query sql
            String querySQL = "select * from ROOM";
            PreparedStatement st = connection.prepareStatement(querySQL);

            ResultSet rs =  st.executeQuery();

            // tao ra tung doi tuong Room de nhan du lieu tuong ung tu csdl truyen ve
            while ( rs.next()) {
                int idRoom = rs.getInt(1);
                String kindOfRoom = rs.getString(2);
                int priceOfRoom = rs.getInt(3);
                String nameOfRoom = rs.getNString(4);
                int electricityBillByNumber = rs.getInt(5);
                int waterBillByNumber = rs.getInt(6);
                String status = rs.getNString(7);

                // tao doi tuong va luu doi tuong bao arraylist
                Room newRoom = new Room(idRoom,kindOfRoom,priceOfRoom,nameOfRoom,electricityBillByNumber,waterBillByNumber,status);
                listRoom.add(newRoom);
            }

            connect.closeConnection(connection);

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return listRoom;
    }

    public Room selectByID(int idRoomSelect) {
        Room newRoom = null;

        Connection connection = connect.getConnection();
        try{
            // tao ra cau query sql
            String querySQL = "select * from ROOM where IDRoom = ?";
            PreparedStatement st = connection.prepareStatement(querySQL);
            st.setInt(1,idRoomSelect);

            ResultSet rs =  st.executeQuery();

            // tao ra tung doi tuong Room de nhan du lieu tuong ung tu csdl truyen ve
                rs.next();
                int idRoom = rs.getInt(1);
                String kindOfRoom = rs.getString(2);
                int priceOfRoom = rs.getInt(3);
                String nameOfRoom = rs.getNString(4);
                int electricityBillByNumber = rs.getInt(5);
                int waterBillByNumber = rs.getInt(6);
                String status = rs.getNString(7);

                // tao doi tuong va luu doi tuong bao arraylist
                newRoom = new Room(idRoom,kindOfRoom,priceOfRoom,nameOfRoom,electricityBillByNumber,waterBillByNumber,status);



            connect.closeConnection(connection);

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return newRoom;
    }


    @Override
    public ArrayList<Room> selectByConditon(String Condition, String content) {
        return null;
    }

    public ArrayList<String> selectByStatusRoom(String condition) {
        Connection connection = connect.getConnection();

        ArrayList<String> listRoomEmpty = new ArrayList<>();
        try{
            String sql = " select IDRoom from ROOM where statusRoom = ?;";

            PreparedStatement st = connection.prepareStatement(sql);

            st.setString(1,condition);

            ResultSet rs = st.executeQuery();

            while(rs.next()) {
                listRoomEmpty.add(rs.getString(1));
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return listRoomEmpty;
    }

    @Override
    public int update(Room room) {
        // tao ket noi tu chuong trinh toi csdl
        Connection connection = connect.getConnection();

        int checkPerfor = 0;

        try{
            String querySQL =  "update ROOM " + " set " + "kindOfRoom = ?,"+ "  priceOfRoom = ?," + " nameOfRoom = ?,"  +" eletricityBillByNumber = ?, " +  "waterBillByNumber = ?, " + "statusRoom = ? " + " where iDRoom = ?";
            PreparedStatement st = connection.prepareStatement(querySQL);
            st.setString(1,room.getKindOfRoom());
            st.setInt(2,room.getPriceOfRoom());
            st.setNString(3, room.getNameOfRoom());
            st.setDouble(4,room.getEletricityBillByNumber());
            st.setDouble(5,room.getWaterBillByNumber());
            st.setNString(6,room.getStatusRoom());
            st.setInt(7,room.getiDRoom());

            // thuc thi cau query
            int checkPerform = st.executeUpdate();

            //ngat ket noi voi csdl
            connect.closeConnection(connection);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return checkPerfor;
    }

    public int updateStatusRoom(String status,int idRoom) {
        Connection connection = connect.getConnection();

        int checkPerform = 0;
        try{
            String querySQL = "update ROOM " + " set " + " statusRoom = ? " + " where idRoom = ?";
            PreparedStatement st = connection.prepareStatement(querySQL);
            st.setString(1,status);
            st.setInt(2,idRoom);

            checkPerform = st.executeUpdate();

            connect.closeConnection(connection);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return checkPerform;
    }

    @Override
    public int delete(Room room)
    {
        Connection connection = connect.getConnection();

        int checkPerform = 0;

        try{
            String querySQl = "delete from ROOM where iDRoom = ?";
            PreparedStatement st = connection.prepareStatement(querySQl);

            st.setInt(1,room.getiDRoom());

            checkPerform=  st.executeUpdate();

            //ngat ket noi voi csdl
            connect.getConnection();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return checkPerform;
    }

    @Override
    public int add(Room room) {
        // tao ket noi tu chuong trinh toi csdl
        Connection connection =connect.getConnection();


        int checkPerform = 0;

        try{
            String querySQL = "insert into ROOM values (?,?,?,?,?,?,?)";
            PreparedStatement st = connection.prepareStatement(querySQL);
            st.setInt(1,room.getiDRoom());
            st.setString(2,room.getKindOfRoom());
            st.setInt(3,room.getPriceOfRoom());
            st.setNString(4, room.getNameOfRoom());
            st.setDouble(5,room.getEletricityBillByNumber());
            st.setDouble(6,room.getWaterBillByNumber());
            st.setNString(7,room.getStatusRoom());



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
