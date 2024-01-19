package View.ManagerView;

import Controller.ManagerController.DeleteRenterController;

import javax.swing.*;
import java.awt.*;

public class PaneDeleteRenter extends JPanel {

    private JLabel textEnterIdRenterDL = new JLabel("ID");
    private JLabel textInputInformationDL = new JLabel("Update information");
    private JLabel textEnterSurnameDL = new JLabel("Surname");
    private JLabel textEnterMidlenameDL  = new JLabel("Middle name");
    private JLabel textEnterNameDL  = new JLabel("Name");
    private JLabel textEnterNumberPhoneDL  = new JLabel("Contact number");
    private JLabel textEnterScccdDL = new JLabel("Citizen number");
    private JLabel textEnterBirthDL  = new JLabel("Birth");
    private JLabel textEnterGenderDL  = new JLabel("Gender");
    private JLabel textEnternummberRoomDL  = new JLabel("Room number");
    private JLabel textPayBillDL  = new JLabel("Pay for room:");
    private JLabel textEmailDL  = new JLabel("Email");

    private JLabel enterNameLabelDL = new JLabel("Enter name");
    private JLabel enterBirthLabelDL = new JLabel("Enter birth");
    private JLabel choseeIdLabelDL = new JLabel("Chosee ID");
    private  JLabel textDescriptionDL = new JLabel("Find by name or birth");
    private  JLabel textDescription1DL = new JLabel("Find By ID");




    private JTextField showSurnameDL  = new JTextField();
    private JTextField  showMidlenameDL  = new JTextField();
    private JTextField  showNameDL = new JTextField();
    private JTextField  showSdtDL  = new JTextField();
    private JTextField  showScccdDL  = new JTextField();
    private JTextField  showBirthDL  = new JTextField();
    private JTextField  showGenderDL  = new JTextField();
    private JTextField  showIdRoomDL  = new JTextField();
    private JTextField  showIDRenterDL  = new JTextField();
    private JTextField  showEmailDL  = new JTextField();
    private JTextField resultNameSreachNameAndBirthDL = new JTextField();
    private JTextField resultBirthSreachNameAndBirthDL = new JTextField();
    private JTextField choseeIdDL = new JTextField();

    private JButton deleteButtonDL = new JButton("Delete Renter");

    private JButton searchButtonDL = new JButton("Search");
    private JButton searchByIDButtonDL = new JButton("Search by ID");

    private JSeparator separatorDL = new JSeparator(SwingConstants.VERTICAL);
    private JSeparator separator1DL = new JSeparator(SwingConstants.HORIZONTAL);

    Dimension dimensionJTextFieldDL = new Dimension(200,30);
    Dimension dimensionJTextFieldSearchDL = new Dimension(150,30);


    private Font fontDialog = new Font(Font.DIALOG,Font.PLAIN |Font.BOLD,16);
    private Font fontFamily  = loadCustomFont("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\font\\Anton\\Anton-Regular.ttf");

    JPanel panelSearchAndInputInfDL = new JPanel();

    JPanel panelShowInfDL = new JPanel();

    private SpringLayout springLayoutPanelDeleteDL = new SpringLayout();
    private SpringLayout springLayout = new SpringLayout();

    private DeleteRenterController deleteRenterController = new DeleteRenterController(this);


   public PaneDeleteRenter() {
       this.setBackground(new Color(240,255,255));
       this.setBackground(new Color(240,255,255));
       this.setLayout(springLayoutPanelDeleteDL);
       this.setPreferredSize(new Dimension(1100,800));

       panelShowInfDL.setPreferredSize(new Dimension(575,540));
       panelShowInfDL.setLayout(springLayout);

       separatorDL.setPreferredSize(new Dimension(1,550));
       separator1DL.setPreferredSize(new Dimension(230,1));

       this.add(separatorDL);
       this.add(separator1DL);
       this.add(deleteButtonDL);
       this.add(searchByIDButtonDL);
       this.add(searchButtonDL);
       this.add(panelShowInfDL);
       this.add(enterNameLabelDL);
       this.add(enterBirthLabelDL);
       this.add(choseeIdDL);
       this.add(choseeIdLabelDL);
       this.add(resultBirthSreachNameAndBirthDL);
       this.add(resultNameSreachNameAndBirthDL);
       this.add(separatorDL);
       this.add(textDescriptionDL);
       this.add(textDescription1DL);


       // xet trong suot cho cac panel
       panelShowInfDL.setOpaque(false);
       panelSearchAndInputInfDL.setOpaque(false);


       // them cac thanh phan vao panel
       panelShowInfDL.add(textEnterIdRenterDL);
       panelShowInfDL.add(showIDRenterDL);
       panelShowInfDL.add(textEnterSurnameDL);
       panelShowInfDL.add(showSurnameDL);
       panelShowInfDL.add(textEnterMidlenameDL);
       panelShowInfDL.add(showMidlenameDL);
       panelShowInfDL.add(textEnterNameDL);
       panelShowInfDL.add(showNameDL);
       panelShowInfDL.add(textEnterNumberPhoneDL);
       panelShowInfDL.add(showSdtDL);
       panelShowInfDL.add(textEnterScccdDL);
       panelShowInfDL.add(showScccdDL);
       panelShowInfDL.add(textEnterBirthDL);
       panelShowInfDL.add(showBirthDL);
       panelShowInfDL.add(textEnterGenderDL);
       panelShowInfDL.add(showGenderDL);
       panelShowInfDL.add(textEnternummberRoomDL);
       panelShowInfDL.add(showIdRoomDL);
       panelShowInfDL.add(textEmailDL);
       panelShowInfDL.add(showEmailDL);




       // chinh font chu
       textInputInformationDL.setFont(fontFamily);
       textEnterSurnameDL.setFont(fontDialog);
       textEnterMidlenameDL.setFont(fontDialog);
       textEnterNameDL.setFont(fontDialog);
       textEnterNumberPhoneDL.setFont(fontDialog);
       textEnterScccdDL.setFont(fontDialog);
       textEnterBirthDL.setFont(fontDialog);
       textEnterGenderDL.setFont(fontDialog);
       textEnternummberRoomDL.setFont(fontDialog);
       textPayBillDL.setFont(new Font(Font.DIALOG, Font.BOLD, 13));
       textEnterIdRenterDL.setFont(fontDialog);
       textEmailDL.setFont(fontDialog);
       enterBirthLabelDL.setFont(fontDialog);
       enterNameLabelDL.setFont(fontDialog);
       choseeIdLabelDL.setFont(fontDialog);
       textDescriptionDL.setFont(fontDialog);
       textDescription1DL.setFont(fontDialog);

       // chinh mau cho jlabel
       textDescriptionDL.setForeground(new Color(244, 164, 96));
       textDescription1DL.setForeground(new Color(244, 164, 96));

       //set kich thuoc cac JTextField
       showSurnameDL.setPreferredSize(dimensionJTextFieldDL);
       showMidlenameDL.setPreferredSize(dimensionJTextFieldDL);
       showNameDL.setPreferredSize(dimensionJTextFieldDL);
       showSdtDL.setPreferredSize(dimensionJTextFieldDL);
       showScccdDL.setPreferredSize(dimensionJTextFieldDL);
       showBirthDL.setPreferredSize(dimensionJTextFieldDL);
       showGenderDL.setPreferredSize(dimensionJTextFieldDL);
       showIdRoomDL.setPreferredSize(dimensionJTextFieldDL);
       showIDRenterDL.setPreferredSize(dimensionJTextFieldDL);
       showEmailDL.setPreferredSize(dimensionJTextFieldDL);
       resultBirthSreachNameAndBirthDL.setPreferredSize(dimensionJTextFieldSearchDL);
       resultNameSreachNameAndBirthDL.setPreferredSize(dimensionJTextFieldSearchDL);
       choseeIdDL.setPreferredSize(dimensionJTextFieldSearchDL);

       // bo goc cho jtextField
       showGenderDL.setBorder(BorderFactory.createLineBorder(Color.gray));
       showEmailDL.setBorder(BorderFactory.createLineBorder(Color.gray));
       showBirthDL.setBorder(BorderFactory.createLineBorder(Color.gray));
       showIDRenterDL.setBorder(BorderFactory.createLineBorder(Color.gray));
       showMidlenameDL.setBorder(BorderFactory.createLineBorder(Color.gray));
       showSdtDL.setBorder(BorderFactory.createLineBorder(Color.gray));
       showSurnameDL.setBorder(BorderFactory.createLineBorder(Color.gray));
       showNameDL.setBorder(BorderFactory.createLineBorder(Color.gray));
       showScccdDL.setBorder(BorderFactory.createLineBorder(Color.gray));
       showIdRoomDL.setBorder(BorderFactory.createLineBorder(Color.gray));
       resultBirthSreachNameAndBirthDL.setBorder(BorderFactory.createLineBorder(Color.gray));
       resultNameSreachNameAndBirthDL.setBorder(BorderFactory.createLineBorder(Color.gray));
       choseeIdDL.setBorder(BorderFactory.createLineBorder(Color.gray));

       // xet trong suot cho JTextField
       showGenderDL.setOpaque(false);
       showEmailDL.setOpaque(false);
       showBirthDL.setOpaque(false);
       showIDRenterDL.setOpaque(false);
       showMidlenameDL.setOpaque(false);
       showSdtDL.setOpaque(false);
       showSurnameDL.setOpaque(false);
       showNameDL.setOpaque(false);
       showScccdDL.setOpaque(false);
       showIdRoomDL.setOpaque(false);
       resultBirthSreachNameAndBirthDL.setOpaque(false);
       resultNameSreachNameAndBirthDL.setOpaque(false);
       choseeIdDL.setOpaque(false);

       //khoa jtextfield khong cho nguoi dung nhap du lieu
       showIDRenterDL.setEditable(false);
       showGenderDL.setEditable(false);
       showEmailDL.setEditable(false);
       showBirthDL.setEditable(false);
       showMidlenameDL.setEditable(false);
       showSdtDL.setEditable(false);
       showSurnameDL.setEditable(false);
       showNameDL.setEditable(false);
       showScccdDL.setEditable(false);
       showIdRoomDL.setEditable(false);



       deleteButtonDL.setCursor(new Cursor(Cursor.HAND_CURSOR));
       searchButtonDL.setCursor(new Cursor(Cursor.HAND_CURSOR));
       searchByIDButtonDL.setCursor(new Cursor(Cursor.HAND_CURSOR));
       deleteButtonDL.setCursor(new Cursor(Cursor.HAND_CURSOR));

       searchButtonDL.setFocusPainted(false);
       searchByIDButtonDL.setFocusPainted(false);
       deleteButtonDL.setFocusPainted(false);



       springLayoutPanelDeleteDL.putConstraint(springLayout.NORTH,separatorDL,90,springLayout.NORTH,this);
       springLayoutPanelDeleteDL.putConstraint(springLayout.WEST,separatorDL,480,springLayout.WEST,this);

       springLayoutPanelDeleteDL.putConstraint(springLayout.NORTH,separator1DL,320,springLayout.NORTH,this);
       springLayoutPanelDeleteDL.putConstraint(springLayout.WEST,separator1DL,250,springLayout.WEST,this);

       springLayoutPanelDeleteDL.putConstraint(springLayout.NORTH,textDescriptionDL,90,springLayout.NORTH,this);
       springLayoutPanelDeleteDL.putConstraint(springLayout.WEST,textDescriptionDL,270,springLayout.WEST,this);

       springLayoutPanelDeleteDL.putConstraint(springLayout.NORTH,textDescription1DL,330,springLayout.NORTH,this);
       springLayoutPanelDeleteDL.putConstraint(springLayout.WEST,textDescription1DL,270,springLayout.WEST,this);

       springLayoutPanelDeleteDL.putConstraint(springLayout.NORTH,enterNameLabelDL,120,springLayout.NORTH,this);
       springLayoutPanelDeleteDL.putConstraint(springLayout.WEST,enterNameLabelDL,285,springLayout.WEST,this);

       springLayoutPanelDeleteDL.putConstraint(springLayout.NORTH,resultNameSreachNameAndBirthDL,145,springLayout.NORTH,this);
       springLayoutPanelDeleteDL.putConstraint(springLayout.WEST,resultNameSreachNameAndBirthDL,275,springLayout.WEST,this);

       springLayoutPanelDeleteDL.putConstraint(springLayout.NORTH,enterBirthLabelDL,200,springLayout.NORTH,this);
       springLayoutPanelDeleteDL.putConstraint(springLayout.WEST,enterBirthLabelDL,285,springLayout.WEST,this);

       springLayoutPanelDeleteDL.putConstraint(springLayout.NORTH,resultBirthSreachNameAndBirthDL,225,springLayout.NORTH,this);
       springLayoutPanelDeleteDL.putConstraint(springLayout.WEST,resultBirthSreachNameAndBirthDL,275,springLayout.WEST,this);

       springLayoutPanelDeleteDL.putConstraint(springLayout.NORTH,searchButtonDL,270,springLayout.NORTH,this);
       springLayoutPanelDeleteDL.putConstraint(springLayout.WEST,searchButtonDL,310,springLayout.WEST,this);

       springLayoutPanelDeleteDL.putConstraint(springLayout.NORTH,choseeIdLabelDL,360,springLayout.NORTH,this);
       springLayoutPanelDeleteDL.putConstraint(springLayout.WEST,choseeIdLabelDL,285,springLayout.WEST,this);

       springLayoutPanelDeleteDL.putConstraint(springLayout.NORTH,choseeIdDL,390,springLayout.NORTH,this);
       springLayoutPanelDeleteDL.putConstraint(springLayout.WEST,choseeIdDL,275,springLayout.WEST,this);

       springLayoutPanelDeleteDL.putConstraint(springLayout.NORTH,searchByIDButtonDL,440,springLayout.NORTH,this);
       springLayoutPanelDeleteDL.putConstraint(springLayout.WEST,searchByIDButtonDL,296,springLayout.WEST,this);

       springLayoutPanelDeleteDL.putConstraint(springLayout.NORTH,panelShowInfDL,90,springLayout.NORTH,this);
       springLayoutPanelDeleteDL.putConstraint(springLayout.WEST,panelShowInfDL,455,springLayout.WEST,this);

       springLayout.putConstraint(springLayout.NORTH,showIDRenterDL,45,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,showIDRenterDL,50,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,showSurnameDL,45,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,showSurnameDL,340,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,showMidlenameDL,135,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,showMidlenameDL,50,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,showNameDL,135,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,showNameDL,340,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,showSdtDL,225,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,showSdtDL,50,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,showScccdDL,225,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,showScccdDL,340,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,showBirthDL,315,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,showBirthDL,50,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,showGenderDL,315,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,showGenderDL,340,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,showIdRoomDL,405,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,showIdRoomDL,50,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,showEmailDL,405,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,showEmailDL,340,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,textEnterIdRenterDL,20,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,textEnterIdRenterDL,55,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,textEnterSurnameDL,20,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,textEnterSurnameDL,345,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,textEnterMidlenameDL,112,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,textEnterMidlenameDL,55,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,textEnterNameDL,112 ,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,textEnterNameDL,345,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,textEnterNumberPhoneDL,202,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,textEnterNumberPhoneDL,55,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,textEnterScccdDL,202,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,textEnterScccdDL,345,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,textEnterBirthDL,292,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,textEnterBirthDL,55,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,textEnterGenderDL,292,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,textEnterGenderDL,345,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,textEnternummberRoomDL,382,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,textEnternummberRoomDL,55,springLayout.WEST,panelShowInfDL);

       springLayout.putConstraint(springLayout.NORTH,textEmailDL,382,springLayout.NORTH,panelShowInfDL);
       springLayout.putConstraint(springLayout.WEST,textEmailDL,345,springLayout.WEST,panelShowInfDL);

       springLayoutPanelDeleteDL.putConstraint(springLayout.NORTH,deleteButtonDL,585,springLayout.NORTH,this);
       springLayoutPanelDeleteDL.putConstraint(springLayout.WEST,deleteButtonDL,695,springLayout.WEST,this);

       // lang nghe su kien
       searchByIDButtonDL.addActionListener(deleteRenterController);
       searchButtonDL.addActionListener(deleteRenterController);
       deleteButtonDL.addActionListener(deleteRenterController);

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

    public JTextField getShowSurnameDL() {
        return showSurnameDL;
    }

    public JTextField getShowMidlenameDL() {
        return showMidlenameDL;
    }

    public JTextField getShowNameDL() {
        return showNameDL;
    }

    public JTextField getShowSdtDL() {
        return showSdtDL;
    }

    public JTextField getShowScccdDL() {
        return showScccdDL;
    }

    public JTextField getShowBirthDL() {
        return showBirthDL;
    }

    public JTextField getShowGenderDL() {
        return showGenderDL;
    }

    public JTextField getShowIdRoomDL() {
        return showIdRoomDL;
    }

    public JTextField getShowIDRenterDL() {
        return showIDRenterDL;
    }

    public JTextField getShowEmailDL() {
        return showEmailDL;
    }

    public JTextField getResultNameSreachNameAndBirthDL() {
        return resultNameSreachNameAndBirthDL;
    }

    public JTextField getResultBirthSreachNameAndBirthDL() {
        return resultBirthSreachNameAndBirthDL;
    }

    public JTextField getChoseeIdDL() {
        return choseeIdDL;
    }
}
