package View.ManagerView;

import Controller.ManagerController.PanelManagerController;
import DAO.RenterDAO;

import javax.swing.*;
import java.awt.*;

public class PanelNavigate extends JPanel {
    RenterDAO renterDAO = new RenterDAO();
    private JButton infRenterMG= new JButton("Renter information");
    private JButton infRoomMG= new JButton("Room information");
    private static JButton addRenterMG = new JButton("Add renter");
    private JButton updateRenterInfMG = new JButton("Update renter informaton");
    private JButton deleteRenterMG = new JButton("Delete renter");
    private JButton findRenterMG = new JButton("Find renter");
    private JButton payBilllMG = new JButton("Pay bill");
    private JButton sendMailMG = new JButton("Send email");
    private JButton changePassMG = new JButton("Change password");
    private JButton  BillMG = new JButton("Create bill");


    private SpringLayout springLayoutMG = new SpringLayout();

    public PanelNavigate(ManagerView managerView) {
        PanelManagerController panelManagerController = new PanelManagerController(this,managerView);



        //lang nghe su kien
        infRenterMG.addActionListener(panelManagerController);
        infRoomMG.addActionListener(panelManagerController);
        addRenterMG.addActionListener(panelManagerController);
        updateRenterInfMG.addActionListener(panelManagerController);
        findRenterMG.addActionListener(panelManagerController);
        deleteRenterMG.addActionListener(panelManagerController);
        sendMailMG.addActionListener(panelManagerController);
        changePassMG.addActionListener(panelManagerController);
        payBilllMG.addActionListener(panelManagerController);
        BillMG.addActionListener(panelManagerController);

       init();
    }
    public void init() {

        this.setPreferredSize(new Dimension(260,700));
        this.setBackground(new Color(16,	54,	103));


        this.setLayout(springLayoutMG);

        // them cac button vao panel
        this.add(infRenterMG);
        this.add(addRenterMG);
        this.add(updateRenterInfMG);
        this.add(findRenterMG);
        this.add(deleteRenterMG);
        this.add(sendMailMG);
        this.add(changePassMG);
        this.add(payBilllMG);
        this.add(BillMG);
        this.add(infRoomMG);

        // xoa vien cho cac button
        infRenterMG.setBorderPainted(false);
        infRenterMG.setFocusPainted(false);
        addRenterMG.setBorderPainted(false);
        addRenterMG.setFocusPainted(false);
        updateRenterInfMG.setBorderPainted(false);
        updateRenterInfMG.setFocusPainted(false);
        findRenterMG.setBorderPainted(false);
        findRenterMG.setFocusPainted(false);
        deleteRenterMG.setBorderPainted(false);
        deleteRenterMG.setFocusPainted(false);
        sendMailMG.setBorderPainted(false);
        sendMailMG.setFocusPainted(false);
        changePassMG.setBorderPainted(false);
        changePassMG.setFocusPainted(false);
        payBilllMG.setBorderPainted(false);
        payBilllMG.setFocusPainted(false);
        BillMG.setBorderPainted(false);
        BillMG.setFocusPainted(false);
        infRoomMG.setBorderPainted(false);
        infRoomMG.setFocusPainted(false);

        //chinh sua kich thuoc cua button
        infRenterMG.setPreferredSize(new Dimension(260,30));
        addRenterMG.setPreferredSize(new Dimension(260,30));
        updateRenterInfMG.setPreferredSize(new Dimension(260,30));
        findRenterMG.setPreferredSize(new Dimension(260,30));
        deleteRenterMG.setPreferredSize(new Dimension(260,30));
        sendMailMG.setPreferredSize(new Dimension(260,30));
        changePassMG.setPreferredSize(new Dimension(260,30));
        payBilllMG.setPreferredSize(new Dimension(260,30));
        BillMG.setPreferredSize(new Dimension(260,30));
        infRoomMG.setPreferredSize(new Dimension(260,30));


        //chinh sua mau background cua button
        infRenterMG.setBackground(new Color(0, 178, 238));
        addRenterMG.setBackground(new Color(16,	54,	103));
        updateRenterInfMG.setBackground(new Color(16,	54,	103));
        findRenterMG.setBackground(new Color(16,	54,	103));
        deleteRenterMG.setBackground(new Color(16,	54,	103));
        sendMailMG.setBackground(new Color(16,	54,	103));
        changePassMG.setBackground(new Color(16,	54,	103));
        payBilllMG.setBackground(new Color(16,	54,	103));
        BillMG.setBackground(new Color(16,	54,	103));
        infRoomMG.setBackground(new Color(16,	54,	103));

        //chinh sua mau chu cua button
        infRenterMG.setForeground(new Color(236,	236,	236));
        addRenterMG.setForeground(new Color(236,	236,	236));
        updateRenterInfMG.setForeground(new Color(236,	236,	236));
        findRenterMG.setForeground(new Color(236,	236,	236));
        deleteRenterMG.setForeground(new Color(236,	236,	236));
        sendMailMG.setForeground(new Color(236,	236,	236));
        changePassMG.setForeground(new Color(236,	236,	236));
        payBilllMG.setForeground(new Color(236,	236,	236));
        BillMG.setForeground(new Color(236,	236,	236));
        infRoomMG.setForeground(new Color(236,	236,	236));


        //chinh sua hinh con chuot cua button
        infRenterMG.setCursor(new Cursor(Cursor.HAND_CURSOR));
        addRenterMG.setCursor(new Cursor(Cursor.HAND_CURSOR));
        updateRenterInfMG.setCursor(new Cursor(Cursor.HAND_CURSOR));
        findRenterMG.setCursor(new Cursor(Cursor.HAND_CURSOR));
        deleteRenterMG.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sendMailMG.setCursor(new Cursor(Cursor.HAND_CURSOR));
        changePassMG.setCursor(new Cursor(Cursor.HAND_CURSOR));
        payBilllMG.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BillMG.setCursor(new Cursor(Cursor.HAND_CURSOR));
        infRoomMG.setCursor(new Cursor(Cursor.HAND_CURSOR));



        springLayoutMG.putConstraint(springLayoutMG.NORTH,infRenterMG,20,springLayoutMG.NORTH,this);
        springLayoutMG.putConstraint(springLayoutMG.WEST,infRenterMG,10,springLayoutMG.WEST,this);

        springLayoutMG.putConstraint(springLayoutMG.NORTH,infRoomMG,60,springLayoutMG.NORTH,this);
        springLayoutMG.putConstraint(springLayoutMG.WEST,infRoomMG,10,springLayoutMG.WEST,this);

        springLayoutMG.putConstraint(springLayoutMG.NORTH,addRenterMG,110,springLayoutMG.NORTH,this);
        springLayoutMG.putConstraint(springLayoutMG.WEST,addRenterMG,10,springLayoutMG.WEST,this);

        springLayoutMG.putConstraint(springLayoutMG.NORTH,updateRenterInfMG,160,springLayoutMG.NORTH,this);
        springLayoutMG.putConstraint(springLayoutMG.WEST,updateRenterInfMG,10,springLayoutMG.WEST,this);

        springLayoutMG.putConstraint(springLayoutMG.NORTH,deleteRenterMG,210,springLayoutMG.NORTH,this);
        springLayoutMG.putConstraint(springLayoutMG.WEST,deleteRenterMG,10,springLayoutMG.WEST,this);

        springLayoutMG.putConstraint(springLayoutMG.NORTH,findRenterMG,260,springLayoutMG.NORTH,this);
        springLayoutMG.putConstraint(springLayoutMG.WEST,findRenterMG,10,springLayoutMG.WEST,this);

        springLayoutMG.putConstraint(springLayoutMG.NORTH,sendMailMG,410,springLayoutMG.NORTH,this);
        springLayoutMG.putConstraint(springLayoutMG.WEST,sendMailMG,10,springLayoutMG.WEST,this);

        springLayoutMG.putConstraint(springLayoutMG.NORTH,payBilllMG,360,springLayoutMG.NORTH,this);
        springLayoutMG.putConstraint(springLayoutMG.WEST,payBilllMG,10,springLayoutMG.WEST,this);



        springLayoutMG.putConstraint(springLayoutMG.NORTH,BillMG,310,springLayoutMG.NORTH,this);
        springLayoutMG.putConstraint(springLayoutMG.WEST,BillMG,10,springLayoutMG.WEST,this);

        springLayoutMG.putConstraint(springLayoutMG.NORTH,changePassMG,460,springLayoutMG.NORTH,this);
        springLayoutMG.putConstraint(springLayoutMG.WEST,changePassMG,10,springLayoutMG.WEST,this);

    }

    private  Font loadCustomFont(String fontPath) {
        Font customFont = null;
        try {
            // Load font từ tệp
            customFont = Font.createFont(Font.TRUETYPE_FONT, new java.io.File(fontPath));

            // Kích thước font mặc định
            customFont = customFont.deriveFont(24f);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return customFont;
    }


    public JButton getInfRenterMG() {
        return infRenterMG;
    }

    public JButton getAddRenterMG() {
        return addRenterMG;
    }

    public JButton getUpdateRenterInfMG() {
        return updateRenterInfMG;
    }

    public JButton getDeleteRenterMG() {
        return deleteRenterMG;
    }

    public JButton getFindRenterMG() {
        return findRenterMG;
    }

    public JButton getpayBilllMGMG() {
        return payBilllMG;
    }



    public JButton getSendMailMG() {
        return sendMailMG;
    }

    public JButton getChangePassMG() {
        return changePassMG;
    }


    public JButton getBillMG() {
        return BillMG;
    }

    public JButton getInfRoomMG() {
        return infRoomMG;
    }

}
