package Controller.ManagerController;

import Controller.Feature.Feature;
import DAO.RentalStatusDAO;
import DAO.RenterDAO;
import DAO.RoomDAO;
import Model.Renter;
import View.ManagerView.PanelUpdateRenter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class UpdateInfRenterController implements ActionListener {
    RentalStatusDAO rentalStatusDAO = new RentalStatusDAO();
    Feature feature = new Feature();
    RenterDAO renterDAO = new RenterDAO();

    PanelUpdateRenter panelUpdateRenter ;

    public UpdateInfRenterController( PanelUpdateRenter panelUpdateRenter) {
        this.panelUpdateRenter = panelUpdateRenter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        //lay ngay hien tai de them vo ngay bat dau thue
        Calendar calendar = Calendar.getInstance();
        if(e.getSource() == panelUpdateRenter.getOptionGenderDAJcombobox())   {
            panelUpdateRenter.getInputGenderDA().setText((String) panelUpdateRenter.getOptionGenderDAJcombobox().getSelectedItem());
        }


        switch (e.getActionCommand()) {

            case "Search": {

                // chuyen doi kie du lieu tu String sang Date
               Date dateBirth = feature.pareStringToDate(panelUpdateRenter.getResultBirthSreachNameAndBirthDA().getText());

                ArrayList<Renter> listRenter = renterDAO.findByNameAndBirth(panelUpdateRenter.getResultNameSreachNameAndBirthDA().getText(),dateBirth);

                for (int index = 0; index < listRenter.size(); index++) {
                    if ("No longer rented".equals(rentalStatusDAO.checkRenter_status(listRenter.get(index).getIdRenter(), listRenter.get(index).getRentedRoom()))) {
                        listRenter.remove(index);
                        index--;
                    }
                }

                if (listRenter.size() > 1) {
                    JOptionPane.showMessageDialog(null, "There is more than 1 person, please enter ID to search");
                }
                else if (listRenter.size() == 1) {

                    panelUpdateRenter.getInputIDRenterDA().setText(listRenter.get(0).getIdRenter() + "");
                    panelUpdateRenter.getInputIRoomDA().setText(listRenter.get(0).getRentedRoom()+"");
                    panelUpdateRenter.getInputNameDA().setText(listRenter.get(0).getNameOfRenter());
                    panelUpdateRenter.getInputMidlenameDA().setText(listRenter.get(0).getMiddlenameOfRenter());
                    panelUpdateRenter.getInputSurnameDA().setText(listRenter.get(0).getSurnameOfRenter());
                    panelUpdateRenter.getInputBirthDA().setText(listRenter.get(0).getBirth() + "");
                    panelUpdateRenter.getInputSdtDA().setText(listRenter.get(0).getNumberOfPhone());
                    panelUpdateRenter.getInputScccdDA().setText(listRenter.get(0).getCitizenIdentificationCard());
                    panelUpdateRenter.getInputGenderDA().setText(listRenter.get(0).getGender());
                    panelUpdateRenter.getInputEmailDA().setText(listRenter.get(0).getEmail());

                } else {
                    JOptionPane.showMessageDialog(null, "Not found");
                }


                break;
            }

            case "Search by ID": {
                Renter  renter = renterDAO.findByID(panelUpdateRenter.getChoseeIdDA().getText());
                if (renter == null) {
                    JOptionPane.showMessageDialog(null, "No one owns ID is " + panelUpdateRenter.getChoseeIdDA().getText());
                }
                if("Still rented".equals(rentalStatusDAO.checkRenter_status(renter.getIdRenter(), renter.getRentedRoom()))){
                    panelUpdateRenter.getInputIDRenterDA().setText(renter.getIdRenter() + "");
                    panelUpdateRenter.getInputNameDA().setText(renter.getNameOfRenter());
                    panelUpdateRenter.getInputMidlenameDA().setText(renter.getMiddlenameOfRenter());
                    panelUpdateRenter.getInputSurnameDA().setText(renter.getSurnameOfRenter());
                    panelUpdateRenter.getInputIRoomDA().setText(renter.getRentedRoom()+"");
                    panelUpdateRenter.getInputBirthDA().setText(renter.getBirth() + "");
                    panelUpdateRenter.getInputSdtDA().setText(renter.getNumberOfPhone());
                    panelUpdateRenter.getInputScccdDA().setText(renter.getCitizenIdentificationCard());
                    panelUpdateRenter.getInputGenderDA().setText(renter.getGender());
                    panelUpdateRenter.getInputEmailDA().setText(renter.getEmail());

                }
                else{
                    JOptionPane.showMessageDialog(null,"ID dose not exist");
                }

                break;
            }
            case "Update Renter": {
                String idRenterStr = panelUpdateRenter.getInputIDRenterDA().getText();
                String surname = panelUpdateRenter.getInputSurnameDA().getText();
                String midlename = panelUpdateRenter.getInputMidlenameDA().getText();
                String name = panelUpdateRenter.getInputNameDA().getText();
                String numberPhone = panelUpdateRenter.getInputSdtDA().getText();
                String scccd = panelUpdateRenter.getInputScccdDA().getText();
                String birth = panelUpdateRenter.getInputBirthDA().getText();
                String gender = panelUpdateRenter.getInputGenderDA().getText();
                String rentedroomStr = panelUpdateRenter.getInputIRoomDA().getText();
                String email = panelUpdateRenter.getInputEmailDA().getText();


                // chuyen doi kieu so lieu String sang Int
                int idRenterInt = Integer.parseInt(idRenterStr);
                int rentedroomInt = Integer.parseInt(rentedroomStr);

                // chuyen doi kieu du lieu String sang date
                Date dateBirth = feature.pareStringToDate(birth);

                try {
                    Renter newRenter = renterDAO.findByID(idRenterStr);

                    // neu co thay doi scccd thi moi kiem tra
                    if(!newRenter.getCitizenIdentificationCard().equals(scccd)) {
                        feature.checkValiditySccd(scccd);
                    }

                    // neu co thay doi numberPhone thi moi kiem tra
                    if(!newRenter.getNumberOfPhone().equals(numberPhone)) {
                        feature.checkValidityNumPhone(numberPhone);
                    }

                    // neu co thay doi email thi moi kiem tra
                    if (!newRenter.getEmail().equals(email)) {
                        feature.isExistEmail(email);
                    }

                    feature.checkAge(dateBirth);
                    feature.isValidityEmail(email);



                        int resultAddRenter = renterDAO.update(new Renter(idRenterInt, rentedroomInt, surname, midlename, name, numberPhone, dateBirth, gender, scccd, email));

                        if (resultAddRenter > 0) {
                            JOptionPane.showMessageDialog(null, "Updadte success");
                        } else {
                            JOptionPane.showMessageDialog(null, "Update failed");
                        }

                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
                break;
            }

        }


    }
    }

