package View.ManagerView;

import Controller.ManagerController.BillController;

import javax.swing.*;
import java.awt.*;

public class PaneBill extends JPanel {

    private JLabel textIdRenterUP = new JLabel("ID");
    private JLabel textNameUP = new JLabel("Full name");
    private JLabel textEmailUP = new JLabel("Email");
    private JLabel textRoomNameUP = new JLabel("Room name");
    private JLabel textRentalDayUP = new JLabel("Rental day");
    private JLabel textCubicOfWaterUP = new JLabel("Cubic of water");
    private JLabel textElectricityNumberUP = new JLabel("Electricity number");
    private JLabel textMoneyToPay = new JLabel("Money to pay");

    private JLabel enterRoomNameLabelUP = new JLabel("Enter room name");
    private JLabel titleChoseeRoomUP = new JLabel("Chosee room");
    private JLabel titleEnterInfUP = new JLabel("Enter information");
    private JLabel textCubicOfWaterInfUP = new JLabel("Enter cubic of water");
    private JLabel textElectricityNumberInfUP  = new JLabel("Electricity number");


    private JTextField showNameUP = new JTextField();
    private JTextField showEmailUP = new JTextField();
    private JTextField showCubicOfWaterUP = new JTextField();
    private JTextField showElectricityNunberUP = new JTextField();
    private JTextField showRentalDayUP = new JTextField();
    private JTextField showIdRoomUP = new JTextField();
    private JTextField showIDRenterUP = new JTextField();
    private JTextField enterCubicOfWaterUP = new JTextField();
    private JTextField enterElectricityNunberUP = new JTextField();
    private JTextField showMoneyToPay = new JTextField();


    private JTextField searhByRoomNameUP = new JTextField();


    private JButton confirmUP = new JButton("Confirm");
    private JButton createUP = new JButton("Create");
    private JButton searchButtonUP = new JButton("Search");


    private JSeparator separatorUP = new JSeparator(SwingConstants.VERTICAL);
    private JSeparator separator1UP = new JSeparator(SwingConstants.HORIZONTAL);

    Dimension dimensionJTextFieldUP = new Dimension(200, 30);
    Dimension dimensionJTextFieldSearchUP = new Dimension(150, 30);
    private Font fontDialog = new Font(Font.DIALOG, Font.PLAIN | Font.BOLD, 16);

    JPanel panelShowInfUP = new JPanel();

    private SpringLayout springLayoutUP = new SpringLayout();
    private SpringLayout springLayoutJpaneUP = new SpringLayout();

    private BillController billController = new BillController(this);


    public PaneBill() {
        this.setBackground(new Color(240, 255, 255));
        this.setBackground(new Color(240, 255, 255));

        // chinh sua kich thuoc cho panel
        this.setPreferredSize(new Dimension(1100, 800));
        panelShowInfUP.setPreferredSize(new Dimension(575, 540));

        separatorUP.setPreferredSize(new Dimension(1, 550));
        separator1UP.setPreferredSize(new Dimension(230, 1));

        // set layout cho cac panel
        this.setLayout(springLayoutJpaneUP);
        panelShowInfUP.setLayout(springLayoutUP);


        // them thanh phan vao panelAddRenter
        this.add(separatorUP);
        this.add(separator1UP);
        this.add(confirmUP);
        this.add(createUP);
        this.add(searchButtonUP);
        this.add(panelShowInfUP);
        this.add(enterRoomNameLabelUP);
        this.add(searhByRoomNameUP);
        this.add(separatorUP);
        this.add(textElectricityNumberInfUP);
        this.add(textCubicOfWaterInfUP);
        this.add(enterCubicOfWaterUP);
        this.add(enterElectricityNunberUP);
        this.add(titleChoseeRoomUP);;
        this.add(titleEnterInfUP);
        this.add(textElectricityNumberInfUP);
        this.add(textCubicOfWaterInfUP);





        // xet trong suot cho cac panel
        panelShowInfUP.setOpaque(false);



        // them cac thanh phan vao panel
        panelShowInfUP.add(textIdRenterUP);
        panelShowInfUP.add(showIDRenterUP);
        panelShowInfUP.add(textNameUP);
        panelShowInfUP.add(showNameUP);
        panelShowInfUP.add(textEmailUP);
        panelShowInfUP.add(showRentalDayUP);
        panelShowInfUP.add(textRoomNameUP);
        panelShowInfUP.add(showElectricityNunberUP);
        panelShowInfUP.add(textRentalDayUP);
        panelShowInfUP.add(showCubicOfWaterUP);
        panelShowInfUP.add(textCubicOfWaterUP);
        panelShowInfUP.add(showEmailUP);
        panelShowInfUP.add(textElectricityNumberUP);
        panelShowInfUP.add(showIdRoomUP);
        panelShowInfUP.add(showMoneyToPay);
        panelShowInfUP.add(textMoneyToPay);



        // chinh font chu
        textNameUP.setFont(fontDialog);
        textEmailUP.setFont(fontDialog);
        textRoomNameUP.setFont(fontDialog);
        textRentalDayUP.setFont(fontDialog);
        textElectricityNumberUP.setFont(fontDialog);
        textCubicOfWaterUP.setFont(fontDialog);
        textIdRenterUP.setFont(fontDialog);
        enterRoomNameLabelUP.setFont(fontDialog);
        titleEnterInfUP.setFont(fontDialog);
        titleChoseeRoomUP.setFont(fontDialog);
        textElectricityNumberInfUP.setFont(fontDialog);
        textCubicOfWaterInfUP.setFont(fontDialog);
        textMoneyToPay.setFont(fontDialog);

        // chinh sua mau jlabel
        titleEnterInfUP.setForeground(new Color(244, 164, 96));
        titleChoseeRoomUP.setForeground(new Color(244, 164, 96));

        //set kich thuoc cac JTextField
        showNameUP.setPreferredSize(dimensionJTextFieldUP);
        showRentalDayUP.setPreferredSize(dimensionJTextFieldUP);
        showElectricityNunberUP.setPreferredSize(dimensionJTextFieldUP);
        showCubicOfWaterUP.setPreferredSize(dimensionJTextFieldUP);
        showEmailUP.setPreferredSize(dimensionJTextFieldUP);
        showIdRoomUP.setPreferredSize(dimensionJTextFieldUP);
        showIDRenterUP.setPreferredSize(dimensionJTextFieldUP);
        searhByRoomNameUP.setPreferredSize(dimensionJTextFieldSearchUP);
        enterCubicOfWaterUP.setPreferredSize(dimensionJTextFieldSearchUP);
        enterElectricityNunberUP.setPreferredSize(dimensionJTextFieldSearchUP);
        showMoneyToPay.setPreferredSize(dimensionJTextFieldSearchUP);


        // bo goc cho jtextField
        showRentalDayUP.setBorder(BorderFactory.createLineBorder(Color.gray));
        showElectricityNunberUP.setBorder(BorderFactory.createLineBorder(Color.gray));
        showIDRenterUP.setBorder(BorderFactory.createLineBorder(Color.gray));
        showCubicOfWaterUP.setBorder(BorderFactory.createLineBorder(Color.gray));
        showNameUP.setBorder(BorderFactory.createLineBorder(Color.gray));
        showEmailUP.setBorder(BorderFactory.createLineBorder(Color.gray));
        showIdRoomUP.setBorder(BorderFactory.createLineBorder(Color.gray));
        searhByRoomNameUP.setBorder(BorderFactory.createLineBorder(Color.gray));
        enterCubicOfWaterUP.setBorder(BorderFactory.createLineBorder(Color.gray));
        enterElectricityNunberUP.setBorder(BorderFactory.createLineBorder(Color.gray));
        showMoneyToPay.setBorder(BorderFactory.createLineBorder(Color.gray));

        // xet trong suot cho JTextField
        showRentalDayUP.setOpaque(false);
        showElectricityNunberUP.setOpaque(false);
        showIDRenterUP.setOpaque(false);
        showCubicOfWaterUP.setOpaque(false);
        showNameUP.setOpaque(false);
        showEmailUP.setOpaque(false);
        showIdRoomUP.setOpaque(false);
        searhByRoomNameUP.setOpaque(false);
        enterCubicOfWaterUP.setOpaque(false);
        enterElectricityNunberUP.setOpaque(false);
        showMoneyToPay.setOpaque(false);



        //khoa jtextfield khong cho nguoi dung nhap du lieu
        showIDRenterUP.setEditable(false);
        showRentalDayUP.setEditable(false);
        showElectricityNunberUP.setEditable(false);
        showCubicOfWaterUP.setEditable(false);
        showNameUP.setEditable(false);
        showEmailUP.setEditable(false);
        showIdRoomUP.setEditable(false);
        showMoneyToPay.setEditable(false);


        confirmUP.setCursor(new Cursor(Cursor.HAND_CURSOR));
        searchButtonUP.setCursor(new Cursor(Cursor.HAND_CURSOR));
        createUP.setCursor(new Cursor(Cursor.HAND_CURSOR));


        searchButtonUP.setFocusPainted(false);
        confirmUP.setFocusPainted(false);
        createUP.setFocusPainted(false);



        //can chinh vi tri separatorDA
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.NORTH, separatorUP, 90, springLayoutJpaneUP.NORTH, this);
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.WEST, separatorUP, 480, springLayoutJpaneUP.WEST, this);

        //can chinh vi tri separatorDA
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.NORTH, separator1UP, 320, springLayoutJpaneUP.NORTH, this);
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.WEST, separator1UP, 250, springLayoutJpaneUP.WEST, this);


        //can chinh vi tri panelInputInfOA
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.NORTH, enterRoomNameLabelUP, 120, springLayoutJpaneUP.NORTH, this);
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.WEST, enterRoomNameLabelUP, 285, springLayoutJpaneUP.WEST, this);

        //can chinh vi tri resultNameSreachNameAndBirthDA
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.NORTH, searhByRoomNameUP, 155, springLayoutJpaneUP.NORTH, this);
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.WEST, searhByRoomNameUP, 275, springLayoutJpaneUP.WEST, this);

        //can chinh vi tri searchButtonDA
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.NORTH, searchButtonUP, 200, springLayoutJpaneUP.NORTH, this);
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.WEST, searchButtonUP, 310, springLayoutJpaneUP.WEST, this);


        //can chinh vi tri textElectricityNumberInfUP
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.NORTH, textElectricityNumberInfUP, 370, springLayoutJpaneUP.NORTH, this);
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.WEST, textElectricityNumberInfUP, 285, springLayoutJpaneUP.WEST, this);

        //can chinh vi tri textCubicOfWaterInfUP
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.NORTH, textCubicOfWaterInfUP, 450, springLayoutJpaneUP.NORTH, this);
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.WEST, textCubicOfWaterInfUP, 285, springLayoutJpaneUP.WEST, this);

        //can chinh vi tri textCubicOfWaterInfUP
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.NORTH, enterElectricityNunberUP, 400, springLayoutJpaneUP.NORTH, this);
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.WEST, enterElectricityNunberUP, 275, springLayoutJpaneUP.WEST, this);

        //can chinh vi tri enterCubicOfWaterUP
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.NORTH, enterCubicOfWaterUP, 480, springLayoutJpaneUP.NORTH, this);
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.WEST, enterCubicOfWaterUP, 275, springLayoutJpaneUP.WEST, this);

        //can chinh vi tri confirmUP
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.NORTH, confirmUP, 520, springLayoutJpaneUP.NORTH, this);
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.WEST, confirmUP, 313, springLayoutJpaneUP.WEST, this);

        //can chinh vi tri titlEnterInfUP
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.NORTH, titleChoseeRoomUP, 90, springLayoutJpaneUP.NORTH, this);
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.WEST, titleChoseeRoomUP, 270, springLayoutJpaneUP.WEST, this);

        //can chinh vi tri titlEnterInfUP
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.NORTH, titleEnterInfUP, 330, springLayoutJpaneUP.NORTH, this);
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.WEST, titleEnterInfUP, 270, springLayoutJpaneUP.WEST, this);


        //can chinh vi tri panelInputInfOA
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.NORTH, panelShowInfUP, 90, springLayoutJpaneUP.NORTH, this);
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.WEST, panelShowInfUP, 455, springLayoutJpaneUP.WEST, this);

        // show information
        springLayoutUP.putConstraint(springLayoutUP.NORTH, showIDRenterUP, 45, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, showIDRenterUP, 50, springLayoutUP.WEST, panelShowInfUP);

        springLayoutUP.putConstraint(springLayoutUP.NORTH, showNameUP, 45, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, showNameUP, 340, springLayoutUP.WEST, panelShowInfUP);

        springLayoutUP.putConstraint(springLayoutUP.NORTH, showEmailUP, 135, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, showEmailUP, 50, springLayoutUP.WEST, panelShowInfUP);

        springLayoutUP.putConstraint(springLayoutUP.NORTH, showIdRoomUP, 135, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, showIdRoomUP, 340, springLayoutUP.WEST, panelShowInfUP);

        springLayoutUP.putConstraint(springLayoutUP.NORTH, showRentalDayUP, 225, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, showRentalDayUP, 50, springLayoutUP.WEST, panelShowInfUP);

        springLayoutUP.putConstraint(springLayoutUP.NORTH, showCubicOfWaterUP, 225, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, showCubicOfWaterUP, 340, springLayoutUP.WEST, panelShowInfUP);

        springLayoutUP.putConstraint(springLayoutUP.NORTH, showElectricityNunberUP, 315, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, showElectricityNunberUP, 50, springLayoutUP.WEST, panelShowInfUP);

        springLayoutUP.putConstraint(springLayoutUP.NORTH, showMoneyToPay, 315, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, showMoneyToPay, 340, springLayoutUP.WEST, panelShowInfUP);


        // can chinh vi tri cho cac text
        springLayoutUP.putConstraint(springLayoutUP.NORTH, textIdRenterUP, 20, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, textIdRenterUP, 55, springLayoutUP.WEST, panelShowInfUP);

        springLayoutUP.putConstraint(springLayoutUP.NORTH, textNameUP, 20, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, textNameUP, 345, springLayoutUP.WEST, panelShowInfUP);

        springLayoutUP.putConstraint(springLayoutUP.NORTH, textEmailUP, 112, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, textEmailUP, 55, springLayoutUP.WEST, panelShowInfUP);

        springLayoutUP.putConstraint(springLayoutUP.NORTH, textRoomNameUP, 112, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, textRoomNameUP, 345, springLayoutUP.WEST, panelShowInfUP);

        springLayoutUP.putConstraint(springLayoutUP.NORTH, textRentalDayUP, 202, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, textRentalDayUP, 55, springLayoutUP.WEST, panelShowInfUP);

        springLayoutUP.putConstraint(springLayoutUP.NORTH, textCubicOfWaterUP, 202, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, textCubicOfWaterUP, 345, springLayoutUP.WEST, panelShowInfUP);

        springLayoutUP.putConstraint(springLayoutUP.NORTH, textElectricityNumberUP, 292, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, textElectricityNumberUP, 55, springLayoutUP.WEST, panelShowInfUP);

        springLayoutUP.putConstraint(springLayoutUP.NORTH, textMoneyToPay, 292, springLayoutUP.NORTH, panelShowInfUP);
        springLayoutUP.putConstraint(springLayoutUP.WEST, textMoneyToPay, 345, springLayoutUP.WEST, panelShowInfUP);


        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.NORTH, createUP, 482, springLayoutJpaneUP.NORTH, this);
        springLayoutJpaneUP.putConstraint(springLayoutJpaneUP.WEST, createUP, 715, springLayoutJpaneUP.WEST, this);


        // lang nghe su kien
        searchButtonUP.addActionListener(billController);
        confirmUP.addActionListener(billController);
        createUP.addActionListener(billController);

    }

    public JLabel getEnterRoomNameLabelUP() {
        return enterRoomNameLabelUP;
    }

    public JTextField getShowEmailUP() {
        return showEmailUP;
    }

    public JTextField getShowCubicOfWaterUP() {
        return showCubicOfWaterUP;
    }

    public JTextField getShowElectricityNunberUP() {
        return showElectricityNunberUP;
    }

    public JTextField getShowRentalDayUP() {
        return showRentalDayUP;
    }

    public JTextField getShowNameUP() {
        return showNameUP;
    }


    public JTextField getShowIdRoomUP() {
        return showIdRoomUP;
    }

    public JTextField getShowIDRenterUP() {
        return showIDRenterUP;
    }

    public JTextField getEnterCubicOfWaterUP() {
        return enterCubicOfWaterUP;
    }

    public JTextField getEnterElectricityNunberUP() {
        return enterElectricityNunberUP;
    }

    public JTextField getSearhByRoomNameUP() {
        return searhByRoomNameUP;
    }

    public JTextField getShowMoneyToPay() {
        return showMoneyToPay;
    }
}
