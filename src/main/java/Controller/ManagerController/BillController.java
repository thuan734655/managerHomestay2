package Controller.ManagerController;

import Controller.Feature.Feature;
import DAO.BillDAO;
import DAO.RentalStatusDAO;
import DAO.RenterDAO;
import Model.Bill;
import Model.RentalStatus;
import Model.Renter;
import View.ManagerView.PaneBill;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class BillController implements ActionListener {
  PaneBill paneBill;
  RentalStatusDAO rentalStatusDAO = new RentalStatusDAO();
  RenterDAO renterDAO = new RenterDAO();
  BillDAO billDAO = new BillDAO();
  Feature feature = new Feature();
  int moneyToPay = 0;

    public BillController(PaneBill paneBill) {
        this.paneBill = paneBill;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

      switch(e.getActionCommand()) {

        case "Search" : {

          int idRoom = Integer.parseInt(paneBill.getSearhByRoomNameUP().getText());

          RentalStatus rentalStatus = rentalStatusDAO.selectListRenterStillRentedByIdRoom(idRoom);

          try{
            if(rentalStatus != null) {
              Renter renter = renterDAO.findByID(rentalStatus.getIdRenter()+"");

              paneBill.getShowIDRenterUP().setText(rentalStatus.getIdRenter()+"");
              paneBill.getShowIdRoomUP().setText(rentalStatus.getIdRoom()+"");
              paneBill.getShowEmailUP().setText(renter.getEmail());
              paneBill.getShowNameUP().setText(renter.getSurnameOfRenter() + " " + renter.getMiddlenameOfRenter() + " " + renter.getNameOfRenter());
              paneBill.getShowElectricityNunberUP().setText(0 +"");
              paneBill.getShowCubicOfWaterUP().setText(0 +"");

              // kiem tra xem da tao bill lan nao chua, de chinh sua lai ngay thue va de tinh tien tro cho thang moi
              if(rentalStatus.getCheckCreateBll() == 0) {
                paneBill.getShowRentalDayUP().setText(rentalStatus.getRentalDay() + "");
              }
              else{
                paneBill.getShowRentalDayUP().setText(rentalStatus.getNewRentalDay() + "");
              }

            }
            else{
              JOptionPane.showMessageDialog(null,"The room has not been rented yet ");
            }
          }
          catch(Exception exception) {
            System.out.println(exception.getMessage());
          }
          break;
        }
        case "Create": {

          // tao bien dateCurrent de luu tru ngay tao bill
          Calendar dateCurrent = Calendar.getInstance();

          // ep kieu tu calendar sang Date va tao ra bien dateCreateBill
          Date dateCreateBill = dateCurrent.getTime();

          // Tang 1 ngay de lay ngay thue moi
          dateCurrent.add(Calendar.DAY_OF_MONTH, 1);

          // ep kieu tu calendar sang Date va tao ra  bien newRentalDay
          Date newRentalDay = dateCurrent.getTime();

          String idRenter =  paneBill.getShowIDRenterUP().getText();
          String idRoom = paneBill.getShowIdRoomUP().getText();
          String electricityNunber =  paneBill.getShowElectricityNunberUP().getText();
          String cubicOfWaterUPString = paneBill.getShowCubicOfWaterUP().getText();

          // cho idBill tu tang len 1
          int idBill = billDAO.selectIdBillLargest() + 1;


          //chuyen doi kieu du lieu string ve int
          int idRenterInt = Integer.parseInt(idRenter);
          int idRoomInt = Integer.parseInt(idRoom);
          int electricityNunberInt = Integer.parseInt(electricityNunber);
          int cubicOfWaterUPStringInt = Integer.parseInt(cubicOfWaterUPString);

          Bill bill = new Bill(idBill,idRenterInt,idRoomInt,dateCreateBill,electricityNunberInt,cubicOfWaterUPStringInt,moneyToPay,"Unpaid");
          int result =   billDAO.add(bill);
          if(result > 0) {

           int resultUPdateRentalStatus =  rentalStatusDAO.updateNewRentalDayAndCreateBill(idRoomInt,idRenterInt,newRentalDay);

           if(resultUPdateRentalStatus > 0) {
               JOptionPane.showMessageDialog(null,"Create bill success");
               String moneyToPayStr = format(moneyToPay + "");
               // send email
               String email = paneBill.getShowEmailUP().getText();
               String title = "Bill";
               String content = "We send this email to notify you that the payment date has arrived and here is your bill information:\n" +
                       "ID Bill: " + idBill + " \n" +
                       "ID renter: " + idRenter + " \n" +
                       "ID room: " + idRoom + " \n" +
                       "Data create bill: " + paneBill.getShowRentalDayUP().getText() +" \n" +
                       "Number of electricity: " + electricityNunberInt + " \n" +
                       "Number of cubic water: " + cubicOfWaterUPStringInt  + " \n" +
                       "Money to pay: " + moneyToPayStr + " VND" + " \n" + " \n" + " \n" +
                       "Thanks,"  +" \n" +
                       "thuan";
               feature.sendEmail(email,content,title);

           }
            else {

               JOptionPane.showMessageDialog(null,"Create bill fail  ");
            }

          }
          else {
            JOptionPane.showMessageDialog(null,"Create bill fail");
          }
          break;
        }
        case "Confirm": {
           int numWater = Integer.parseInt(paneBill.getEnterCubicOfWaterUP().getText());
           int numElectricity = Integer.parseInt(paneBill.getEnterElectricityNunberUP().getText());

           paneBill.getShowCubicOfWaterUP().setText(numWater +"");
           paneBill.getShowElectricityNunberUP().setText(numElectricity +"");

           String rentalDay = paneBill.getShowRentalDayUP().getText();

           // doi kieu du lieu String sang Date
           Date rentalDayDate = feature.pareStringToDate(rentalDay);

           Calendar calendar = Calendar.getInstance();
           Calendar currentDay = Calendar.getInstance();

           calendar.setTime(rentalDayDate);
           currentDay.getTime();

           // tinh chenh lech thoi gian mili giay
           long differenS = Math.abs(currentDay.getTimeInMillis() - calendar.getTimeInMillis()) ;

           // doi mili day sang ngay
           long totalRentalDay = differenS / (24*60*60*1000);


           int idRoom = Integer.parseInt(paneBill.getShowIdRoomUP().getText());

           //tinh tien phong theo loai phong
           if(idRoom == 1 || idRoom == 2 || idRoom == 3 ) {
              moneyToPay = (int) ((numElectricity * 3500) + (numWater * 3000) + (totalRentalDay * 50000));

             // dinh dang tien
             String moneyStr = format(moneyToPay +"");
           }
           else{
              moneyToPay = (int) ((numElectricity * 3500) + (numWater * 3000) + (totalRentalDay * 33000));

             // dinh dang tien
             String moneyStr = format(moneyToPay + "");

           }

          break;
        }
      }
    }
    public String format(String moneyStr) {
        int length = moneyStr.length();
        while(length > 3) {
            length -= 3;
            moneyStr = feature.insertString(moneyStr,".",length);
        }
        paneBill.getShowMoneyToPay().setText(moneyStr + " VND");
        return moneyStr;
    }

}
