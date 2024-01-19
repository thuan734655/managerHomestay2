package View.ManagerView;

import Controller.ManagerController.AddRenterController;
import DAO.RoomDAO;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

public class PaneAddRenter extends JPanel{
    private JLabel textEnterIdRenterOA = new JLabel("ID");
    private JLabel textInputInformationOA = new JLabel("Sign in information");
    private JLabel textEnterSurnameOA = new JLabel("Surname");
    private JLabel textEnterMidlenameOA = new JLabel("Middle name");
    private JLabel textEnterNameOA = new JLabel("Name");
    private JLabel textEnterNumberPhoneOA = new JLabel("Contact number");
    private JLabel textEnterScccdOA = new JLabel("Citizen number");
    private JLabel textEnterBirthOA = new JLabel("Birth");
    private JLabel textEnterGenderOA = new JLabel("Gender");
    private JLabel textEnternummberRoomOA = new JLabel("Room number");
    private JLabel textPayBillOA = new JLabel("Pay for room:");
    private JLabel textEmailOA = new JLabel("Email");


    private JLabel textDescription3OA = new JLabel("Date format is yyyy-MM-dd.");
    private JLabel textDescription4OA = new JLabel("Enter only one word.");
    private JTextField inputSurnameOA = new JTextField();
    private JTextField inputMidlenameOA = new JTextField();
    private JTextField inputNameOA = new JTextField();
    private JTextField inputSdtOA = new JTextField();
    private JTextField inputScccdOA = new JTextField();
    private JTextField inputBirthOA = new JTextField();
    private JTextField inputGenderOA = new JTextField();
    private JTextField inputIdPhongOA = new JTextField();
    private JTextField inputIDRenterOA = new JTextField();
    private JTextField inputEmailOA = new JTextField();
    String[] optionRoomEmptyOA = {"1","2","3","4","5","6","7","8"};

    private JComboBox<String> optionRoomOAJcombobox = new JComboBox<>(optionRoomEmptyOA);


    String[] optionGenderOA = {"Nam","Nữ"};

    private JComboBox<String> optionGenderOAJcombobox = new JComboBox<>(optionGenderOA);



    private JRadioButton radioButtonPaidOA = new JRadioButton("Paid");
    private JRadioButton radioButtonUnpaidOA = new JRadioButton("Unpaid");
    private ButtonGroup buttonGroupPayBillOA = new ButtonGroup();
    private JButton confirmOA = new JButton("Add renter");


    Dimension dimensionJTextFieldOA = new Dimension(200,30);
    JPanel panelInputInfOA = new JPanel();

    private SpringLayout springLayoutPanelAddOA = new SpringLayout();

    private Font fontDialog = new Font(Font.DIALOG,Font.PLAIN |Font.BOLD,16);

    private Font fontFamily  = loadCustomFont("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\font\\Anton\\Anton-Regular.ttf");

    private SpringLayout springLayout = new SpringLayout();

    private AddRenterController addRenterController = new AddRenterController(this);
    public PaneAddRenter() {
        this.setBackground(new Color(240,255,255));
        panelInputInfOA.setBackground(new Color(240,255,255));

        // chinh sua kich thuoc cho panel
        this.setPreferredSize(new Dimension(1100,800));
        panelInputInfOA.setPreferredSize(new Dimension(600,540));


        // set layout cho cac panel
        this.setLayout(springLayoutPanelAddOA);
        panelInputInfOA.setLayout(springLayout);

        // them thanh phan vao panelAddRenter
        this.add(textDescription3OA);
        this.add(textDescription4OA);
        this.add(panelInputInfOA);
        this.add(confirmOA);


        // xet trong suot cho cac panel
        panelInputInfOA.setOpaque(false);

        // them cac thanh phan vao panel
        panelInputInfOA.add(textEnterIdRenterOA);
        panelInputInfOA.add(inputIDRenterOA);
        panelInputInfOA.add(textEnterSurnameOA);
        panelInputInfOA.add(inputSurnameOA);
        panelInputInfOA.add(textEnterMidlenameOA);
        panelInputInfOA.add(inputMidlenameOA);
        panelInputInfOA.add(textEnterNameOA);
        panelInputInfOA.add(inputNameOA);
        panelInputInfOA.add(textEnterNumberPhoneOA);
        panelInputInfOA.add(inputSdtOA);
        panelInputInfOA.add(textEnterScccdOA);
        panelInputInfOA.add(inputScccdOA);
        panelInputInfOA.add(textEnterBirthOA);
        panelInputInfOA.add(inputBirthOA);
        panelInputInfOA.add(textEnterGenderOA);
        panelInputInfOA.add(inputGenderOA);
        panelInputInfOA.add(textEnternummberRoomOA);
        panelInputInfOA.add(inputIdPhongOA);
        panelInputInfOA.add(textPayBillOA);
        panelInputInfOA.add(radioButtonPaidOA);
        panelInputInfOA.add(radioButtonUnpaidOA);
        panelInputInfOA.add(textEmailOA);
        panelInputInfOA.add(inputEmailOA);
        panelInputInfOA.add(optionRoomOAJcombobox);
        panelInputInfOA.add(optionGenderOAJcombobox);


        // chinh font chu
        textInputInformationOA.setFont(fontFamily);
        textEnterSurnameOA.setFont(fontDialog);
        textEnterMidlenameOA.setFont(fontDialog);
        textEnterNameOA.setFont(fontDialog);
        textEnterNumberPhoneOA.setFont(fontDialog);
        textEnterScccdOA.setFont(fontDialog);
        textEnterBirthOA.setFont(fontDialog);
        textEnterGenderOA.setFont(fontDialog);
        textEnternummberRoomOA.setFont(fontDialog);
        textPayBillOA.setFont(new Font(Font.DIALOG, Font.BOLD, 13));
        textEnterIdRenterOA.setFont(fontDialog);
        textEmailOA.setFont(fontDialog);

        // chinh mau chu cho cac text
        textInputInformationOA.setForeground(new Color(160, 82, 45));
        textDescription3OA.setForeground(new Color(238, 0, 0));
        textDescription4OA.setForeground(new Color(238, 0, 0));


//        //set kich thuoc cac JTextField
        inputSurnameOA.setPreferredSize(dimensionJTextFieldOA);
        inputMidlenameOA.setPreferredSize(dimensionJTextFieldOA);
        inputNameOA.setPreferredSize(dimensionJTextFieldOA);
        inputSdtOA.setPreferredSize(dimensionJTextFieldOA);
        inputScccdOA.setPreferredSize(dimensionJTextFieldOA);
        inputBirthOA.setPreferredSize(dimensionJTextFieldOA);
        inputGenderOA.setPreferredSize(new Dimension(170,30));
        inputIdPhongOA.setPreferredSize(new Dimension(170,30));
        inputIDRenterOA.setPreferredSize(dimensionJTextFieldOA);
        inputEmailOA.setPreferredSize(dimensionJTextFieldOA);

        // bo goc cho jtextField
        inputGenderOA.setBorder(BorderFactory.createLineBorder(Color.gray));
        inputEmailOA.setBorder(BorderFactory.createLineBorder(Color.gray));
        inputBirthOA.setBorder(BorderFactory.createLineBorder(Color.gray));
        inputIDRenterOA.setBorder(BorderFactory.createLineBorder(Color.gray));
        inputMidlenameOA.setBorder(BorderFactory.createLineBorder(Color.gray));
        inputSdtOA.setBorder(BorderFactory.createLineBorder(Color.gray));
        inputSurnameOA.setBorder(BorderFactory.createLineBorder(Color.gray));
        inputNameOA.setBorder(BorderFactory.createLineBorder(Color.gray));
        inputScccdOA.setBorder(BorderFactory.createLineBorder(Color.gray));
        inputIdPhongOA.setBorder(BorderFactory.createLineBorder(Color.gray));

        // xet trong suot cho JTextField
        inputGenderOA.setOpaque(false);
        inputEmailOA.setOpaque(false);
        inputBirthOA.setOpaque(false);
        inputIDRenterOA.setOpaque(false);
        inputMidlenameOA.setOpaque(false);
        inputSdtOA.setOpaque(false);
        inputSurnameOA.setOpaque(false);
        inputNameOA.setOpaque(false);
        inputScccdOA.setOpaque(false);
        inputIdPhongOA.setOpaque(false);

        // khoa jtextfield khong cho ngnoi dung nhap
        inputIDRenterOA.setEditable(false);



        // them radioButton vao buttonGroup de chi duoc chon 1 trong 2 button
        buttonGroupPayBillOA.add(radioButtonPaidOA);
        buttonGroupPayBillOA.add(radioButtonUnpaidOA);

        // xoa vien cho button
        radioButtonUnpaidOA.setFocusPainted(false);
        radioButtonPaidOA.setFocusPainted(false);
        radioButtonUnpaidOA.setOpaque(false);
        radioButtonPaidOA.setOpaque(false);
        confirmOA.setFocusPainted(false);

        // chinh sua bieu tuong con chuot
        radioButtonPaidOA.setCursor(new Cursor(Cursor.HAND_CURSOR));
        radioButtonUnpaidOA.setCursor(new Cursor(Cursor.HAND_CURSOR));
        inputIDRenterOA.setCursor(new Cursor(Cursor.HAND_CURSOR));
        confirmOA.setCursor(new Cursor(Cursor.HAND_CURSOR));


        // Thêm đường viền cho JComboBox
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        optionRoomOAJcombobox.setBorder(border);

        optionRoomOAJcombobox.setUI(new BasicComboBoxUI() {
            protected JButton createArrowButton() {
                ImageIcon ionArrow = new ImageIcon("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\img\\icons8-down-arrow-50.png");
                Image iconArowImg = ionArrow.getImage();
                ImageIcon ReszeIconArowImg = new ImageIcon(iconArowImg.getScaledInstance(15, 15, Image.SCALE_SMOOTH));
                JButton arrowButton = new JButton("",ReszeIconArowImg);

                // Thêm ActionListener cho nút mũi tên
                arrowButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        RoomDAO roomDAO = new RoomDAO();
                        ArrayList<String> listRoomEmpty = roomDAO.selectByStatusRoom("Still empty");
                        optionRoomOAJcombobox.removeAllItems();
                        for (String x : listRoomEmpty) {
                            optionRoomOAJcombobox.addItem(x);
                        }
                    }
                });
                return arrowButton;
            }

        });



        springLayoutPanelAddOA.putConstraint(springLayout.NORTH,panelInputInfOA,80,springLayout.NORTH,this);
        springLayoutPanelAddOA.putConstraint(springLayout.WEST,panelInputInfOA,378,springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH,inputIDRenterOA,45,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,inputIDRenterOA,50,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,inputSurnameOA,45,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,inputSurnameOA,340,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,inputMidlenameOA,135,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,inputMidlenameOA,50,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,inputNameOA,135,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,inputNameOA,340,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,inputSdtOA,225,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,inputSdtOA,50,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,inputScccdOA,225,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,inputScccdOA,340,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,inputBirthOA,315,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,inputBirthOA,50,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,inputGenderOA,315,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,inputGenderOA,340,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,inputIdPhongOA,405,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,inputIdPhongOA,50,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,optionRoomOAJcombobox,408,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,optionRoomOAJcombobox,230,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,optionGenderOAJcombobox,318,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,optionGenderOAJcombobox,525,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,inputEmailOA,405,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,inputEmailOA,340,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,radioButtonPaidOA,478,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,radioButtonPaidOA,230,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,radioButtonUnpaidOA,478,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,radioButtonUnpaidOA,380,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,textEnterIdRenterOA,20,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,textEnterIdRenterOA,55,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,textEnterSurnameOA,20,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,textEnterSurnameOA,345,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,textEnterMidlenameOA,112,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,textEnterMidlenameOA,55,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,textEnterNameOA,112 ,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,textEnterNameOA,345,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,textEnterNumberPhoneOA,202,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,textEnterNumberPhoneOA,55,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,textEnterScccdOA,202,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,textEnterScccdOA,345,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,textEnterBirthOA,292,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,textEnterBirthOA,55,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,textEnterGenderOA,292,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,textEnterGenderOA,345,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,textEnternummberRoomOA,382,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,textEnternummberRoomOA,55,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,textEmailOA,382,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,textEmailOA,345,springLayout.WEST,panelInputInfOA);

        springLayout.putConstraint(springLayout.NORTH,textPayBillOA,478,springLayout.NORTH,panelInputInfOA);
        springLayout.putConstraint(springLayout.WEST,textPayBillOA,60,springLayout.WEST,panelInputInfOA);

        springLayoutPanelAddOA.putConstraint(springLayout.NORTH,confirmOA,610,springLayout.NORTH,this);
        springLayoutPanelAddOA.putConstraint(springLayout.WEST,confirmOA,640,springLayout.WEST,this);

        springLayoutPanelAddOA.putConstraint(springLayout.NORTH,textDescription3OA,430,springLayout.NORTH,this);
        springLayoutPanelAddOA.putConstraint(springLayout.WEST,textDescription3OA,430,springLayout.WEST,this);

        springLayoutPanelAddOA.putConstraint(springLayout.NORTH,textDescription4OA,160,springLayout.NORTH,this);
        springLayoutPanelAddOA.putConstraint(springLayout.WEST,textDescription4OA,730,springLayout.WEST,this);

        //lang nghe su kien
        confirmOA.addActionListener(addRenterController);
        radioButtonPaidOA.addActionListener(addRenterController);
        radioButtonUnpaidOA.addActionListener(addRenterController);
        inputIDRenterOA.addMouseListener(addRenterController);
        optionRoomOAJcombobox.addActionListener(addRenterController);
        optionGenderOAJcombobox.addActionListener(addRenterController);

    }

    private static Font loadCustomFont(String fontPath) {
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

    public JComboBox<String> getOptionRoomOAJcombobox() {
        return optionRoomOAJcombobox;
    }

    public JComboBox<String> getOptionGenderOAJcombobox() {
        return optionGenderOAJcombobox;
    }

    public JTextField getInputSurnameOA() {
        return inputSurnameOA;
    }

    public JTextField getInputMidlenameOA() {
        return inputMidlenameOA;
    }

    public JTextField getInputNameOA() {
        return inputNameOA;
    }

    public JTextField getInputSdtOA() {
        return inputSdtOA;
    }

    public JTextField getInputScccdOA() {
        return inputScccdOA;
    }

    public JTextField getInputBirthOA() {
        return inputBirthOA;
    }

    public JTextField getInputGenderOA() {
        return inputGenderOA;
    }

    public JTextField getInputIdPhongOA() {
        return inputIdPhongOA;
    }

    public JTextField getInputIDRenterOA() {
        return inputIDRenterOA;
    }

    public JTextField getInputEmailOA() {
        return inputEmailOA;
    }

}
