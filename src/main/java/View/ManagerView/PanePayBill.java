package View.ManagerView;

import Controller.ManagerController.PayBillController;

import javax.swing.*;
import java.awt.*;

public class PanePayBill extends JPanel {

    private JLabel textIdRenterPB = new JLabel("ID renter");
    private JLabel textIdBillPB = new JLabel("ID bill");
    private JLabel textNamePB = new JLabel("Full name");
    private JLabel textEmailPB = new JLabel("Email");
    private JLabel textRoomNamePB = new JLabel("Room name");
    private JLabel textDataCreateBillPB = new JLabel("Date create bill");
    private JLabel textCubicOfWaterPB = new JLabel("Cubic of water");
    private JLabel textElectricityNumberPB = new JLabel("Electricity number");
    private JLabel textMoneyToPay = new JLabel("Money to pay");

    private JLabel enterRoomNameLabelPB = new JLabel("Enter ID bill");
    private JLabel titleChoseeRoomPB = new JLabel("Chosee ID bill");
    private JLabel titleEnterInfPB = new JLabel("List bills unpaid");
    private JLabel textIdPB = new JLabel("ID");
    private JLabel textIdRenterUnPaidPB = new JLabel("Id renter");

    private JLabel idBillUnpaid1PB = new JLabel("");
    private JLabel idBillUnpaid2PB = new JLabel("");
    private JLabel idBillUnpaid3PB = new JLabel("");
    private JLabel idBillUnpaid4PB = new JLabel("");
    private JLabel idBillUnpaid5PB = new JLabel("");
    private JLabel idBillUnpaid6PB = new JLabel("");
    private JLabel idBillUnpaid7PB = new JLabel("");
    private JLabel idRenterBill1PB = new JLabel("");
    private JLabel idRenterBill2PB = new JLabel("");
    private JLabel idRenterBill3PB = new JLabel("");
    private JLabel idRenterBill4PB = new JLabel("");
    private JLabel idRenterBill5PB = new JLabel("");
    private JLabel idRenterBill6PB = new JLabel("");
    private JLabel idRenterBill7PB = new JLabel("");


    private JSeparator separatorVertical = new JSeparator(JToolBar.Separator.VERTICAL);
    private  JSeparator separatorHorizontal1 = new JSeparator(JToolBar.Separator.HORIZONTAL);
    private  JSeparator separatorHorizontal2 = new JSeparator(JToolBar.Separator.HORIZONTAL);
    private  JSeparator separatorHorizontal3 = new JSeparator(JToolBar.Separator.HORIZONTAL);
    private  JSeparator separatorHorizontal4 = new JSeparator(JToolBar.Separator.HORIZONTAL);
    private  JSeparator separatorHorizontal5 = new JSeparator(JToolBar.Separator.HORIZONTAL);
    private  JSeparator separatorHorizontal6 = new JSeparator(JToolBar.Separator.HORIZONTAL);
    private  JSeparator separatorHorizontal7 = new JSeparator(JToolBar.Separator.HORIZONTAL);


    private JTextField showNamePB = new JTextField();
    private JTextField showIdBillPB = new JTextField();
    private JTextField showEmailPB = new JTextField();
    private JTextField showCubicOfWaterPB = new JTextField();
    private JTextField showElectricityNunberPB = new JTextField();
    private JTextField showDataCreateBillPB = new JTextField();
    private JTextField showIdRoomPB = new JTextField();
    private JTextField showIDRenterPB = new JTextField();

    private JTextField showMoneyToPay = new JTextField();


    private JTextField enterIDBillPB = new JTextField();


    private JButton reloadPB = new JButton("Reload");
    private JButton paidBillPB = new JButton("Paid bill");
    private JButton searchButtonPB = new JButton("Search");
    private JButton nextButtonPB = new JButton("Next");
    private JButton backButtonPB = new JButton("Back");
    private JButton deleteButoonPB = new JButton("Delete bill");

    private JSeparator separatorPB = new JSeparator(SwingConstants.VERTICAL);
    private JSeparator separator1PB = new JSeparator(SwingConstants.HORIZONTAL);

    Dimension dimensionJTextFieldPB = new Dimension(200, 30);
    Dimension dimensionJTextFieldSearchPB = new Dimension(150, 30);
    private Font fontDialog = new Font(Font.DIALOG, Font.PLAIN | Font.BOLD, 16);

    JPanel panelShowInfPB = new JPanel();

    private SpringLayout springLayoutPB = new SpringLayout();
    private SpringLayout springLayoutJpanePB = new SpringLayout();

    PayBillController payBillController = new PayBillController(this);


    public PanePayBill() {
        this.setBackground(new Color(240, 255, 255));

        // chinh sua kich thuoc cho panel
        this.setPreferredSize(new Dimension(1100, 800));
        panelShowInfPB.setPreferredSize(new Dimension(575, 540));

        // set layout cho cac panel
        this.setLayout(springLayoutJpanePB);
        panelShowInfPB.setLayout(springLayoutPB);


        // them thanh phan vao panelAddRenter
        this.add(separatorPB);
        this.add(separator1PB);
        this.add(reloadPB);
        this.add(paidBillPB);
        this.add(nextButtonPB);
        this.add(backButtonPB);
        this.add(deleteButoonPB);
        this.add(searchButtonPB);
        this.add(panelShowInfPB);
        this.add(enterRoomNameLabelPB);
        this.add(enterIDBillPB);
        this.add(separatorPB);
        this.add(titleChoseeRoomPB);;
        this.add(titleEnterInfPB);
        this.add(separatorVertical);
        this.add(separatorHorizontal1);
        this.add(separatorHorizontal2);
        this.add(separatorHorizontal3);
        this.add(separatorHorizontal4);
        this.add(separatorHorizontal5);
        this.add(separatorHorizontal6);
        this.add(separatorHorizontal7);
        this.add(textIdPB);
        this.add(textIdRenterUnPaidPB);
        this.add(idBillUnpaid1PB);
        this.add(idBillUnpaid2PB);
        this.add(idBillUnpaid3PB);
        this.add(idBillUnpaid4PB);
        this.add(idBillUnpaid5PB);
        this.add(idBillUnpaid6PB);
        this.add(idBillUnpaid7PB);
        this.add(idRenterBill1PB);
        this.add(idRenterBill2PB);
        this.add(idRenterBill3PB);
        this.add(idRenterBill4PB);
        this.add(idRenterBill5PB);
        this.add(idRenterBill6PB);
        this.add(idRenterBill7PB);


        // chinh kich thuoc cho separator
        separatorVertical.setPreferredSize(new Dimension(1,235));
        separatorHorizontal1.setPreferredSize(new Dimension(150,1));
        separatorHorizontal2.setPreferredSize(new Dimension(150,1));
        separatorHorizontal3.setPreferredSize(new Dimension(150,1));
        separatorHorizontal4.setPreferredSize(new Dimension(150,1));
        separatorHorizontal5.setPreferredSize(new Dimension(150,1));
        separatorHorizontal6.setPreferredSize(new Dimension(150,1));
        separatorHorizontal7.setPreferredSize(new Dimension(150,1));
        separatorPB.setPreferredSize(new Dimension(1, 550));
        separator1PB.setPreferredSize(new Dimension(230, 1));




        // xet trong suot cho cac panel
        panelShowInfPB.setOpaque(false);

        // them cac thanh phan vao panel
        panelShowInfPB.add(showIdBillPB);
        panelShowInfPB.add(textIdBillPB);
        panelShowInfPB.add(textIdRenterPB);
        panelShowInfPB.add(showIDRenterPB);
        panelShowInfPB.add(textNamePB);
        panelShowInfPB.add(showNamePB);
        panelShowInfPB.add(textEmailPB);
        panelShowInfPB.add(showDataCreateBillPB);
        panelShowInfPB.add(textRoomNamePB);
        panelShowInfPB.add(showElectricityNunberPB);
        panelShowInfPB.add(textDataCreateBillPB);
        panelShowInfPB.add(showCubicOfWaterPB);
        panelShowInfPB.add(textCubicOfWaterPB);
        panelShowInfPB.add(showEmailPB);
        panelShowInfPB.add(textElectricityNumberPB);
        panelShowInfPB.add(showIdRoomPB);
        panelShowInfPB.add(showMoneyToPay);
        panelShowInfPB.add(textMoneyToPay);




        // chinh font chu
        textNamePB.setFont(fontDialog);
        textEmailPB.setFont(fontDialog);
        textRoomNamePB.setFont(fontDialog);
        textDataCreateBillPB.setFont(fontDialog);
        textElectricityNumberPB.setFont(fontDialog);
        textCubicOfWaterPB.setFont(fontDialog);
        textIdRenterPB.setFont(fontDialog);
        enterRoomNameLabelPB.setFont(fontDialog);
        titleEnterInfPB.setFont(fontDialog);
        titleChoseeRoomPB.setFont(fontDialog);
        textMoneyToPay.setFont(fontDialog);
        textIdPB.setFont(fontDialog);
        textIdRenterUnPaidPB.setFont(fontDialog);
        textIdBillPB.setFont(fontDialog);


        // chinh sua mau jlabel
        titleEnterInfPB.setForeground(new Color(244, 164, 96));
        titleChoseeRoomPB.setForeground(new Color(244, 164, 96));
        idBillUnpaid1PB.setForeground(new Color(85, 85, 85));
        idBillUnpaid2PB.setForeground(new Color(85, 85, 85));
        idBillUnpaid3PB.setForeground(new Color(85, 85, 85));
        idBillUnpaid4PB.setForeground(new Color(85, 85, 85));
        idBillUnpaid5PB.setForeground(new Color(85, 85, 85));
        idBillUnpaid6PB.setForeground(new Color(85, 85, 85));
        idBillUnpaid7PB.setForeground(new Color(85, 85, 85));
        idRenterBill1PB.setForeground(new Color(85, 85, 85));
        idRenterBill2PB.setForeground(new Color(85, 85, 85));
        idRenterBill3PB.setForeground(new Color(85, 85, 85));
        idRenterBill4PB.setForeground(new Color(85, 85, 85));
        idRenterBill5PB.setForeground(new Color(85, 85, 85));
        idRenterBill6PB.setForeground(new Color(85, 85, 85));
        idRenterBill7PB.setForeground(new Color(85, 85, 85));

        //set kich thuoc cac JTextField
        showNamePB.setPreferredSize(dimensionJTextFieldPB);
        showDataCreateBillPB.setPreferredSize(dimensionJTextFieldPB);
        showElectricityNunberPB.setPreferredSize(dimensionJTextFieldPB);
        showCubicOfWaterPB.setPreferredSize(dimensionJTextFieldPB);
        showEmailPB.setPreferredSize(dimensionJTextFieldPB);
        showIdRoomPB.setPreferredSize(dimensionJTextFieldPB);
        showIDRenterPB.setPreferredSize(dimensionJTextFieldPB);
        enterIDBillPB.setPreferredSize(dimensionJTextFieldSearchPB);
        showMoneyToPay.setPreferredSize(dimensionJTextFieldPB);
        showIdBillPB.setPreferredSize(dimensionJTextFieldPB);

        // bo goc cho jtextField
        showDataCreateBillPB.setBorder(BorderFactory.createLineBorder(Color.gray));
        showElectricityNunberPB.setBorder(BorderFactory.createLineBorder(Color.gray));
        showIDRenterPB.setBorder(BorderFactory.createLineBorder(Color.gray));
        showCubicOfWaterPB.setBorder(BorderFactory.createLineBorder(Color.gray));
        showNamePB.setBorder(BorderFactory.createLineBorder(Color.gray));
        showEmailPB.setBorder(BorderFactory.createLineBorder(Color.gray));
        showIdRoomPB.setBorder(BorderFactory.createLineBorder(Color.gray));
        enterIDBillPB.setBorder(BorderFactory.createLineBorder(Color.gray));
        showMoneyToPay.setBorder(BorderFactory.createLineBorder(Color.gray));
        showIdBillPB.setBorder(BorderFactory.createLineBorder(Color.gray));

        // xet trong suot cho JTextField
        showDataCreateBillPB.setOpaque(false);
        showElectricityNunberPB.setOpaque(false);
        showIDRenterPB.setOpaque(false);
        showCubicOfWaterPB.setOpaque(false);
        showNamePB.setOpaque(false);
        showEmailPB.setOpaque(false);
        showIdRoomPB.setOpaque(false);
        enterIDBillPB.setOpaque(false);
        showMoneyToPay.setOpaque(false);
        showIdBillPB.setOpaque(false);



        //khoa jtextfield khong cho nguoi dung nhap du lieu
        showIDRenterPB.setEditable(false);
        showDataCreateBillPB.setEditable(false);
        showElectricityNunberPB.setEditable(false);
        showCubicOfWaterPB.setEditable(false);
        showNamePB.setEditable(false);
        showEmailPB.setEditable(false);
        showIdRoomPB.setEditable(false);
        showMoneyToPay.setEditable(false);
        showIdBillPB.setEditable(false);


        reloadPB.setCursor(new Cursor(Cursor.HAND_CURSOR));
        searchButtonPB.setCursor(new Cursor(Cursor.HAND_CURSOR));
        paidBillPB.setCursor(new Cursor(Cursor.HAND_CURSOR));
        nextButtonPB.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButtonPB.setCursor(new Cursor(Cursor.HAND_CURSOR));
        deleteButoonPB.setCursor(new Cursor(Cursor.HAND_CURSOR));


        searchButtonPB.setFocusPainted(false);
        reloadPB.setFocusPainted(false);
        paidBillPB.setFocusPainted(false);
        nextButtonPB.setFocusPainted(false);
        backButtonPB.setFocusPainted(false);
        deleteButoonPB.setFocusPainted(false);

        //can chinh vi tri panelInputInfOA
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, panelShowInfPB, 90, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, panelShowInfPB, 455, springLayoutJpanePB.WEST, this);

        // chinh sua kich thuoc separator
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, separatorPB, 90, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, separatorPB, 480, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, separator1PB, 320, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, separator1PB, 250, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, separatorVertical, 360, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, separatorVertical, 360, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, separatorHorizontal1, 390, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, separatorHorizontal1, 290, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, separatorHorizontal2, 420, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, separatorHorizontal2, 290, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, separatorHorizontal3, 450, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, separatorHorizontal3, 290, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, separatorHorizontal4, 480, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, separatorHorizontal4, 290, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, separatorHorizontal5, 510, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, separatorHorizontal5, 290, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, separatorHorizontal6, 540, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, separatorHorizontal6, 290, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, separatorHorizontal7, 570, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, separatorHorizontal7, 290, springLayoutJpanePB.WEST, this);


        //can chinh vi tri cac component ben trai
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, enterRoomNameLabelPB, 120, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, enterRoomNameLabelPB, 285, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, enterIDBillPB, 155, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, enterIDBillPB, 275, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, searchButtonPB, 200, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, searchButtonPB, 310, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, titleChoseeRoomPB, 90, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, titleChoseeRoomPB, 270, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, titleEnterInfPB, 330, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, titleEnterInfPB, 270, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, textIdPB, 365, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, textIdPB, 320, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, textIdRenterUnPaidPB, 365, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, textIdRenterUnPaidPB, 370, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, reloadPB, 610, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, reloadPB, 330, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, nextButtonPB, 610, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, nextButtonPB, 413, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, backButtonPB, 610, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, backButtonPB, 260, springLayoutJpanePB.WEST, this);

        // chinh sua vi tri idBillUnpaid
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, idBillUnpaid1PB, 400, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, idBillUnpaid1PB, 320, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, idBillUnpaid2PB, 430, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, idBillUnpaid2PB, 320, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, idBillUnpaid3PB, 460, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, idBillUnpaid3PB, 320, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, idBillUnpaid4PB, 490, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, idBillUnpaid4PB, 320, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, idBillUnpaid5PB, 520, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, idBillUnpaid5PB, 320, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, idBillUnpaid6PB, 550, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, idBillUnpaid6PB, 320, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, idBillUnpaid7PB, 580, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, idBillUnpaid7PB, 320, springLayoutJpanePB.WEST, this);


        //chinh sua vi tri statusBill
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, idRenterBill1PB, 400, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, idRenterBill1PB, 380, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, idRenterBill2PB, 430, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, idRenterBill2PB, 380, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, idRenterBill3PB, 460, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, idRenterBill3PB, 380, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, idRenterBill4PB, 490, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, idRenterBill4PB, 380, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, idRenterBill5PB, 520, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, idRenterBill5PB, 380, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, idRenterBill6PB, 550, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, idRenterBill6PB, 380, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, idRenterBill7PB, 580, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, idRenterBill7PB, 380, springLayoutJpanePB.WEST, this);


        // show information
        springLayoutPB.putConstraint(springLayoutPB.NORTH, showIdBillPB, 45, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, showIdBillPB, 50, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, showIDRenterPB, 45, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, showIDRenterPB, 340, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, showNamePB, 135, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, showNamePB, 50, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, showEmailPB, 135, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, showEmailPB, 340, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, showIdRoomPB, 225, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, showIdRoomPB, 50, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, showDataCreateBillPB, 225, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, showDataCreateBillPB, 340, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, showCubicOfWaterPB, 315, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, showCubicOfWaterPB, 340, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, showElectricityNunberPB, 315, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, showElectricityNunberPB, 50, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, showMoneyToPay, 405, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, showMoneyToPay, 50, springLayoutPB.WEST, panelShowInfPB);


        // can chinh vi tri cho cac text
        springLayoutPB.putConstraint(springLayoutPB.NORTH, textIdBillPB, 20, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, textIdBillPB, 55, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, textIdRenterPB, 20, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, textIdRenterPB, 345, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, textNamePB, 112, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, textNamePB, 55, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, textEmailPB, 112, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, textEmailPB, 345, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, textRoomNamePB, 202, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, textRoomNamePB, 55, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, textDataCreateBillPB, 202, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, textDataCreateBillPB, 345, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, textCubicOfWaterPB, 292, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, textCubicOfWaterPB, 345, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, textElectricityNumberPB, 292, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, textElectricityNumberPB, 55, springLayoutPB.WEST, panelShowInfPB);

        springLayoutPB.putConstraint(springLayoutPB.NORTH, textMoneyToPay, 382, springLayoutPB.NORTH, panelShowInfPB);
        springLayoutPB.putConstraint(springLayoutPB.WEST, textMoneyToPay, 55, springLayoutPB.WEST, panelShowInfPB);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, paidBillPB, 552, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, paidBillPB, 815, springLayoutJpanePB.WEST, this);

        springLayoutJpanePB.putConstraint(springLayoutJpanePB.NORTH, deleteButoonPB, 552, springLayoutJpanePB.NORTH, this);
        springLayoutJpanePB.putConstraint(springLayoutJpanePB.WEST, deleteButoonPB, 685, springLayoutJpanePB.WEST, this);


        // lang nghe su kien
        searchButtonPB.addActionListener(payBillController);
        reloadPB.addActionListener(payBillController);
        nextButtonPB.addActionListener(payBillController);
        backButtonPB.addActionListener(payBillController);
        paidBillPB.addActionListener(payBillController);
        deleteButoonPB.addActionListener(payBillController);
    }

    public JTextField getShowNamePB() {
        return showNamePB;
    }

    public JTextField getShowEmailPB() {
        return showEmailPB;
    }

    public JTextField getShowCubicOfWaterPB() {
        return showCubicOfWaterPB;
    }

    public JTextField getShowElectricityNunberPB() {
        return showElectricityNunberPB;
    }

    public JTextField getShowDataCreateBillPB() {
        return showDataCreateBillPB;
    }

    public JTextField getShowIdRoomPB() {
        return showIdRoomPB;
    }

    public JTextField getShowIDRenterPB() {
        return showIDRenterPB;
    }

    public JTextField getShowMoneyToPay() {
        return showMoneyToPay;
    }

    public JTextField getShowIdBillPB() {
        return showIdBillPB;
    }

    public JTextField getEnterIDBillPB() {
        return enterIDBillPB;
    }

    public JLabel getIdBillUnpaid1PB() {
        return idBillUnpaid1PB;
    }

    public JLabel getIdBillUnpaid2PB() {
        return idBillUnpaid2PB;
    }

    public JLabel getIdBillUnpaid3PB() {
        return idBillUnpaid3PB;
    }

    public JLabel getIdBillUnpaid4PB() {
        return idBillUnpaid4PB;
    }

    public JLabel getIdBillUnpaid5PB() {
        return idBillUnpaid5PB;
    }

    public JLabel getIdBillUnpaid6PB() {
        return idBillUnpaid6PB;
    }

    public JLabel getIdBillUnpaid7PB() {
        return idBillUnpaid7PB;
    }

    public JLabel getIdRenterBill1PB() {
        return idRenterBill1PB;
    }

    public JLabel getIdRenterBill2PB() {
        return idRenterBill2PB;
    }

    public JLabel getIdRenterBill3PB() {
        return idRenterBill3PB;
    }

    public JLabel getIdRenterBill4PB() {
        return idRenterBill4PB;
    }

    public JLabel getIdRenterBill5PB() {
        return idRenterBill5PB;
    }

    public JLabel getIdRenterBill6PB() {
        return idRenterBill6PB;
    }

    public JLabel getIdRenterBill7PB() {
        return idRenterBill7PB;
    }
}
