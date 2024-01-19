package Controller.ManagerController;

import Controller.Feature.Feature;
import DAO.RentalStatusDAO;
import DAO.RenterDAO;
import DAO.RoomDAO;
import Model.Renter;
import Model.Room;
import View.ManagerView.ManagerView;
import View.ManagerView.PaneInfRenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListInfRenterController implements ActionListener {
    Feature feature = new Feature();
    private RenterDAO renterDAO = new RenterDAO();
    private RoomDAO roomDAO = new RoomDAO();
    private RentalStatusDAO rentalStatusDAO = new RentalStatusDAO();
    private ArrayList<Renter> listRenter = new ArrayList<>();
    private ArrayList<Room> listRoomHired = new ArrayList<>();

    private PaneInfRenter paneInfRenter;

    public ListInfRenterController( PaneInfRenter paneInfRenter) {
        this.paneInfRenter = paneInfRenter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        listRenter = renterDAO.selectALL();

        switch (e.getActionCommand()) {
            case "Room 1": {
                // check xem thong tin co duoc tim thay khong
                boolean check = true;
                for(Renter renter : listRenter) {
                    if("Still rented".equals(rentalStatusDAO.checkRenter_status(renter.getIdRenter(),1))){
                        paneInfRenter.getLabelIDInformation().setText(renter.getIdRenter() + "");
                        paneInfRenter.getLabelNameInformation().setText(renter.getSurnameOfRenter() + " " + renter.getMiddlenameOfRenter() + " " + renter.getNameOfRenter());
                        paneInfRenter.getLabelBirthInformation().setText(renter.getBirth() + "");
                        paneInfRenter.getLabelNumberPhoneInformation().setText(renter.getNumberOfPhone());
                        paneInfRenter.getLabelScccdInformation().setText(renter.getCitizenIdentificationCard());
                        paneInfRenter.getLabelGenderinformation().setText(renter.getGender());
                        paneInfRenter.getLableEmailInformation().setText(renter.getEmail());


                        Room newRoom = roomDAO.selectByID(1);
                        if (newRoom != null) {
                            String price = newRoom.getPriceOfRoom() + "";
                            int lenght = price.length();
                            while (lenght > 3) {
                                lenght -= 3;
                                price = feature.insertString(price,".",lenght);
                            }
                            paneInfRenter.getLabelTextKindOfRoomInf().setText(newRoom.getKindOfRoom());
                            paneInfRenter.getLabelTextNameOfRoomInf().setText(newRoom.getNameOfRoom());
                            paneInfRenter.getLabelTextPriceOfRoomInf().setText(price+"VND");
                        }

                        check = false;
                        break;
                    }
                }
                if(check) {
                    paneInfRenter.getLabelIDInformation().setText("Id information");
                    paneInfRenter.getLabelNameInformation().setText("Full name information");
                    paneInfRenter.getLabelBirthInformation().setText("Birth information");
                    paneInfRenter.getLabelNumberPhoneInformation().setText("Contact number information");
                    paneInfRenter.getLabelScccdInformation().setText("citizen information");
                    paneInfRenter.getLabelGenderinformation().setText("Gender information");
                    paneInfRenter.getLableEmailInformation().setText("Email information");
                    paneInfRenter.getLabelTextKindOfRoomInf().setText("Kind of room information");
                    paneInfRenter.getLabelTextNameOfRoomInf().setText("Room name information");
                    paneInfRenter.getLabelTextPriceOfRoomInf().setText("Price of room information");

                }
                break;
            }
            case "Room 2": {
                boolean check = true;
                for(Renter renter : listRenter) {
                    if("Still rented".equals(rentalStatusDAO.checkRenter_status(renter.getIdRenter(),2))){
                        paneInfRenter.getLabelIDInformation().setText(renter.getIdRenter() + "");
                        paneInfRenter.getLabelNameInformation().setText(renter.getSurnameOfRenter() + " " + renter.getMiddlenameOfRenter() + " " + renter.getNameOfRenter());
                        paneInfRenter.getLabelBirthInformation().setText(renter.getBirth() + "");
                        paneInfRenter.getLabelNumberPhoneInformation().setText(renter.getNumberOfPhone());
                        paneInfRenter.getLabelScccdInformation().setText(renter.getCitizenIdentificationCard());
                        paneInfRenter.getLabelGenderinformation().setText(renter.getGender());
                        paneInfRenter.getLableEmailInformation().setText(renter.getEmail());

                        Room newRoom = roomDAO.selectByID(2);
                        if (newRoom != null) {
                            String price = newRoom.getPriceOfRoom() + "";
                            int lenght = price.length();
                            while (lenght > 3) {
                                lenght -= 3;
                                price = feature.insertString(price,".",lenght);
                            }
                            paneInfRenter.getLabelTextKindOfRoomInf().setText(newRoom.getKindOfRoom());
                            paneInfRenter.getLabelTextNameOfRoomInf().setText(newRoom.getNameOfRoom());
                            paneInfRenter.getLabelTextPriceOfRoomInf().setText(price+"VND");
                        }


                        check = false;
                        break;
                    }
                }
                if(check) {
                    paneInfRenter.getLabelIDInformation().setText("Id information");
                    paneInfRenter.getLabelNameInformation().setText("Full name information");
                    paneInfRenter.getLabelBirthInformation().setText("Birth information");
                    paneInfRenter.getLabelNumberPhoneInformation().setText("Contact number information");
                    paneInfRenter.getLabelScccdInformation().setText("citizen information");
                    paneInfRenter.getLabelGenderinformation().setText("Gender information");
                    paneInfRenter.getLableEmailInformation().setText("Email information");
                    paneInfRenter.getLabelTextKindOfRoomInf().setText("Kind of room information");
                    paneInfRenter.getLabelTextNameOfRoomInf().setText("Room name information");
                    paneInfRenter.getLabelTextPriceOfRoomInf().setText("Price of room information");
                }
                break;
            }
            case "Room 3": {
                boolean check = true;
                for(Renter renter : listRenter) {
                    if("Still rented".equals(rentalStatusDAO.checkRenter_status(renter.getIdRenter(),3))){
                        paneInfRenter.getLabelIDInformation().setText(renter.getIdRenter() + "");
                        paneInfRenter.getLabelNameInformation().setText(renter.getSurnameOfRenter() + " " + renter.getMiddlenameOfRenter() + " " + renter.getNameOfRenter());
                        paneInfRenter.getLabelBirthInformation().setText(renter.getBirth() + "");
                        paneInfRenter.getLabelNumberPhoneInformation().setText(renter.getNumberOfPhone());
                        paneInfRenter.getLabelScccdInformation().setText(renter.getCitizenIdentificationCard());
                        paneInfRenter.getLabelGenderinformation().setText(renter.getGender());
                        paneInfRenter.getLableEmailInformation().setText(renter.getEmail());

                        Room newRoom = roomDAO.selectByID(3);
                        if (newRoom != null) {
                            String price = newRoom.getPriceOfRoom() + "";
                            int lenght = price.length();
                            while (lenght > 3) {
                                lenght -= 3;
                                price = feature.insertString(price,".",lenght);
                            }
                            paneInfRenter.getLabelTextKindOfRoomInf().setText(newRoom.getKindOfRoom());
                            paneInfRenter.getLabelTextNameOfRoomInf().setText(newRoom.getNameOfRoom());
                            paneInfRenter.getLabelTextPriceOfRoomInf().setText(price+"VND");
                        }



                        check = false;
                        break;
                    }
                }
                if(check) {
                    paneInfRenter.getLabelIDInformation().setText("Id information");
                    paneInfRenter.getLabelNameInformation().setText("Full name information");
                    paneInfRenter.getLabelBirthInformation().setText("Birth information");
                    paneInfRenter.getLabelNumberPhoneInformation().setText("Contact number information");
                    paneInfRenter.getLabelScccdInformation().setText("citizen information");
                    paneInfRenter.getLabelGenderinformation().setText("Gender information");
                    paneInfRenter.getLableEmailInformation().setText("Email information");
                    paneInfRenter.getLabelTextKindOfRoomInf().setText("Kind of room information");
                    paneInfRenter.getLabelTextNameOfRoomInf().setText("Room name information");
                    paneInfRenter.getLabelTextPriceOfRoomInf().setText("Price of room information");
                }
                break;
            }
            case "Room 4": {
                boolean check = true;
                for(Renter renter : listRenter) {
                    if("Still rented".equals(rentalStatusDAO.checkRenter_status(renter.getIdRenter(),4))){
                        paneInfRenter.getLabelIDInformation().setText(renter.getIdRenter() + "");
                        paneInfRenter.getLabelNameInformation().setText(renter.getSurnameOfRenter() + " " + renter.getMiddlenameOfRenter() + " " + renter.getNameOfRenter());
                        paneInfRenter.getLabelBirthInformation().setText(renter.getBirth() + "");
                        paneInfRenter.getLabelNumberPhoneInformation().setText(renter.getNumberOfPhone());
                        paneInfRenter.getLabelScccdInformation().setText(renter.getCitizenIdentificationCard());
                        paneInfRenter.getLabelGenderinformation().setText(renter.getGender());
                        paneInfRenter.getLableEmailInformation().setText(renter.getEmail());


                        Room newRoom = roomDAO.selectByID(4);
                        if (newRoom != null) {
                            String price = newRoom.getPriceOfRoom() + "";
                            int lenght = price.length();
                            while (lenght > 3) {
                                lenght -= 3;
                                price = feature.insertString(price,".",lenght);
                            }
                            paneInfRenter.getLabelTextKindOfRoomInf().setText(newRoom.getKindOfRoom());
                            paneInfRenter.getLabelTextNameOfRoomInf().setText(newRoom.getNameOfRoom());
                            paneInfRenter.getLabelTextPriceOfRoomInf().setText(price+"VND");
                        }



                        check = false;
                        break;
                    }
                }
                if(check) {
                    paneInfRenter.getLabelIDInformation().setText("Id information");
                    paneInfRenter.getLabelNameInformation().setText("Full name information");
                    paneInfRenter.getLabelBirthInformation().setText("Birth information");
                    paneInfRenter.getLabelNumberPhoneInformation().setText("Contact number information");
                    paneInfRenter.getLabelScccdInformation().setText("citizen information");
                    paneInfRenter.getLabelGenderinformation().setText("Gender information");
                    paneInfRenter.getLableEmailInformation().setText("Email information");
                    paneInfRenter.getLabelTextKindOfRoomInf().setText("Kind of room information");
                    paneInfRenter.getLabelTextNameOfRoomInf().setText("Room name information");
                    paneInfRenter.getLabelTextPriceOfRoomInf().setText("Price of room information");
                }
                break;
            }
            case "Room 5": {
                boolean check = true;
                for(Renter renter : listRenter) {
                    if("Still rented".equals(rentalStatusDAO.checkRenter_status(renter.getIdRenter(),5))){
                        paneInfRenter.getLabelIDInformation().setText(renter.getIdRenter() + "");
                        paneInfRenter.getLabelNameInformation().setText(renter.getSurnameOfRenter() + " " + renter.getMiddlenameOfRenter() + " " + renter.getNameOfRenter());
                        paneInfRenter.getLabelBirthInformation().setText(renter.getBirth() + "");
                        paneInfRenter.getLabelNumberPhoneInformation().setText(renter.getNumberOfPhone());
                        paneInfRenter.getLabelScccdInformation().setText(renter.getCitizenIdentificationCard());
                        paneInfRenter.getLabelGenderinformation().setText(renter.getGender());
                        paneInfRenter.getLableEmailInformation().setText(renter.getEmail());


                        Room newRoom = roomDAO.selectByID(5);
                        if (newRoom != null) {
                            String price = newRoom.getPriceOfRoom() + "";
                            int lenght = price.length();
                            while (lenght > 3) {
                                lenght -= 3;
                                price = feature.insertString(price,".",lenght);
                            }
                            paneInfRenter.getLabelTextKindOfRoomInf().setText(newRoom.getKindOfRoom());
                            paneInfRenter.getLabelTextNameOfRoomInf().setText(newRoom.getNameOfRoom());
                            paneInfRenter.getLabelTextPriceOfRoomInf().setText(price+"VND");
                        }



                        check = false;
                        break;
                    }
                }
                if(check) {
                    paneInfRenter.getLabelIDInformation().setText("Id information");
                    paneInfRenter.getLabelNameInformation().setText("Full name information");
                    paneInfRenter.getLabelBirthInformation().setText("Birth information");
                    paneInfRenter.getLabelNumberPhoneInformation().setText("Contact number information");
                    paneInfRenter.getLabelScccdInformation().setText("citizen information");
                    paneInfRenter.getLabelGenderinformation().setText("Gender information");
                    paneInfRenter.getLableEmailInformation().setText("Email information");
                    paneInfRenter.getLabelTextKindOfRoomInf().setText("Kind of room information");
                    paneInfRenter.getLabelTextNameOfRoomInf().setText("Room name information");
                    paneInfRenter.getLabelTextPriceOfRoomInf().setText("Price of room information");
                }
                break;
            }
            case "Room 6": {
                boolean check = true;
                for(Renter renter : listRenter) {
                    if("Still rented".equals(rentalStatusDAO.checkRenter_status(renter.getIdRenter(),6))){
                        paneInfRenter.getLabelIDInformation().setText(renter.getIdRenter() + "");
                        paneInfRenter.getLabelNameInformation().setText(renter.getSurnameOfRenter() + " " + renter.getMiddlenameOfRenter() + " " + renter.getNameOfRenter());
                        paneInfRenter.getLabelBirthInformation().setText(renter.getBirth() + "");
                        paneInfRenter.getLabelNumberPhoneInformation().setText(renter.getNumberOfPhone());
                        paneInfRenter.getLabelScccdInformation().setText(renter.getCitizenIdentificationCard());
                        paneInfRenter.getLabelGenderinformation().setText(renter.getGender());
                        paneInfRenter.getLableEmailInformation().setText(renter.getEmail());


                        Room newRoom = roomDAO.selectByID(6);
                        if (newRoom != null) {
                            String price = newRoom.getPriceOfRoom() + "";
                            int lenght = price.length();
                            while (lenght > 3) {
                                lenght -= 3;
                                price = feature.insertString(price,".",lenght);
                            }
                            paneInfRenter.getLabelTextKindOfRoomInf().setText(newRoom.getKindOfRoom());
                            paneInfRenter.getLabelTextNameOfRoomInf().setText(newRoom.getNameOfRoom());
                            paneInfRenter.getLabelTextPriceOfRoomInf().setText(price+"VND");
                        }
                        check = false;
                        break;
                    }
                }
                if(check) {
                    paneInfRenter.getLabelIDInformation().setText("Id information");
                    paneInfRenter.getLabelNameInformation().setText("Full name information");
                    paneInfRenter.getLabelBirthInformation().setText("Birth information");
                    paneInfRenter.getLabelNumberPhoneInformation().setText("Contact number information");
                    paneInfRenter.getLabelScccdInformation().setText("citizen information");
                    paneInfRenter.getLabelGenderinformation().setText("Gender information");
                    paneInfRenter.getLableEmailInformation().setText("Email information");
                    paneInfRenter.getLabelTextKindOfRoomInf().setText("Kind of room information");
                    paneInfRenter.getLabelTextNameOfRoomInf().setText("Room name information");
                    paneInfRenter.getLabelTextPriceOfRoomInf().setText("Price of room information");
                }
                break;
            }
            case "Room 7": {
                boolean check = true;
                for(Renter renter : listRenter) {
                    if("Still rented".equals(rentalStatusDAO.checkRenter_status(renter.getIdRenter(),7))){
                        paneInfRenter.getLabelIDInformation().setText(renter.getIdRenter() + "");
                        paneInfRenter.getLabelNameInformation().setText(renter.getSurnameOfRenter() + " " + renter.getMiddlenameOfRenter() + " " + renter.getNameOfRenter());
                        paneInfRenter.getLabelBirthInformation().setText(renter.getBirth() + "");
                        paneInfRenter.getLabelNumberPhoneInformation().setText(renter.getNumberOfPhone());
                        paneInfRenter.getLabelScccdInformation().setText(renter.getCitizenIdentificationCard());
                        paneInfRenter.getLabelGenderinformation().setText(renter.getGender());
                        paneInfRenter.getLableEmailInformation().setText(renter.getEmail());


                        Room newRoom = roomDAO.selectByID(7);
                        if (newRoom != null) {
                            String price = newRoom.getPriceOfRoom() + "";
                            int lenght = price.length();
                            while (lenght > 3) {
                                lenght -= 3;
                                price = feature.insertString(price,".",lenght);
                            }
                            paneInfRenter.getLabelTextKindOfRoomInf().setText(newRoom.getKindOfRoom());
                            paneInfRenter.getLabelTextNameOfRoomInf().setText(newRoom.getNameOfRoom());
                            paneInfRenter.getLabelTextPriceOfRoomInf().setText(price+"VND");
                        }


                        check = false;
                        break;
                    }
                }
                if(check) {
                    paneInfRenter.getLabelIDInformation().setText("Id information");
                    paneInfRenter.getLabelNameInformation().setText("Full name information");
                    paneInfRenter.getLabelBirthInformation().setText("Birth information");
                    paneInfRenter.getLabelNumberPhoneInformation().setText("Contact number information");
                    paneInfRenter.getLabelScccdInformation().setText("citizen information");
                    paneInfRenter.getLabelGenderinformation().setText("Gender information");
                    paneInfRenter.getLableEmailInformation().setText("Email information");
                    paneInfRenter.getLabelTextKindOfRoomInf().setText("Kind of room information");
                    paneInfRenter.getLabelTextNameOfRoomInf().setText("Room name information");
                    paneInfRenter.getLabelTextPriceOfRoomInf().setText("Price of room information");
                }
                break;
            }
            default: {
                boolean check = true;
                for(Renter renter : listRenter) {
                    if("Still rented".equals(rentalStatusDAO.checkRenter_status(renter.getIdRenter(),8))){
                        paneInfRenter.getLabelIDInformation().setText(renter.getIdRenter() + "");
                        paneInfRenter.getLabelNameInformation().setText(renter.getSurnameOfRenter() + " " + renter.getMiddlenameOfRenter() + " " + renter.getNameOfRenter());
                        paneInfRenter.getLabelBirthInformation().setText(renter.getBirth() + "");
                        paneInfRenter.getLabelNumberPhoneInformation().setText(renter.getNumberOfPhone());
                        paneInfRenter.getLabelScccdInformation().setText(renter.getCitizenIdentificationCard());
                        paneInfRenter.getLabelGenderinformation().setText(renter.getGender());
                        paneInfRenter.getLableEmailInformation().setText(renter.getEmail());


                        Room newRoom = roomDAO.selectByID(8);
                        if (newRoom != null) {
                            String price = newRoom.getPriceOfRoom() + "";
                            int lenght = price.length();
                            while (lenght > 3) {
                                lenght -= 3;
                                price = feature.insertString(price,".",lenght);
                            }
                            paneInfRenter.getLabelTextKindOfRoomInf().setText(newRoom.getKindOfRoom());
                            paneInfRenter.getLabelTextNameOfRoomInf().setText(newRoom.getNameOfRoom());
                            paneInfRenter.getLabelTextPriceOfRoomInf().setText(price+"VND");
                        }



                        check = false;
                        break;
                    }
                }
                if(check) {
                    paneInfRenter.getLabelIDInformation().setText("Id information");
                    paneInfRenter.getLabelNameInformation().setText("Full name information");
                    paneInfRenter.getLabelBirthInformation().setText("Birth information");
                    paneInfRenter.getLabelNumberPhoneInformation().setText("Contact number information");
                    paneInfRenter.getLabelScccdInformation().setText("citizen information");
                    paneInfRenter.getLabelGenderinformation().setText("Gender information");
                    paneInfRenter.getLableEmailInformation().setText("Email information");
                    paneInfRenter.getLabelTextKindOfRoomInf().setText("Kind of room information");
                    paneInfRenter.getLabelTextNameOfRoomInf().setText("Room name information");
                    paneInfRenter.getLabelTextPriceOfRoomInf().setText("Price of room information");
                }
                break;
            }
        }
    }
}
