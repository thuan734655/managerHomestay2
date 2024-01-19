package DAO;

import Connect_database.Connect;
import Controller.Feature.Feature;
import Model.Bill;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BillDAO implements QuerySQLInterface<Bill> {
 Connect connect = new Connect();
 Feature feature = new Feature();
 @Override
 public int add(Bill bill) {
  Connection connection = connect.getConnection();
  int result = 0;
  try{
   String query  = "INSERT INTO `bill` VALUES (?,?,?,?,?,?,?,?)";
   PreparedStatement st =  connection.prepareStatement(query);

   // chuyen doi ngay thang tu data sang sql date
   Date dateCreateBillSql = feature.parseDatetoSqlDate(bill.getDateCreateBill());


   st.setInt(1,bill.getIdBill());
   st.setInt(2,bill.getIdRenter());
   st.setInt(3,bill.getIdRoom());
   st.setDate(4,dateCreateBillSql);
   st.setInt(5,bill.getNumberOfCubicWater());
   st.setInt(6,bill.getNumberOfElectricity());
   st.setInt(7,bill.getMoneyToPay());
   st.setString(8, bill.getStatusBill());


   result = st.executeUpdate();

  }
  catch (Exception e) {
   e.printStackTrace();
  }
  return result;
 }

 public int selectIdBillLargest() {
  Connection connection = connect.getConnection();
  int result = 0;
  try {
   String query = "SELECT idBill FROM `bill` ORDER BY idBill DESC limit 1";
   PreparedStatement st =  connection.prepareStatement(query);
   ResultSet rs = st.executeQuery();
   rs.next();
   result = rs.getInt(1);
  }
  catch(Exception e) {
   e.printStackTrace();
  }
 return result;
  }

 public Bill selectByIDBill ( int idBillSearch) {
  Connection connection = connect.getConnection();
  Bill bill = null;
  try{
   String query = "SELECT * from  bill where idBill = ?";
   PreparedStatement st =  connection.prepareStatement(query);
   st.setInt(1,idBillSearch);

   ResultSet rs = st.executeQuery();

    rs.next();
    int idBill = rs.getInt(1);
    int idRenter = rs.getInt(2);
    int idRoom = rs.getInt(3);
    Date dateCreateBill = rs.getDate(4);
    int numberOfCubicWater = rs.getInt(5);
    int numberOfElectricity = rs.getInt(6);
    int moneyToPay = rs.getInt(7);
    String statusBill = rs.getString(8);

    bill = new Bill(idBill,idRenter,idRoom,dateCreateBill,numberOfCubicWater,numberOfElectricity,moneyToPay,statusBill);


  }
  catch(Exception e) {
   e.printStackTrace();
  }
  return bill;
 }

 public ArrayList<Bill> selectListBillUnpaid() {

  Connection connection = connect.getConnection();
  ArrayList<Bill> listBillUnpaid = new ArrayList<>();
  try {
   String query = "SELECT * from bill where statusBill = 'Unpaid'";
   PreparedStatement st =  connection.prepareStatement(query);

   ResultSet rs = st.executeQuery();

   while(rs.next()) {
    int idBill = rs.getInt(1);
    int idRenter = rs.getInt(2);
    int idRoom = rs.getInt(3);
    java.util.Date dateCreateBill = rs.getDate(4);
    int numberOfCubicWater = rs.getInt(5);
    int numberOfElectricity = rs.getInt(6);
    int moneyToPay = rs.getInt(7);
    String statusBill = rs.getString(8);


    Bill newBill = new Bill(idBill,idRenter,idRoom,dateCreateBill,numberOfCubicWater,numberOfElectricity,moneyToPay,statusBill);
    listBillUnpaid.add(newBill);


   }

  }
  catch (Exception e) {
   e.printStackTrace();
  }
  return listBillUnpaid;
 }

 @Override
 public ArrayList<Bill> selectALL() {
  Connection connection = connect.getConnection();
  ArrayList<Bill> listBill = new ArrayList<>();
  try {
   String query = "SELECT * from bill";
   PreparedStatement st =  connection.prepareStatement(query);
   ResultSet rs = st.executeQuery();
   while(rs.next()) {
    int idBill = rs.getInt(1);
    int idRenter = rs.getInt(2);
    int idRoom = rs.getInt(3);
    Date dateCreateBill = rs.getDate(4);
    int numberOfCubicWater = rs.getInt(5);
    int numberOfElectricity = rs.getInt(6);
    int moneyToPay = rs.getInt(7);
    String statusBill = rs.getString(8);


    Bill newBill = new Bill(idBill,idRenter,idRoom,dateCreateBill,numberOfCubicWater,numberOfElectricity,moneyToPay,statusBill);
    listBill.add(newBill);
   }

  }
  catch (Exception e) {
   e.printStackTrace();
  }
  return listBill;
 }

 public int updateStatusPay(int idBill,String statusPay){
  Connection connection = connect.getConnection();

  int result = 0;

  try {
   String query = "UPDATE `bill` SET `statusBill`= ? WHERE idBill = ?";
   PreparedStatement st = connection.prepareStatement(query);
    st.setString(1,statusPay);
    st.setInt(2,idBill);

    result = st.executeUpdate();

    connect.closeConnection(connection);
  }
  catch (Exception e){
   e.printStackTrace();
  }
  return result;
 }

 public int deleteById (int idBill) {

  Connection connection = connect.getConnection();
  int result = 0;
  try {
   String query = "DELETE FROM `bill` WHERE idBill = ?";
   PreparedStatement st = connection.prepareStatement(query);

   st.setInt(1,idBill);

   result = st.executeUpdate();
   connect.closeConnection(connection);
  }
  catch (Exception e) {
   e.printStackTrace();
  }
  return result;
 }

 @Override
 public ArrayList<Bill> selectByConditon(String Condition, String content) {
  return null;
 }
 @Override
 public int update(Bill bill) {
  return 0;
 }

 @Override
 public int delete(Bill bill) {
  return 0;
 }



}
