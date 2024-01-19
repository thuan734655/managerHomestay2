package View.ManagerView;

import Controller.ManagerController.UpdateInfRenterController;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelUpdateRenter extends JPanel {
    // cac thanh phan cua paneUpdateRenter
    private JLabel textEnterIdRenterDA = new JLabel("ID");
    private JLabel textInputInformationDA = new JLabel("Update information");
    private JLabel textEnterSurnameDA = new JLabel("Surname");
    private JLabel textEnterMidlenameDA  = new JLabel("Middle name");
    private JLabel textEnterNameDA  = new JLabel("Name");
    private JLabel textEnterNumberPhoneDA  = new JLabel("Contact number");
    private JLabel textEnterScccdDA  = new JLabel("Citizen number");
    private JLabel textEnterBirthDA  = new JLabel("Birth");
    private JLabel textEnterGenderDA  = new JLabel("Gender");
    private JLabel textEnternummberRoomDA  = new JLabel("Room number");
    private JLabel textPayBillDA  = new JLabel("Pay for room:");
    private JLabel textEmailDA  = new JLabel("Email");

    private JLabel enterNameLabelDA = new JLabel("Enter name");
    private JLabel enterBirthLabelDA = new JLabel("Enter birth");
    private JLabel choseeIdLabelDA = new JLabel("Chosee ID");
    private  JLabel textDescriptionDA = new JLabel("Find by name or birth");
    private  JLabel textDescription1DA = new JLabel("Find By ID");
    private  JLabel textDescription2DA = new JLabel("Date format is yyyy-MM-dd.");



    private JTextField inputSurnameDA  = new JTextField();
    private JTextField inputMidlenameDA  = new JTextField();
    private JTextField inputNameDA  = new JTextField();
    private JTextField inputSdtDA  = new JTextField();
    private JTextField inputScccdDA  = new JTextField();
    private JTextField inputBirthDA  = new JTextField();
    private JTextField inputGenderDA  = new JTextField();
    private JTextField inputIRoomDA  = new JTextField();
    private JTextField inputIDRenterDA  = new JTextField();
    private JTextField inputEmailDA  = new JTextField();
    private JTextField inputSearchRenterByNameDA = new JTextField();
    private JTextField inputSearchRenterByBirthDA = new JTextField();
    private JTextField resultNameSreachNameAndBirthDA = new JTextField();
    private JTextField resultBirthSreachNameAndBirthDA = new JTextField();
    private JTextField choseeIdDA = new JTextField();


    String[] optionGenderDA  = {"Nam","Nữ"};

    private JComboBox<String> optionGenderDAJcombobox = new JComboBox<>(optionGenderDA );



    private JRadioButton radioButtonPaidDA = new JRadioButton("Paid");
    private JRadioButton radioButtonUnpaidDA = new JRadioButton("Unpaid");
    private ButtonGroup buttonGroupPayBillDA = new ButtonGroup();
    private JButton updateButtonDA = new JButton("Update Renter");

    private JButton searchButtonDA = new JButton("Search");
    private JButton confirmButtonDA = new JButton("Search by ID");

    private JSeparator separatorDA = new JSeparator(SwingConstants.VERTICAL);
    private JSeparator separator1DA = new JSeparator(SwingConstants.HORIZONTAL);

    Dimension dimensionJTextFieldDA = new Dimension(200,30);
    Dimension dimensionJTextFieldSearchDA = new Dimension(150,30);

    JPanel panelInputInfDA = new JPanel();

    private SpringLayout springLayoutPanelAddDA = new SpringLayout();
    private SpringLayout springLayout = new SpringLayout();

    private Font fontDialog = new Font(Font.DIALOG,Font.PLAIN |Font.BOLD,16);
    private Font fontFamily  = loadCustomFont("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\font\\Anton\\Anton-Regular.ttf");
    private UpdateInfRenterController updateInfRenterController = new UpdateInfRenterController(this);

  public PanelUpdateRenter(){


      this.setBackground(new Color(240,255,255));
      panelInputInfDA.setBackground(new Color(240,255,255));

      // chinh sua kich thuoc cho panel
      this.setPreferredSize(new Dimension(1100,800));
      panelInputInfDA.setPreferredSize(new Dimension(575,540));

      separatorDA.setPreferredSize(new Dimension(1,550));
      separator1DA.setPreferredSize(new Dimension(230,1));
      // set layout cho cac panel
      this.setLayout(springLayoutPanelAddDA);
      panelInputInfDA.setLayout(springLayout);



      // them thanh phan vao panelAddRenter
      this.add(separatorDA);
      this.add(separator1DA);
      this.add(textDescription1DA);
      this.add(textDescription2DA);
      this.add(updateButtonDA);
      this.add(panelInputInfDA);
      this.add(searchButtonDA);
      this.add(separatorDA);
      this.add(confirmButtonDA);
      this.add(enterNameLabelDA);
      this.add(enterBirthLabelDA);
      this.add(choseeIdDA);
      this.add(choseeIdLabelDA);
      this.add(resultBirthSreachNameAndBirthDA);
      this.add(resultNameSreachNameAndBirthDA);
      this.add(textDescriptionDA);


      // xet trong suot cho cac panel
      panelInputInfDA.setOpaque(false);



      // them cac thanh phan vao panel
      panelInputInfDA.add(textEnterIdRenterDA);
      panelInputInfDA.add(inputIDRenterDA);
      panelInputInfDA.add(textEnterSurnameDA);
      panelInputInfDA.add(inputSurnameDA);
      panelInputInfDA.add(textEnterMidlenameDA);
      panelInputInfDA.add(inputMidlenameDA);
      panelInputInfDA.add(textEnterNameDA);
      panelInputInfDA.add(inputNameDA);
      panelInputInfDA.add(textEnterNumberPhoneDA);
      panelInputInfDA.add(inputSdtDA);
      panelInputInfDA.add(textEnterScccdDA);
      panelInputInfDA.add(inputScccdDA);
      panelInputInfDA.add(textEnterBirthDA);
      panelInputInfDA.add(inputBirthDA);
      panelInputInfDA.add(textEnterGenderDA);
      panelInputInfDA.add(inputGenderDA);
      panelInputInfDA.add(textEnternummberRoomDA);
      panelInputInfDA.add(inputIRoomDA);
      panelInputInfDA.add(textEmailDA);
      panelInputInfDA.add(inputEmailDA);
      panelInputInfDA.add(optionGenderDAJcombobox);




      // chinh font chu
      textInputInformationDA.setFont(fontFamily);
      textEnterSurnameDA.setFont(fontDialog);
      textEnterMidlenameDA.setFont(fontDialog);
      textEnterNameDA.setFont(fontDialog);
      textEnterNumberPhoneDA.setFont(fontDialog);
      textEnterScccdDA.setFont(fontDialog);
      textEnterBirthDA.setFont(fontDialog);
      textEnterGenderDA.setFont(fontDialog);
      textEnternummberRoomDA.setFont(fontDialog);
      textPayBillDA.setFont(new Font(Font.DIALOG, Font.BOLD, 13));
      textEnterIdRenterDA.setFont(fontDialog);
      textEmailDA.setFont(fontDialog);
      enterBirthLabelDA.setFont(fontDialog);
      enterNameLabelDA.setFont(fontDialog);
      choseeIdLabelDA.setFont(fontDialog);
      textDescriptionDA.setFont(fontDialog);
      textDescription1DA.setFont(fontDialog);

      // chinh mau cho jlabel
      textDescriptionDA.setForeground(new Color(244, 164, 96));
      textDescription1DA.setForeground(new Color(244, 164, 96));
      textDescription2DA.setForeground(new Color(238, 0, 0));

//        //set kich thuoc cac JTextField
      inputSurnameDA.setPreferredSize(dimensionJTextFieldDA);
      inputMidlenameDA.setPreferredSize(dimensionJTextFieldDA);
      inputNameDA.setPreferredSize(dimensionJTextFieldDA);
      inputSdtDA.setPreferredSize(dimensionJTextFieldDA);
      inputScccdDA.setPreferredSize(dimensionJTextFieldDA);
      inputBirthDA.setPreferredSize(dimensionJTextFieldDA);
      inputGenderDA.setPreferredSize(new Dimension(170,30));
      inputIRoomDA.setPreferredSize(dimensionJTextFieldDA);
      inputIDRenterDA.setPreferredSize(dimensionJTextFieldDA);
      inputEmailDA.setPreferredSize(dimensionJTextFieldDA);
      resultBirthSreachNameAndBirthDA.setPreferredSize(dimensionJTextFieldSearchDA);
      resultNameSreachNameAndBirthDA.setPreferredSize(dimensionJTextFieldSearchDA);
      choseeIdDA.setPreferredSize(dimensionJTextFieldSearchDA);

      // bo goc cho jtextField
      inputGenderDA.setBorder(BorderFactory.createLineBorder(Color.gray));
      inputEmailDA.setBorder(BorderFactory.createLineBorder(Color.gray));
      inputBirthDA.setBorder(BorderFactory.createLineBorder(Color.gray));
      inputIDRenterDA.setBorder(BorderFactory.createLineBorder(Color.gray));
      inputMidlenameDA.setBorder(BorderFactory.createLineBorder(Color.gray));
      inputSdtDA.setBorder(BorderFactory.createLineBorder(Color.gray));
      inputSurnameDA.setBorder(BorderFactory.createLineBorder(Color.gray));
      inputNameDA.setBorder(BorderFactory.createLineBorder(Color.gray));
      inputScccdDA.setBorder(BorderFactory.createLineBorder(Color.gray));
      inputIRoomDA.setBorder(BorderFactory.createLineBorder(Color.gray));
      resultBirthSreachNameAndBirthDA.setBorder(BorderFactory.createLineBorder(Color.gray));
      resultNameSreachNameAndBirthDA.setBorder(BorderFactory.createLineBorder(Color.gray));
      choseeIdDA.setBorder(BorderFactory.createLineBorder(Color.gray));

      // xet trong suot cho JTextField
      inputGenderDA.setOpaque(false);
      inputEmailDA.setOpaque(false);
      inputBirthDA.setOpaque(false);
      inputIDRenterDA.setOpaque(false);
      inputMidlenameDA.setOpaque(false);
      inputSdtDA.setOpaque(false);
      inputSurnameDA.setOpaque(false);
      inputNameDA.setOpaque(false);
      inputScccdDA.setOpaque(false);
      inputIRoomDA.setOpaque(false);
      resultBirthSreachNameAndBirthDA.setOpaque(false);
      resultNameSreachNameAndBirthDA.setOpaque(false);
      choseeIdDA.setOpaque(false);

      //khoa jtextfield khong cho nguoi dung nhap du lieu
      inputIDRenterDA.setEditable(false);
      inputIRoomDA.setEditable(false);


      // them radioButton vao buttonGroup de chi duoc chon 1 trong 2 button
      buttonGroupPayBillDA.add(radioButtonPaidDA);
      buttonGroupPayBillDA.add(radioButtonUnpaidDA);

      // xoa vien cho button
      radioButtonUnpaidDA.setFocusPainted(false);
      radioButtonPaidDA.setFocusPainted(false);
      radioButtonPaidDA.setOpaque(false);
      radioButtonUnpaidDA.setOpaque(false);
      searchButtonDA.setFocusPainted(false);
      confirmButtonDA.setFocusPainted(false);
      updateButtonDA.setFocusPainted(false);

      // chinh sua bieu tuong con chuot khi di vao radioButton
      radioButtonPaidDA.setCursor(new Cursor(Cursor.HAND_CURSOR));
      radioButtonUnpaidDA.setCursor(new Cursor(Cursor.HAND_CURSOR));
      updateButtonDA.setCursor(new Cursor(Cursor.HAND_CURSOR));
      searchButtonDA.setCursor(new Cursor(Cursor.HAND_CURSOR));
      confirmButtonDA.setCursor(new Cursor(Cursor.HAND_CURSOR));
      updateButtonDA.setCursor(new Cursor(Cursor.HAND_CURSOR));


      springLayoutPanelAddDA.putConstraint(springLayout.NORTH,separatorDA,90,springLayout.NORTH,this);
      springLayoutPanelAddDA.putConstraint(springLayout.WEST,separatorDA,480,springLayout.WEST,this);

      springLayoutPanelAddDA.putConstraint(springLayout.NORTH,separator1DA,320,springLayout.NORTH,this);
      springLayoutPanelAddDA.putConstraint(springLayout.WEST,separator1DA,250,springLayout.WEST,this);

      springLayoutPanelAddDA.putConstraint(springLayout.NORTH,textDescriptionDA,90,springLayout.NORTH,this);
      springLayoutPanelAddDA.putConstraint(springLayout.WEST,textDescriptionDA,270,springLayout.WEST,this);

      springLayoutPanelAddDA.putConstraint(springLayout.NORTH,textDescription1DA,330,springLayout.NORTH,this);
      springLayoutPanelAddDA.putConstraint(springLayout.WEST,textDescription1DA,270,springLayout.WEST,this);

      springLayoutPanelAddDA.putConstraint(springLayout.NORTH,textDescription2DA,440,springLayout.NORTH,this);
      springLayoutPanelAddDA.putConstraint(springLayout.WEST,textDescription2DA,515,springLayout.WEST,this);

      springLayoutPanelAddDA.putConstraint(springLayout.NORTH,enterNameLabelDA,120,springLayout.NORTH,this);
      springLayoutPanelAddDA.putConstraint(springLayout.WEST,enterNameLabelDA,285,springLayout.WEST,this);

      springLayoutPanelAddDA.putConstraint(springLayout.NORTH,resultNameSreachNameAndBirthDA,145,springLayout.NORTH,this);
      springLayoutPanelAddDA.putConstraint(springLayout.WEST,resultNameSreachNameAndBirthDA,275,springLayout.WEST,this);

      springLayoutPanelAddDA.putConstraint(springLayout.NORTH,enterBirthLabelDA,200,springLayout.NORTH,this);
      springLayoutPanelAddDA.putConstraint(springLayout.WEST,enterBirthLabelDA,285,springLayout.WEST,this);

      springLayoutPanelAddDA.putConstraint(springLayout.NORTH,resultBirthSreachNameAndBirthDA,225,springLayout.NORTH,this);
      springLayoutPanelAddDA.putConstraint(springLayout.WEST,resultBirthSreachNameAndBirthDA,275,springLayout.WEST,this);

      springLayoutPanelAddDA.putConstraint(springLayout.NORTH,searchButtonDA,270,springLayout.NORTH,this);
      springLayoutPanelAddDA.putConstraint(springLayout.WEST,searchButtonDA,310,springLayout.WEST,this);

      springLayoutPanelAddDA.putConstraint(springLayout.NORTH,choseeIdLabelDA,360,springLayout.NORTH,this);
      springLayoutPanelAddDA.putConstraint(springLayout.WEST,choseeIdLabelDA,285,springLayout.WEST,this);

      springLayoutPanelAddDA.putConstraint(springLayout.NORTH,choseeIdDA,390,springLayout.NORTH,this);
      springLayoutPanelAddDA.putConstraint(springLayout.WEST,choseeIdDA,275,springLayout.WEST,this);

      springLayoutPanelAddDA.putConstraint(springLayout.NORTH,confirmButtonDA,440,springLayout.NORTH,this);
      springLayoutPanelAddDA.putConstraint(springLayout.WEST,confirmButtonDA,296,springLayout.WEST,this);

      springLayoutPanelAddDA.putConstraint(springLayout.NORTH,panelInputInfDA,90,springLayout.NORTH,this);
      springLayoutPanelAddDA.putConstraint(springLayout.WEST,panelInputInfDA,455,springLayout.WEST,this);

      springLayout.putConstraint(springLayout.NORTH,inputIDRenterDA,45,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,inputIDRenterDA,50,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,inputSurnameDA,45,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,inputSurnameDA,340,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,inputMidlenameDA,135,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,inputMidlenameDA,50,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,inputNameDA,135,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,inputNameDA,340,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,inputSdtDA,225,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,inputSdtDA,50,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,inputScccdDA,225,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,inputScccdDA,340,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,inputBirthDA,315,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,inputBirthDA,50,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,inputGenderDA,315,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,inputGenderDA,340,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,inputIRoomDA,405,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,inputIRoomDA,50,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,optionGenderDAJcombobox,318,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,optionGenderDAJcombobox,525,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,inputEmailDA,405,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,inputEmailDA,340,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,textEnterIdRenterDA,20,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,textEnterIdRenterDA,55,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,textEnterSurnameDA,20,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,textEnterSurnameDA,345,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,textEnterMidlenameDA,112,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,textEnterMidlenameDA,55,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,textEnterNameDA,112 ,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,textEnterNameDA,345,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,textEnterNumberPhoneDA,202,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,textEnterNumberPhoneDA,55,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,textEnterScccdDA,202,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,textEnterScccdDA,345,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,textEnterBirthDA,292,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,textEnterBirthDA,55,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,textEnterGenderDA,292,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,textEnterGenderDA,345,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,textEnternummberRoomDA,382,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,textEnternummberRoomDA,55,springLayout.WEST,panelInputInfDA);

      springLayout.putConstraint(springLayout.NORTH,textEmailDA,382,springLayout.NORTH,panelInputInfDA);
      springLayout.putConstraint(springLayout.WEST,textEmailDA,345,springLayout.WEST,panelInputInfDA);

      springLayoutPanelAddDA.putConstraint(springLayout.NORTH,updateButtonDA,585,springLayout.NORTH,this);
      springLayoutPanelAddDA.putConstraint(springLayout.WEST,updateButtonDA,695,springLayout.WEST,this);

      // lang nghe su kien
      optionGenderDAJcombobox.addActionListener(updateInfRenterController);
      confirmButtonDA.addActionListener(updateInfRenterController);
      searchButtonDA.addActionListener(updateInfRenterController);
      updateButtonDA.addActionListener(updateInfRenterController);

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

    public JTextField getInputSurnameDA() {
        return inputSurnameDA;
    }

    public JTextField getChoseeIdDA() {
        return choseeIdDA;
    }

    public JTextField getInputMidlenameDA() {
        return inputMidlenameDA;
    }

    public JTextField getInputNameDA() {
        return inputNameDA;
    }

    public JTextField getInputSdtDA() {
        return inputSdtDA;
    }

    public JTextField getInputScccdDA() {
        return inputScccdDA;
    }

    public JTextField getInputBirthDA() {
        return inputBirthDA;
    }

    public JTextField getInputGenderDA() {
        return inputGenderDA;
    }

    public JTextField getInputIRoomDA() {
        return inputIRoomDA;
    }

    public JTextField getInputIDRenterDA() {
        return inputIDRenterDA;
    }

    public JTextField getInputEmailDA() {
        return inputEmailDA;
    }
    public JTextField getResultNameSreachNameAndBirthDA() {
        return resultNameSreachNameAndBirthDA;
    }

    public JTextField getResultBirthSreachNameAndBirthDA() {
        return resultBirthSreachNameAndBirthDA;
    }

    public JComboBox<String> getOptionGenderDAJcombobox() {
        return optionGenderDAJcombobox;
    }



}
