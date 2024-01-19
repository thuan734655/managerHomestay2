package View.ManagerView;

import javax.swing.*;
import java.awt.*;

// chu y: khong co hau to thi la cua paneinfRenter
//        hau to OA => la cua paneAddRenter
//        hau to UD => la cua paneUpdateRenter
//        hau to MG => la cua panelNavigateManager
//        hau to TM => panelTitleManager
//        hau to DL => paneDeleteRenter
//        hau to FD => paneFindRenter
//        hau to SM => paneSendEmail
//        hau to PB => panePayBill
//        hau to RI => paneRoomInf
//        hau to SR => paneShowRoomInf
//        hau to CP => paneChangePass
//        hau to UP => paneBill
//        hau to PA => cua cac panel hien thi giao dien


public class ManagerView extends JFrame {

     private SpringLayout springLayoutJframe = new SpringLayout();

     private JPanel paneInfRenTerPA = new PaneInfRenter();
     private JPanel paneAddRenterPA = new PaneAddRenter();
     private JPanel paneUpdateRenterPA =  new PanelUpdateRenter();
     private JPanel paneDeleteRenterPA = new PaneDeleteRenter();
     private JPanel paneFindRenterPA =  new PaneFindRenter();
     private JPanel paneStatisticalPA =  new PanePayBill();
     private JPanel paneChangePassPA = new PaneChangePass();
     private JPanel paneSendMailPA =  new PaneSendEmail();
     private JPanel paneInfRoomPA = new PaneRoomInf();
     private JPanel panePaidOrUnPaidPA = new PaneBill();
     private JPanel paneHelpPA = new JPanel();


    private JPanel panelTitleManager  =   new PaneTitle(this);
    private JPanel panelNavigateManager = new PanelNavigate(this);


    public ManagerView() {
        super("Manager");
        init();
        this.setVisible(true);
    }

    public void init() {
        this.setSize(1100, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(springLayoutJframe);
        this.setBackground(new Color(190,190, 190));

        this.add(panelNavigateManager);
        this.add(panelTitleManager);
        this.add(paneInfRenTerPA);
        this.add(paneAddRenterPA);
        this.add(paneUpdateRenterPA);
        this.add(paneDeleteRenterPA);
        this.add(paneFindRenterPA);
        this.add(paneSendMailPA);
        this.add(paneStatisticalPA);
        this.add(paneInfRoomPA);
        this.add(paneHelpPA);
        this.add(panePaidOrUnPaidPA);
        this.add(paneChangePassPA);

        // mac dinh chi hien thi paneInfRenter
        paneAddRenterPA.setVisible(false);
        paneUpdateRenterPA.setVisible(false);
        paneDeleteRenterPA.setVisible(false);
        paneFindRenterPA.setVisible(false);
        paneSendMailPA.setVisible(false);
        paneStatisticalPA.setVisible(false);
        paneInfRoomPA.setVisible(false);
        paneHelpPA.setVisible(false);
        paneChangePassPA.setVisible(false);
        panePaidOrUnPaidPA.setVisible(false);


        springLayoutJframe.putConstraint(springLayoutJframe.NORTH, panelNavigateManager,0,springLayoutJframe.NORTH,this);
        springLayoutJframe.putConstraint(springLayoutJframe.EAST, panelNavigateManager,240,springLayoutJframe.EAST,this);

        springLayoutJframe.putConstraint(springLayoutJframe.NORTH,panelTitleManager,0,springLayoutJframe.NORTH,this);
        springLayoutJframe.putConstraint(springLayoutJframe.WEST,panelTitleManager,240,springLayoutJframe.WEST,this);

    }

    public JPanel getPaneInfRenTerPA() {
        return paneInfRenTerPA;
    }

    public JPanel getPaneAddRenterPA() {
        return paneAddRenterPA;
    }

    public JPanel getPaneUpdateRenterPA() {
        return paneUpdateRenterPA;
    }

    public JPanel getPaneDeleteRenterPA() {
        return paneDeleteRenterPA;
    }

    public JPanel getPaneFindRenterPA() {
        return paneFindRenterPA;
    }

    public JPanel getPaneStatisticalPA() {
        return paneStatisticalPA;
    }

    public JPanel getPaneChangePassPA() {
        return paneChangePassPA;
    }

    public JPanel getPaneSendMailPA() {
        return paneSendMailPA;
    }

    public JPanel getPaneInfRoomPA() {
        return paneInfRoomPA;
    }

    public JPanel getPanePaidOrUnPaidPA() {
        return panePaidOrUnPaidPA;
    }



    public static void main(String[] args) {
        ManagerView managerView = new ManagerView();
    }
}