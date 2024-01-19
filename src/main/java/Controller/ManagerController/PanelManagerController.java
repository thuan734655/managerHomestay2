package Controller.ManagerController;

import View.ManagerView.ManagerView;
import View.ManagerView.PanelNavigate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelManagerController implements ActionListener {

    int indexDelete = 1; // vi tri cua button muon xoa mau
    ManagerView managerView;
    PanelNavigate panelNavigate ;

    public PanelManagerController(PanelNavigate panelNavigate,ManagerView managerView) {
        this.panelNavigate = panelNavigate;
        this.managerView = managerView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
               switch (e.getActionCommand()) {
                   case  "Renter information": {
                       editButtonChosee(1);

                       //TH: khi nhan vao button1 2 lan thi button 1 se bi xoa boi vi indexDelete luc do bang chinh button muon chon, nen phai kiem tra
                       if(indexDelete != 1) {
                           resetEditButton(indexDelete);
                       }

                       // cap nhat lai vi tri dang duoc chon, de khi chon button khac thi se xoa hieu ung o button nay
                       indexDelete = 1;


                       break;
                   }
                   case  "Room information": {
                       editButtonChosee(2);

                       //TH: khi nhan vao button1 2 lan thi button 1 se bi xoa boi vi indexDelete luc do bang chinh button muon chon, nen phai kiem tra
                       if(indexDelete != 2) {
                           resetEditButton(indexDelete);
                       }

                       // cap nhat lai vi tri dang duoc chon, de khi chon button khac thi se xoa hieu ung o button nay
                       indexDelete = 2;

                       break;
                   }

                   case  "Add renter": {
                       editButtonChosee(3);

                       //TH: khi nhan vao button1 2 lan thi button 1 se bi xoa boi vi indexDelete luc do bang chinh button muon chon, nen phai kiem tra
                       if(indexDelete != 3) {
                           resetEditButton(indexDelete);
                       }

                       // cap nhat lai vi tri dang duoc chon, de khi chon button khac thi se xoa hieu ung o button nay
                       indexDelete = 3;

                       break;
                   }
                   case  "Update renter informaton": {
                       editButtonChosee(4);

                       //TH: khi nhan vao button1 2 lan thi button 1 se bi xoa boi vi indexDelete luc do bang chinh button muon chon, nen phai kiem tra
                       if(indexDelete != 4) {
                           resetEditButton(indexDelete);
                       }

                       // cap nhat lai vi tri dang duoc chon, de khi chon button khac thi se xoa hieu ung o button nay
                       indexDelete = 4;

                       break;
                   }
                   case  "Delete renter": {
                       editButtonChosee(5);

                       //TH: khi nhan vao button1 2 lan thi button 1 se bi xoa boi vi indexDelete luc do bang chinh button muon chon, nen phai kiem tra
                       if(indexDelete != 5) {
                           resetEditButton(indexDelete);
                       }

                       // cap nhat lai vi tri dang duoc chon, de khi chon button khac thi se xoa hieu ung o button nay
                       indexDelete = 5;

                       break;
                   }
                   case  "Find renter": {
                       editButtonChosee(6);

                       //TH: khi nhan vao button1 2 lan thi button 1 se bi xoa boi vi indexDelete luc do bang chinh button muon chon, nen phai kiem tra
                       if(indexDelete != 6) {
                           resetEditButton(indexDelete);
                       }

                       // cap nhat lai vi tri dang duoc chon, de khi chon button khac thi se xoa hieu ung o button nay
                       indexDelete = 6;

                       break;
                   }
                   case  "Pay bill": {
                       editButtonChosee(7);

                       //TH: khi nhan vao button1 2 lan thi button 1 se bi xoa boi vi indexDelete luc do bang chinh button muon chon, nen phai kiem tra
                       if(indexDelete != 7) {
                           resetEditButton(indexDelete);
                       }

                       // cap nhat lai vi tri dang duoc chon, de khi chon button khac thi se xoa hieu ung o button nay
                       indexDelete = 7;

                       break;
                   }

                   case  "Send email": {
                       editButtonChosee(8);

                       //TH: khi nhan vao button1 2 lan thi button 1 se bi xoa boi vi indexDelete luc do bang chinh button muon chon, nen phai kiem tra
                       if(indexDelete != 8) {
                           resetEditButton(indexDelete);
                       }

                       // cap nhat lai vi tri dang duoc chon, de khi chon button khac thi se xoa hieu ung o button nay
                       indexDelete = 8;

                       break;
                   }
                   case  "Change password": {
                       editButtonChosee(9);

                       //TH: khi nhan vao button1 2 lan thi button 1 se bi xoa boi vi indexDelete luc do bang chinh button muon chon, nen phai kiem tra
                       if(indexDelete != 9) {
                           resetEditButton(indexDelete);
                       }

                       // cap nhat lai vi tri dang duoc chon, de khi chon button khac thi se xoa hieu ung o button nay
                       indexDelete = 9;
                       break;
                   }

                   case  "Create bill": {
                       editButtonChosee(10);

                       //TH: khi nhan vao button1 2 lan thi button 1 se bi xoa boi vi indexDelete luc do bang chinh button muon chon, nen phai kiem tra
                       if(indexDelete != 10) {
                           resetEditButton(indexDelete);
                       }

                       // cap nhat lai vi tri dang duoc chon, de khi chon button khac thi se xoa hieu ung o button nay
                       indexDelete = 10;
                       break;
                   }

                   default: {
                   }
               }
    }
    public void editButtonChosee( int index) {
       switch(index) {
           case 1 : {
               panelNavigate.getInfRenterMG().setBackground(new Color(0, 178, 238));
               managerView.getPaneInfRenTerPA().setVisible(true);
               break;

           }
           case 2 : {
               panelNavigate.getInfRoomMG().setBackground(new Color(0, 178, 238));
               managerView.getPaneInfRoomPA().setVisible(true);
               break;
           }

           case 3 : {
               panelNavigate.getAddRenterMG().setBackground(new Color(0, 178, 238));
               managerView.getPaneAddRenterPA().setVisible(true);
               break;
           }

           case 4 : {
               panelNavigate.getUpdateRenterInfMG().setBackground(new Color(0, 178, 238));
               managerView.getPaneUpdateRenterPA().setVisible(true);
               break;
           }
           case 5 : {
               panelNavigate.getDeleteRenterMG().setBackground(new Color(0, 178, 238));
               managerView.getPaneDeleteRenterPA().setVisible(true);
               break;
           }
           case 6 : {
               panelNavigate.getFindRenterMG().setBackground(new Color(0, 178, 238));
               managerView.getPaneFindRenterPA().setVisible(true);
               break;
           }
           case 7 : {
               panelNavigate.getpayBilllMGMG().setBackground(new Color(0, 178, 238));
               managerView.getPaneStatisticalPA().setVisible(true);
               break;
           }
           case 8 : {
               panelNavigate.getSendMailMG().setBackground(new Color(0, 178, 238));
               managerView.getPaneSendMailPA().setVisible(true);
               break;
           }
           case 9 : {
               panelNavigate.getChangePassMG().setBackground(new Color(0, 178, 238));
               managerView.getPaneChangePassPA().setVisible(true);
               break;
           }
           case 10 : {
               panelNavigate.getBillMG().setBackground(new Color(0, 178, 238));
               managerView.getPanePaidOrUnPaidPA().setVisible(true);
               break;
           }

       }
    }
    public void resetEditButton(int index) {
        switch(index) {
            case 1 :{
                panelNavigate.getInfRenterMG().setBackground(new Color(16,	54,	103));
                managerView.getPaneInfRenTerPA().setVisible(false);
                break;
            }
            case 2 : {
                panelNavigate.getInfRoomMG().setBackground(new Color(16,	54,	103));
                managerView.getPaneInfRoomPA().setVisible(false);
                break;
            }

            case 3 : {
                panelNavigate.getAddRenterMG().setBackground(new Color(16,	54,	103));
                managerView.getPaneAddRenterPA().setVisible(false);
                break;
            }

            case 4 : {
                panelNavigate.getUpdateRenterInfMG().setBackground(new Color(16,	54,	103));
                managerView.getPaneUpdateRenterPA().setVisible(false);
                break;
            }
            case 5 : {
                panelNavigate.getDeleteRenterMG().setBackground(new Color(16,	54,	103));
                managerView.getPaneDeleteRenterPA().setVisible(false);
                break;
            }
            case 6 : {
                panelNavigate.getFindRenterMG().setBackground(new Color(16,	54,	103));
                managerView.getPaneFindRenterPA().setVisible(false);
                break;
            }
            case 7 : {
                panelNavigate.getpayBilllMGMG().setBackground(new Color(16,	54,	103));
                managerView.getPaneStatisticalPA().setVisible(false);
                break;
            }
            case 8 : {
                panelNavigate.getSendMailMG().setBackground(new Color(16,	54,	103));
                managerView.getPaneSendMailPA().setVisible(false);
                break;
            }
            case 9 : {
                panelNavigate.getChangePassMG().setBackground(new Color(16,	54,	103));
                managerView.getPaneChangePassPA().setVisible(false);
                break;
            }
            case 10 : {
                panelNavigate.getBillMG().setBackground(new Color(16,	54,	103));
                managerView.getPanePaidOrUnPaidPA().setVisible(false);
                break;
            }


        }
    }
}
