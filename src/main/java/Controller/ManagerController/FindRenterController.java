package Controller.ManagerController;

import Controller.Feature.Feature;
import DAO.RentalStatusDAO;
import DAO.RenterDAO;
import DAO.RoomDAO;
import Model.Renter;
import View.ManagerView.PaneFindRenter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class FindRenterController implements ActionListener {

    int index = 0;   // vi tri phan tu hien tai trong mang listRenter


    boolean checkFormSearch ;  // false is search by id, true is search by name or birth

    RentalStatusDAO rentalStatusDAO = new RentalStatusDAO();
    Feature feature = new Feature();
    RenterDAO renterDAO = new RenterDAO();

    ArrayList<Renter> listRenterShow ;
    PaneFindRenter findRenter;

    public FindRenterController  (  PaneFindRenter findRenter) {
        this.findRenter = findRenter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {

            case "Search": {
                // false is search by id, true is search by name or birth
                checkFormSearch = true;

                // chuyen doi kieu du lieu tu String sang Date
                Date dateBirth = feature.pareStringToDate(findRenter.getResultBirthSreachNameAndBirthFD().getText());

                ArrayList<Renter> listRenter = renterDAO.findByNameAndBirth(findRenter.getResultNameSreachNameAndBirthFD().getText(), dateBirth);
                if(listRenter == null) {
                    JOptionPane.showMessageDialog(null,"Not found");
                }

                else {

                    // loc ra cac renter con thue tro
                    for (index = 0; index < listRenter.size(); index++) {
                        if ("No longer rented".equals(rentalStatusDAO.checkRenter_status( listRenter.get(index).getIdRenter(), listRenter.get(index).getRentedRoom()))) {
                            listRenter.remove(index);
                            index--;
                        }

                    }

                    listRenterShow = listRenter;

                    // cap nhat lai vi tri phan tu trong mang
                    index = 0;

                    // xuat thong tin ra man hinh
                    if(index  <= listRenter.size()-1) {
                        showNextInf(listRenter,index);
                    }

                }
                break;
            }


            case "Search by ID": {
                Renter  renter = renterDAO.findByID(findRenter.getChoseeIdFD().getText());

                // false is search by id, true is search by name or birth
                checkFormSearch  = false;

                if (renter == null) {
                    JOptionPane.showMessageDialog(null, "No one owns ID is " + findRenter.getChoseeIdFD().getText());
                }

                // kiem tra xem nguoi thue con dang thue hay khong
                if("Still rented".equals(rentalStatusDAO.checkRenter_status(renter.getIdRenter(), renter.getRentedRoom()))){

                    findRenter.getShowIDRenterFD().setText(renter.getIdRenter() + "");
                    findRenter.getShowIdRoomFD().setText(renter.getRentedRoom()+"");
                    findRenter.getShowNameFD().setText(renter.getNameOfRenter());
                    findRenter.getShowMiddlenameFD().setText(renter.getMiddlenameOfRenter());
                    findRenter.getShowSurnameFD().setText(renter.getSurnameOfRenter());
                    findRenter.getShowBirthFD().setText(renter.getBirth() + "");
                    findRenter.getShowSdtFD().setText(renter.getNumberOfPhone());
                    findRenter.getShowScccdFD().setText(renter.getCitizenIdentificationCard());
                    findRenter.getShowGenderFD().setText(renter.getGender());
                    findRenter.getShowEmailFD().setText(renter.getEmail());

                    // xoa du lieu bang tiep theo vi tim id chi ra 1 nguoi
                    findRenter.getShowIDRenter1FD().setText("Id renter information");
                    findRenter.getShowIdRoom1FD().setText("Id room information");
                    findRenter.getShowName1FD().setText("Name information");
                    findRenter.getShowMiddlename1FD().setText("Middle name information");
                    findRenter.getShowSurname1FD().setText("Surname information");
                    findRenter.getShowBirth1FD().setText("Birth information");
                    findRenter.getShowSdt1FD().setText("Contact number information");
                    findRenter.getShowScccd1FD().setText("Citizen information");
                    findRenter.getShowGender1FD().setText("Gender information");
                    findRenter.getShowEmail1FD().setText("Email information");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Renter not exist");
                }


                break;
            }

            case "Next":{
                if (checkFormSearch) {
                    // vi da in ra phan tu o vi tri index nen ta phai tang index len 1
                    index++;

                    // kiem tra xem con du lieu  chua duoc in ra man hinh hay khong
                    if (index <= listRenterShow.size() -1) {
                        showNextInf(listRenterShow,index);
                    }
                    else{
                        // neu khong next duoc thi tra lai vi tri phan tu ban dau
                        index--;

                        JOptionPane.showMessageDialog(null,"Can't next");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Can't next");
                }



                break;
            }
            case "Back" : {
                // moi lan next duoc 2 phan tu nen phai lui lai 2 phan tu, va vi muon in ra theo thu tu nhu ban dau nen phai tru them 2, vi mang bat dau o vi tri 0 ne ta chi tru di 3
                index -= 3;
                if(index >= 0) {
                    showBackInf(listRenterShow,index);
                }
                else{
                    // neu khong back duoc thi tra lai vi tri phan tu ban dau
                    index += 3;
                    JOptionPane.showMessageDialog(null,"Can't back");
                }


            }
        }

    }

    public void showNextInf(ArrayList<Renter> listRenter,int indexNext){

        findRenter.getShowIDRenterFD().setText(listRenter.get(indexNext).getIdRenter() + "");
        findRenter.getShowIdRoomFD().setText(listRenter.get(indexNext).getRentedRoom() + "");
        findRenter.getShowNameFD().setText(listRenter.get(indexNext).getNameOfRenter());
        findRenter.getShowMiddlenameFD().setText(listRenter.get(indexNext).getMiddlenameOfRenter());
        findRenter.getShowSurnameFD().setText(listRenter.get(indexNext).getSurnameOfRenter());
        findRenter.getShowBirthFD().setText(listRenter.get(indexNext).getBirth() + "");
        findRenter.getShowSdtFD().setText(listRenter.get(indexNext).getNumberOfPhone());
        findRenter.getShowScccdFD().setText(listRenter.get(indexNext).getCitizenIdentificationCard());
        findRenter.getShowGenderFD().setText(listRenter.get(indexNext).getGender());
        findRenter.getShowEmailFD().setText(listRenter.get(indexNext).getEmail());

        indexNext++;
        index++;

        if(indexNext  <= listRenter.size()-1) {
            findRenter.getShowIDRenter1FD().setText(listRenter.get(indexNext).getIdRenter() + "");
            findRenter.getShowIdRoom1FD().setText(listRenter.get(indexNext).getRentedRoom() + "");
            findRenter.getShowName1FD().setText(listRenter.get(indexNext).getNameOfRenter());
            findRenter.getShowMiddlename1FD().setText(listRenter.get(indexNext).getMiddlenameOfRenter());
            findRenter.getShowSurname1FD().setText(listRenter.get(indexNext).getSurnameOfRenter());
            findRenter.getShowBirth1FD().setText(listRenter.get(indexNext).getBirth() + "");
            findRenter.getShowSdt1FD().setText(listRenter.get(indexNext).getNumberOfPhone());
            findRenter.getShowScccd1FD().setText(listRenter.get(indexNext).getCitizenIdentificationCard());
            findRenter.getShowGender1FD().setText(listRenter.get(indexNext).getGender());
            findRenter.getShowEmail1FD().setText(listRenter.get(indexNext).getEmail());
        }
        else{
            findRenter.getShowIDRenter1FD().setText("Id renter information");
            findRenter.getShowIdRoom1FD().setText("Id room information");
            findRenter.getShowName1FD().setText("Name information");
            findRenter.getShowMiddlename1FD().setText("Middle name information");
            findRenter.getShowSurname1FD().setText("Surname information");
            findRenter.getShowBirth1FD().setText("Birth information");
            findRenter.getShowSdt1FD().setText("Contact number information");
            findRenter.getShowScccd1FD().setText("Citizen information");
            findRenter.getShowGender1FD().setText("Gender information");
            findRenter.getShowEmail1FD().setText("Email information");

        }


    }
    public void showBackInf(ArrayList<Renter> listRenter,int indexBack){

        findRenter.getShowIDRenterFD().setText(listRenter.get(indexBack).getIdRenter() + "");
        findRenter.getShowIdRoomFD().setText(listRenter.get(indexBack).getRentedRoom() + "");
        findRenter.getShowNameFD().setText(listRenter.get(indexBack).getNameOfRenter());
        findRenter.getShowMiddlenameFD().setText(listRenter.get(indexBack).getMiddlenameOfRenter());
        findRenter.getShowSurnameFD().setText(listRenter.get(indexBack).getSurnameOfRenter());
        findRenter.getShowBirthFD().setText(listRenter.get(indexBack).getBirth() + "");
        findRenter.getShowSdtFD().setText(listRenter.get(indexBack).getNumberOfPhone());
        findRenter.getShowScccdFD().setText(listRenter.get(indexBack).getCitizenIdentificationCard());
        findRenter.getShowGenderFD().setText(listRenter.get(indexBack).getGender());
        findRenter.getShowEmailFD().setText(listRenter.get(indexBack).getEmail());

        indexBack++;

        index++;

        if(indexBack <= listRenter.size()-1) {
            findRenter.getShowIDRenter1FD().setText(listRenter.get(indexBack).getIdRenter() + "");
            findRenter.getShowIdRoom1FD().setText(listRenter.get(indexBack).getRentedRoom() + "");
            findRenter.getShowName1FD().setText(listRenter.get(indexBack).getNameOfRenter());
            findRenter.getShowMiddlename1FD().setText(listRenter.get(indexBack).getMiddlenameOfRenter());
            findRenter.getShowSurname1FD().setText(listRenter.get(indexBack).getSurnameOfRenter());
            findRenter.getShowBirth1FD().setText(listRenter.get(indexBack).getBirth() + "");
            findRenter.getShowSdt1FD().setText(listRenter.get(indexBack).getNumberOfPhone());
            findRenter.getShowScccd1FD().setText(listRenter.get(indexBack).getCitizenIdentificationCard());
            findRenter.getShowGender1FD().setText(listRenter.get(indexBack).getGender());
            findRenter.getShowEmail1FD().setText(listRenter.get(indexBack).getEmail());
        }
        else{
            findRenter.getShowIDRenter1FD().setText("Id renter information");
            findRenter.getShowIdRoom1FD().setText("Id room information");
            findRenter.getShowName1FD().setText("Name information");
            findRenter.getShowMiddlename1FD().setText("Middle name information");
            findRenter.getShowSurname1FD().setText("Surname information");
            findRenter.getShowBirth1FD().setText("Birth information");
            findRenter.getShowSdt1FD().setText("Contact number information");
            findRenter.getShowScccd1FD().setText("Citizen information");
            findRenter.getShowGender1FD().setText("Gender information");
            findRenter.getShowEmail1FD().setText("Email information");

        }


    }
}







