package Controller.Feature;

import DAO.RentalStatusDAO;
import DAO.RenterDAO;
import DAO.RoomDAO;
import Model.Renter;
import Model.Room;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class Feature {
    ArrayList<Renter> listRenter = new ArrayList<>();
    RentalStatusDAO rentalStatusDAO = new RentalStatusDAO();
    RenterDAO renterDAO = new RenterDAO();

    public  Feature () {

    }
    public Date pareStringToDate(String dateStr) {
         Date birth = null;
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try{
            birth = dateFormat.parse(dateStr);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return birth;
    }

//    public Date parseDateToString(Date date) {
//        Date birth = null;
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        try{
//            birth = dateFormat.parse(dateStr);
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//        }
//        return birth;
//    }

    public  java.sql.Date parseDatetoSqlDate(Date dateUtil) {
        return new java.sql.Date(dateUtil.getTime());
    }

    public  java.util.Date parseSqlDateToDate(java.sql.Date sqlDate) {
        return  new java.util.Date(sqlDate.getTime());
    }


    public boolean isEmptyRoom(int idRoom) {
        RoomDAO roomDAO = new RoomDAO();
        ArrayList<Room> listRoom = new ArrayList<>();
        listRoom = roomDAO.selectALL();

        for(Room room : listRoom) {
            if(idRoom == room.getiDRoom() && room.getStatusRoom().equals("Still empty")) {
                return true;
            }
        }
        return false;
    }


    public void checkValidityNumPhone(String numberPhone) throws ScccdException {
        if(numberPhone.length() != 10) {
            throw new ScccdException("Incorrect quantity contact number");
        }
        String numberPhoneReg = "^\\d+$";
        if(!numberPhone.matches(numberPhoneReg)) {
            throw new ScccdException("Contact number must contain only numbers");
        }

        // kiem tra xem contact number da ton tai chua
        ArrayList<Renter> listRenter = renterDAO.selectALL();

        // loc list nguoi thue van dang thue
        for (int index = 0; index < listRenter.size(); index++) {
            if ("No longer rented".equals(rentalStatusDAO.checkRenter_status( listRenter.get(index).getIdRenter(), listRenter.get(index).getRentedRoom()))) {
                listRenter.remove(index);
                index--;
            }
        }

        for (int index = 0; index < listRenter.size(); index++) {
            if(listRenter.get(index).getNumberOfPhone().equals(numberPhone)){
                throw new ScccdException("Contact number already exist!");
            }
        }
    }
    public void checkValidityBirth(String birth) throws ScccdException {

        String birthReg = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";
        if (!birth.matches(birthReg)) {
            throw new ScccdException("Wrong date of birth");
        }

    }
    public  void checkAge(Date date) throws BirthException {
        //tao doi tuong calendarDate de luu thoi gian cua tham so date va calenderNow lay thoi dian hien tai
        Calendar calendarNow = Calendar.getInstance();
        Calendar calendarDate = Calendar.getInstance();

        //chinh sua thoi gian cua calenderDate
        calendarDate.setTime(date);

        int age = calendarNow.get(calendarNow.YEAR)- calendarDate.get(calendarDate.YEAR);
        if( age < 16 || age > 100) {
            throw  new BirthException("Age must be between 16 and 100 years old");
        }

    }
    public void checkValiditySccd(String Scccd) throws ScccdException {
        if(Scccd.length() != 12) {
            throw new ScccdException("Incorrect quantity citizen number");
        }
        String ScccdReg = "^\\d+$";
        if(!Scccd.matches(ScccdReg)) {
            throw new ScccdException("Citizen number must contain numbers");
        }

        // kiem tra xem contact number da ton tai chua

        ArrayList<Renter> listRenter = renterDAO.selectALL();

        // loc list nguoi thue van dang thue
        for (int index = 0; index < listRenter.size(); index++) {
            if ("No longer rented".equals(rentalStatusDAO.checkRenter_status( listRenter.get(index).getIdRenter(), listRenter.get(index).getRentedRoom()))) {
                listRenter.remove(index);
                index--;
            }
        }

        for (int index = 0; index < listRenter.size(); index++) {
            if(listRenter.get(index).getCitizenIdentificationCard().equals(Scccd)){
                throw new ScccdException("Citizen number already exist!");
            }
        }
    }
    public void isEmptyIdRenter(int idRenter) throws ValuesException {
        listRenter = renterDAO.selectALL();

        for(Renter renter : listRenter) {
            if(renter.getIdRenter() == idRenter ) {
                throw new ValuesException("ID renter already exist!!");
            }
        }
    }
    public void isValidityPass(String pass) throws PasswordException {
        String passReg = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";
        if(!pass.matches(passReg)) {
            throw new PasswordException("Password invalid!");
        }
    }
    public void sendEmail(String recipientEmail, String content,String title) {
        final String email = "nanco432@gmail.com";
        final String pass = "lufhlxdwexokzvei";

        Properties props = new Properties();

        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props,new Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, pass);
            }
        });

        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("nanco432@gmail.com"));
            message.setRecipients(MimeMessage.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject(title);
            message.setText(content);
            Transport.send(message);

        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
    public void isValidityEmail(String email) throws EmailException {
        String emailReg =  "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        if(!email.matches(emailReg)) {
            throw new EmailException("Email invalid!");
        }
    }
    public void isExistEmail(String email) throws EmailException{
        ArrayList<Renter>listRenter = renterDAO.selectALL();
        for (int index = 0; index < listRenter.size(); index++) {
            if ("No longer rented".equals(rentalStatusDAO.checkRenter_status( listRenter.get(index).getIdRenter(), listRenter.get(index).getRentedRoom()))) {
                listRenter.remove(index);
                index--;
            }
        }
        for (int index = 0; index < listRenter.size(); index++) {
            if(listRenter.get(index).getEmail().equals(email)) {
                throw new EmailException("Email already exist");
            }
        }
    }

    public String insertString(String stringIntial, String stringInsert, int indexInsert ) {
        return stringIntial.substring(0,indexInsert) + stringInsert + stringIntial.substring(indexInsert,stringIntial.length());
    }


}
