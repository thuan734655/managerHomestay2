package Controller.ManagerController;

import Controller.Feature.Feature;
import DAO.BillDAO;
import DAO.RenterDAO;
import Model.Bill;
import Model.Renter;
import View.ManagerView.PanePayBill;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PayBillController implements ActionListener {
    int index = 0;  // vi tri cua listBillUnpaid
    int indexCurrent = 0 ; // vi tri hien tai cua mang
    PanePayBill panePayBill;
    BillDAO billDAO = new BillDAO();
    RenterDAO renterDAO = new RenterDAO();
    Feature feature = new Feature();
    public PayBillController(PanePayBill panePayBill) {
        this.panePayBill = panePayBill;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       switch (e.getActionCommand()) {
           case "Search": {

                   int idBill = Integer.parseInt(panePayBill.getEnterIDBillPB().getText());

                   Bill bill = billDAO.selectByIDBill(idBill);

                  if(bill != null ) {
                      Renter renter = renterDAO.findByID(bill.getIdRenter() + "");

                      panePayBill.getShowIdBillPB().setText(bill.getIdBill() +"");
                      panePayBill.getShowIDRenterPB().setText(bill.getIdRenter() + "");
                      panePayBill.getShowIdRoomPB().setText(bill.getIdRoom() + "");
                      panePayBill.getShowEmailPB().setText(renter.getEmail());
                      panePayBill.getShowNamePB().setText(renter.getSurnameOfRenter() + " " + renter.getMiddlenameOfRenter() + " " + renter.getNameOfRenter());
                      panePayBill.getShowDataCreateBillPB().setText(bill.getDateCreateBill() +"" );
                      panePayBill.getShowElectricityNunberPB().setText(bill.getNumberOfElectricity() +"");
                      panePayBill.getShowCubicOfWaterPB().setText(bill.getNumberOfCubicWater() +"");
                      panePayBill.getShowMoneyToPay().setText(bill.getMoneyToPay() + "");
                      formatMoney(bill.getMoneyToPay()+"");
                  }
                  else {
                      JOptionPane.showMessageDialog(null,"Not found");
                  }

               break;
           }
           case "Paid bill": {
               int idBill = Integer.parseInt(panePayBill.getShowIdBillPB().getText());
              int result = billDAO.updateStatusPay(idBill,"Paid");
               if(result > 0) {
                   JOptionPane.showMessageDialog(null,"Pay to bill success");
               }
               else {
                   JOptionPane.showMessageDialog(null,"Pay to bill fail");
               }
               break;
           }
           case "Reload" : {
               ArrayList<Bill> listBillUnpaid = billDAO.selectListBillUnpaid();
               index = 0;
               for(int i = 0; i < 7; i++) {
                   if(index < listBillUnpaid.size()) {
                       showIdBillUnpaid(listBillUnpaid,index,i);
                   }
                   else {
                       reShowIdBillUnpaid(i);
                   }
                   index++;
               }
               index--; //vi no se bi cong du them 1 lan trong vong for
               break;
           }
           case "Next": {
               ArrayList<Bill> listBillUnpaid = billDAO.selectListBillUnpaid();

               index++; // check xem con co bill nao chua duoc show hayhong

               if(index < listBillUnpaid.size() ) {
                   for(int i = 0; i < 7; i++) {
                       if(index < listBillUnpaid.size()) {
                           showIdBillUnpaid(listBillUnpaid,index,i);
                       }
                       else {
                           reShowIdBillUnpaid(i);
                       }
                       index++;
                   }
                   index--; //vi no se bi cong du them 1 lan trong vong for
               }
               else{
                   index--;
                   JOptionPane.showMessageDialog(null,"Can't next");
               }
               break;
           }
           case "Back": {
               ArrayList<Bill> listBillUnpaid = billDAO.selectListBillUnpaid();

               index -= 13;  // vi muon quay lai vi tri dau tien cua lan show truoc do nen -13

               // check xem co back duoc nua khong
               if(index >= 0) {
                   for(int i = 0; i < 7; i++) {
                       if(index < listBillUnpaid.size()) {
                           showIdBillUnpaid(listBillUnpaid,index,i);
                       }

                       index++;
                   }
                   index--; //vi no se bi cong du them 1 lan trong vong for
               }
               else{
                   index+=13;
                   JOptionPane.showMessageDialog(null,"Can't next");
               }
               break;
           }
           case "Delete bill" : {
                int idBill = Integer.parseInt( panePayBill.getShowIdBillPB().getText());

                int result = billDAO.deleteById(idBill);

                if(result > 0) {
                    JOptionPane.showMessageDialog(null,"Delete success");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Delete fail");
                }
               break;
           }
       }
       }
    public String formatMoney(String moneyStr) {
        int length = moneyStr.length();
        while(length > 3) {
            length -= 3;
            moneyStr = feature.insertString(moneyStr,".",length);
        }
        panePayBill.getShowMoneyToPay().setText(moneyStr + " VND");
        return moneyStr;
    }
    public void showIdBillUnpaid(ArrayList<Bill> listBillUnpaid, int indexShowNext, int indexShowInf){
        switch (indexShowInf) {
            case 0: {
                panePayBill.getIdBillUnpaid1PB().setText(listBillUnpaid.get(indexShowNext).getIdBill() + "");
                panePayBill.getIdRenterBill1PB().setText(listBillUnpaid.get(indexShowNext).getIdRenter() + "");
                break;
            }
            case 1: {
                panePayBill.getIdBillUnpaid2PB().setText(listBillUnpaid.get(indexShowNext).getIdBill() + "");
                panePayBill.getIdRenterBill2PB().setText(listBillUnpaid.get(indexShowNext).getIdRenter() + "");
                break;
            }
            case 2: {
                panePayBill.getIdBillUnpaid3PB().setText(listBillUnpaid.get(indexShowNext).getIdBill() + "");
                panePayBill.getIdRenterBill3PB().setText(listBillUnpaid.get(indexShowNext).getIdRenter() + "");
                break;
            }
            case 3: {
                panePayBill.getIdBillUnpaid4PB().setText(listBillUnpaid.get(indexShowNext).getIdBill() + "");
                panePayBill.getIdRenterBill4PB().setText(listBillUnpaid.get(indexShowNext).getIdRenter() + "");
                break;
            }
            case 4: {
                panePayBill.getIdBillUnpaid5PB().setText(listBillUnpaid.get(indexShowNext).getIdBill() + "");
                panePayBill.getIdRenterBill5PB().setText(listBillUnpaid.get(indexShowNext).getIdRenter() + "");
                break;
            }
            case 5: {
                panePayBill.getIdBillUnpaid6PB().setText(listBillUnpaid.get(indexShowNext).getIdBill() + "");
                panePayBill.getIdRenterBill6PB().setText(listBillUnpaid.get(indexShowNext).getIdRenter() + "");
                break;
            }

            case 6: {
                panePayBill.getIdBillUnpaid7PB().setText(listBillUnpaid.get(indexShowNext).getIdBill() + "");
                panePayBill.getIdRenterBill7PB().setText(listBillUnpaid.get(indexShowNext).getIdRenter() + "");
                break;
            }

        }
    }
    public void reShowIdBillUnpaid(int indexShow) {
        switch (indexShow) {
            case 0 : {
                panePayBill.getIdBillUnpaid1PB().setText("");
                panePayBill.getIdRenterBill1PB().setText("");
                break;
            }
            case 1 : {
                panePayBill.getIdBillUnpaid2PB().setText("");
                panePayBill.getIdRenterBill2PB().setText("");
                break;
            }
            case 2 : {
                panePayBill.getIdBillUnpaid3PB().setText("");
                panePayBill.getIdRenterBill3PB().setText("");
                break;
            }
            case 3 : {
                panePayBill.getIdBillUnpaid4PB().setText( "");
                panePayBill.getIdRenterBill4PB().setText("");
                break;
            }
            case 4 : {
                panePayBill.getIdBillUnpaid5PB().setText("");
                panePayBill.getIdRenterBill5PB().setText("");
                break;
            }
            case 5 : {
                panePayBill.getIdBillUnpaid6PB().setText("");
                panePayBill.getIdRenterBill6PB().setText("");
                break;
            }
            case 6 : {
                panePayBill.getIdBillUnpaid7PB().setText("");
                panePayBill.getIdRenterBill7PB().setText("");
                break;
            }
            default: {
                System.out.println("index invalid");
            }
        }
    }
    }
