package Controller.ManagerController;


import Controller.Feature.Feature;
import DAO.RentalStatusDAO;
import DAO.RenterDAO;
import DAO.RoomDAO;
import Model.*;

import View.ManagerView.PaneAddRenter;

import javax.swing.*;
import java.awt.event.*;

import java.util.Calendar;
import java.util.Date;

public class AddRenterController extends MouseAdapter implements ActionListener {
    private boolean isPay = false;
    RentalStatusDAO rentalStatusDAO = new RentalStatusDAO();
    Feature feature = new Feature();
    RenterDAO renterDAO = new RenterDAO();
    RoomDAO roomDAO = new RoomDAO();
    PaneAddRenter paneAddRenter;
    public AddRenterController(PaneAddRenter paneAddRenter) {
        this.paneAddRenter = paneAddRenter;
    }

    public AddRenterController() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //lay ngay hien tai de them vo ngay bat dau thue
        Calendar calendar = Calendar.getInstance();
        if(e.getSource() == paneAddRenter.getOptionGenderOAJcombobox())   {
            paneAddRenter.getInputGenderOA().setText((String) paneAddRenter.getOptionGenderOAJcombobox().getSelectedItem());
        }
        if(e.getSource() == paneAddRenter.getOptionRoomOAJcombobox())   {
            paneAddRenter.getInputIdPhongOA().setText((String) paneAddRenter.getOptionRoomOAJcombobox().getSelectedItem());
        }

        switch (e.getActionCommand()) {

            case "Add renter": {
                String idRenterStr = paneAddRenter.getInputIDRenterOA().getText();
                String surname = paneAddRenter.getInputSurnameOA().getText();
                String midlename = paneAddRenter.getInputMidlenameOA().getText();
                String name = paneAddRenter.getInputNameOA().getText();
                String numberPhone = paneAddRenter.getInputSdtOA().getText();
                String scccd = paneAddRenter.getInputScccdOA().getText();
                String birth = paneAddRenter.getInputBirthOA().getText();
                String gender = paneAddRenter.getInputGenderOA().getText();
                String rentedroomStr = paneAddRenter.getInputIdPhongOA().getText();
                String email = paneAddRenter.getInputEmailOA().getText();
                String payStr = "";

                // kiem tra da thanh toan tien tro hay chua
                if(isPay) {
                    payStr = "Paid";
                }
                else{
                    payStr = "Unpaid";
                }

                if( rentedroomStr.equals("") || surname.equals("") || midlename.equals("") || name.equals("") || email.equals("") || gender.equals("") || birth.equals("") || scccd.equals("") || numberPhone.equals("")) {
                    JOptionPane.showMessageDialog(null,"Enter infmation, please");
                }

                // chuyen doi kieu so lieu String sang Int
                int rentedroomInt = Integer.parseInt(rentedroomStr);
                int idRenterInt = Integer.parseInt(idRenterStr);

                //chuyen doi kieu du lieu ngay thue tu Calender sang Date
                Date rentalDay = calendar.getTime();


                try {
                    feature.checkValidityNumPhone(numberPhone);
                    feature.checkValiditySccd(scccd);
                    feature.checkValidityBirth(birth);

                    // chuyen doi kieu du lieu String sang date
                    Date dateBirth = feature.pareStringToDate(birth);
                    feature.checkAge(dateBirth);
                    feature.isEmptyIdRenter(idRenterInt);
                    feature.isValidityEmail(email);
                    feature.isExistEmail(email);

                    if (feature.isEmptyRoom(rentedroomInt)) {

                        //them nguoi thue
                         int resultAddRenter = renterDAO.add(new Renter(idRenterInt, rentedroomInt, surname, midlename, name, numberPhone, dateBirth, gender, scccd, email));

                        if (resultAddRenter > 0) {

                            // chinh sua tinh trang thue cua phong
                            int resultUpdateRoom = roomDAO.updateStatusRoom("Hired", rentedroomInt);

                            //them hop dong thue
                            int resultAddRentalStatus = rentalStatusDAO.add(new RentalStatus(idRenterInt, rentedroomInt, rentalDay, "Still rented", payStr));

                            if(resultUpdateRoom > 0 && resultAddRentalStatus > 0) {
                                JOptionPane.showMessageDialog(null, "Add success");

                                // gui mail thong bao da dang ky
                                String recipient = email;
                                String title = "verify email";
                                String content = "Hi " + name + "!!" + "\r\n" + " We send this email to inform you that you have registered to rent our accommodation with the following information: " + "\r\n" + "\r\n" +
                                        "Name: " + surname + " " + midlename + " " + name +"\r\n" +
                                        "ID: " + idRenterStr + "\r\n"+
                                        "Contact number: " + numberPhone + "\r\n" +
                                        "citizen number: " +  scccd + "\r\n" +
                                        "Date of birth: " + birth + "\r\n" +
                                        "Gender: " + gender + "\r\n" +
                                        "Room number: " + rentedroomStr + "\r\n" +
                                        "Pay for room: " + payStr + "\r\n" +
                                        "\r\n" +
                                        "thanks, " + "\r\n" +
                                        "Thuan";

                                feature.sendEmail(recipient,title,content);

                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Add failed");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Add failed");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "The room has been renter");
                    }
                }

                catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }


                break;
            }
            case "Paid": {
                isPay = true;
                break;
            }
            case "Unpaid": {
                isPay = false;
                break;
            }
        }

    }
    public void mouseClicked(MouseEvent e) {
        paneAddRenter.getInputIDRenterOA().setText(renterDAO.selectIDLastRow() + 1 + "");
    }


}
