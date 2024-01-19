package Controller.ManagerController;

import Controller.Feature.Feature;
import DAO.RentalStatusDAO;
import DAO.RenterDAO;
import DAO.RoomDAO;
import Model.Renter;
import View.ManagerView.PaneDeleteRenter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class DeleteRenterController implements ActionListener {
    RentalStatusDAO rentalStatusDAO = new RentalStatusDAO();
    Feature feature = new Feature();
    RenterDAO renterDAO = new RenterDAO();
    RoomDAO roomDAO = new RoomDAO();
    PaneDeleteRenter deleteRenter ;

    public DeleteRenterController( PaneDeleteRenter deleteRenter) {
        this.deleteRenter = deleteRenter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {

            case "Search": {

                // chuyen doi kie du lieu tu String sang Date
                Date dateBirth = feature.pareStringToDate(deleteRenter.getResultBirthSreachNameAndBirthDL().getText());

                ArrayList<Renter> listRenter = renterDAO.findByNameAndBirth(deleteRenter.getResultNameSreachNameAndBirthDL().getText(), dateBirth);
                if(listRenter == null) {
                    JOptionPane.showMessageDialog(null,"Not found");
                }

                else {
                    for (int index = 0; index < listRenter.size(); index++) {
                        if ("No longer rented".equals(rentalStatusDAO.checkRenter_status(listRenter.get(index).getIdRenter(), listRenter.get(index).getRentedRoom()))) {
                            listRenter.remove(index);
                            index--;

                        }
                    }
                    if (listRenter.size() > 1) {
                        JOptionPane.showMessageDialog(null, "There is more than 1 person, please enter ID to search");
                    } else if (listRenter.size() == 1) {

                        deleteRenter.getShowIDRenterDL().setText(listRenter.get(0).getIdRenter() + "");
                        deleteRenter.getShowIdRoomDL().setText(listRenter.get(0).getRentedRoom() + "");
                        deleteRenter.getShowNameDL().setText(listRenter.get(0).getNameOfRenter());
                        deleteRenter.getShowMidlenameDL().setText(listRenter.get(0).getMiddlenameOfRenter());
                        deleteRenter.getShowSurnameDL().setText(listRenter.get(0).getSurnameOfRenter());
                        deleteRenter.getShowBirthDL().setText(listRenter.get(0).getBirth() + "");
                        deleteRenter.getShowSdtDL().setText(listRenter.get(0).getNumberOfPhone());
                        deleteRenter.getShowScccdDL().setText(listRenter.get(0).getCitizenIdentificationCard());
                        deleteRenter.getShowGenderDL().setText(listRenter.get(0).getGender());
                        deleteRenter.getShowEmailDL().setText(listRenter.get(0).getEmail());
                    } else {
                        JOptionPane.showMessageDialog(null, "Not found");
                    }
                }
                break;
            }

            case "Search by ID": {
                Renter  renter = renterDAO.findByID(deleteRenter.getChoseeIdDL().getText());
                if (renter == null) {
                    JOptionPane.showMessageDialog(null, "No one owns ID is " + deleteRenter.getChoseeIdDL().getText());
                }

                // kiem tra xem nguoi thue con dang thue hay khong
                if("Still rented".equals(rentalStatusDAO.checkRenter_status(renter.getIdRenter(), renter.getRentedRoom()))){
                    deleteRenter.getShowIDRenterDL().setText(renter.getIdRenter() + "");
                    deleteRenter.getShowIdRoomDL().setText(renter.getRentedRoom() + "");
                    deleteRenter.getShowNameDL().setText(renter.getNameOfRenter());
                    deleteRenter.getShowMidlenameDL().setText(renter.getMiddlenameOfRenter());
                    deleteRenter.getShowSurnameDL().setText(renter.getSurnameOfRenter());
                    deleteRenter.getShowBirthDL().setText(renter.getBirth() + "");
                    deleteRenter.getShowSdtDL().setText(renter.getNumberOfPhone());
                    deleteRenter.getShowScccdDL().setText(renter.getCitizenIdentificationCard());
                    deleteRenter.getShowGenderDL().setText(renter.getGender());
                    deleteRenter.getShowEmailDL().setText(renter.getEmail());
                }
                else{
                    JOptionPane.showMessageDialog(null,"Renter not exist");
                }


                break;
            }
            case "Delete Renter": {
                String idRenterStr = deleteRenter.getShowIDRenterDL().getText();
                String surname = deleteRenter.getShowSurnameDL().getText();
                String midlename = deleteRenter.getShowMidlenameDL().getText();
                String name = deleteRenter.getShowNameDL().getText();
                String numberPhone = deleteRenter.getShowSdtDL().getText();
                String scccd = deleteRenter.getShowScccdDL().getText();
                String birth = deleteRenter.getShowBirthDL().getText();
                String gender = deleteRenter.getShowGenderDL().getText();
                String rentedroomStr = deleteRenter.getShowIdRoomDL().getText();
                String email = deleteRenter.getShowEmailDL().getText();

                Date dateBirth = feature.pareStringToDate(birth);

                Renter renter = new Renter(Integer.parseInt(idRenterStr),Integer.parseInt(rentedroomStr),surname,midlename,name,numberPhone,dateBirth,gender,scccd,email);

                // xoa thi chi can cap nhat lai thong tin da thue hay chua thue cua phong tro va khong con thue hay con thue cua renter_status
                int checkPerformRoom = roomDAO.updateStatusRoom("Still empty", renter.getRentedRoom());
                int checkPerformRenter_Status = rentalStatusDAO.updateSatus("No longer rented",renter.getRentedRoom(),renter.getIdRenter());
                if (checkPerformRoom > 0 && checkPerformRenter_Status > 0) {
                    JOptionPane.showMessageDialog(null, "Delete success");
                } else {
                    JOptionPane.showMessageDialog(null, "Delete failed");
                }
            }
        }

    }


}

