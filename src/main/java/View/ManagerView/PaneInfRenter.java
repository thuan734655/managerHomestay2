package View.ManagerView;

import Controller.ManagerController.ListInfRenterController;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class PaneInfRenter extends JPanel {
    private JButton room1 = new JButton("Room 1");
    private JButton room2 = new JButton("Room 2");
    private JButton room3 = new JButton("Room 3");
    private JButton room4 = new JButton("Room 4");
    private JButton room5 = new JButton("Room 5");
    private JButton room6 = new JButton("Room 6");
    private JButton room7 = new JButton("Room 7");
    private JButton room8 = new JButton("Room 8");
    private JLabel labelID = new JLabel("Renter ID");
    private JLabel labelIDInformation = new JLabel("Id information");
    private JLabel labelName = new JLabel("Full name");
    private JLabel labelNameInformation = new JLabel("Full name information");
    private JLabel labelBirth = new JLabel("Birth");
    private JLabel labelBirthInformation = new JLabel("Birth information");
    private JLabel labelNumberPhone = new JLabel("Contact number");
    private JLabel labelNumberPhoneInformation = new JLabel("Contact number information");
    private JLabel labelScccd = new JLabel("Citizen Id");
    private JLabel labelScccdInformation = new JLabel("citizen information");
    private JLabel labelGender = new JLabel("Gender");
    private JLabel labelGenderinformation = new JLabel("Gender information");
    private JLabel labelEmail = new JLabel("Email");
    private JLabel lableEmailInformation = new JLabel("Email information");
    private JLabel labelTextIntro = new JLabel("Renter information");
    private JLabel labelTextRenters = new JLabel("Renters of");
    private JLabel labelTextRenters1 = new JLabel("Bear homestay");
    private JLabel labelTextRoomInf = new JLabel("Room information");
    private JLabel labelTextRenterInf = new JLabel("Renter information");
    private JLabel labelTextNameOfRoom= new JLabel("Room name");
    private JLabel labelTextNameOfRoomInf= new JLabel("Room name information");
    private JLabel labelTextKindOfRoom = new JLabel("Kind of room");
    private JLabel labelTextKindOfRoomInf = new JLabel("Kind of room information");
    private JLabel labelTextPriceOfRoom = new JLabel("Price of room");
    private JLabel labelTextPriceOfRoomInf = new JLabel("Price of room information");


    private JSeparator separatorVertical = new JSeparator(SwingConstants.VERTICAL);
    private JSeparator separatorHorizontal = new JSeparator(SwingConstants.HORIZONTAL);

    JPanel panelNavigate = new JPanel();
    JPanel panelAvatar = new JPanel();
    JPanel panelInf = new JPanel();

    private ImageIcon iconAvt = new ImageIcon("C:\\Users\\thuan\\Downloads\\3d-business-a-group-of-cheerful-young-people.png");

    // chinh sua kich thuoc iconAvt
    Image iconAvtImg = iconAvt.getImage();
    Image reSizeIconAvtImg = iconAvtImg.getScaledInstance(200,200,Image.SCALE_SMOOTH);
    ImageIcon iconAvtLastReSizeIcon = new ImageIcon(reSizeIconAvtImg);


    // them cac icon vao label
    JLabel iconAvtLastReSizeLabel = new JLabel(iconAvtLastReSizeIcon);

    private SpringLayout springLayoutInf = new SpringLayout();
    private SpringLayout springLayout = new SpringLayout();

    private Font fontDialog = new Font(Font.DIALOG,Font.PLAIN |Font.BOLD,16);
    private Font fontsans_serif = new Font(Font.SANS_SERIF , Font.BOLD | Font.PLAIN , 12);
    private Font fontFamily  = loadCustomFont("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\font\\Anton\\Anton-Regular.ttf");
    private Font fontGasok_one = loadCustomFont("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\font\\Gasoek_One\\GasoekOne-Regular.ttf");
    private ListInfRenterController listInfRenterController = new ListInfRenterController(this);

    public PaneInfRenter() {


       this.setBackground(new Color(240,255,255));
       panelInf.setBackground(new Color(240,255,255));
        this.setLayout(springLayout);
        panelInf.setLayout(springLayoutInf);

       // them cac thanh phan vao panelInfRenter
       this.add(panelNavigate);
       this.add(separatorVertical);
       this.add(separatorHorizontal);
       this.add(labelTextKindOfRoom);
       this.add(labelTextNameOfRoom);
       this.add(labelTextPriceOfRoom);
       this.add(labelTextKindOfRoomInf);
       this.add(labelTextNameOfRoomInf);
       this.add(labelTextPriceOfRoomInf);
       this.add(labelTextRenterInf);
       this.add(labelTextRoomInf);
       this.add(panelInf);
       this.add(iconAvtLastReSizeLabel);
       this.add(labelTextRenters);
       this.add(labelTextRenters1);



       // chinh sua kich thuoc panel
       panelInf.setPreferredSize(new Dimension(500,500));
       this.setPreferredSize(new Dimension(1100,700));
       panelNavigate.setPreferredSize(new Dimension(720,40));
       separatorVertical.setPreferredSize(new Dimension(750,500));
       separatorHorizontal.setPreferredSize(new Dimension(580,300));

       // set trong suot cho panel
       panelNavigate.setOpaque(false);

       //them cac label vao panelInf
       panelInf.add(labelID);
       panelInf.add(labelIDInformation);
       panelInf.add(labelName);
       panelInf.add(labelNameInformation);
       panelInf.add(labelBirth);
       panelInf.add(labelBirthInformation);
       panelInf.add(labelNumberPhone);
       panelInf.add(labelNumberPhoneInformation);
       panelInf.add(labelScccd);
       panelInf.add(labelScccdInformation);
       panelInf.add(labelGender);
       panelInf.add(labelGenderinformation);
       panelInf.add(labelEmail);
       panelInf.add(lableEmailInformation);


       //them button vao panelNavigate
       panelNavigate.add(room1);
       panelNavigate.add(room2);
       panelNavigate.add(room3);
       panelNavigate.add(room4);
       panelNavigate.add(room5);
       panelNavigate.add(room6);
       panelNavigate.add(room7);
       panelNavigate.add(room8);

       room1.setFocusPainted(false);
       room2.setFocusPainted(false);
       room3.setFocusPainted(false);
       room3.setFocusPainted(false);
       room4.setFocusPainted(false);
       room5.setFocusPainted(false);
       room6.setFocusPainted(false);
       room7.setFocusPainted(false);
       room8.setFocusPainted(false);


       //chinh sua font chu cua cac label
       labelID.setFont(fontDialog);
       labelIDInformation.setFont(fontsans_serif);
       labelName.setFont(fontDialog);
       labelNameInformation.setFont(fontsans_serif);
       labelBirth.setFont(fontDialog);
       labelBirthInformation.setFont(fontsans_serif);
       labelNumberPhone.setFont(fontDialog);
       labelNumberPhoneInformation.setFont(fontsans_serif);
       labelScccd.setFont(fontDialog);
       labelScccdInformation.setFont(fontsans_serif);
       labelGender.setFont(fontDialog);
       labelGenderinformation.setFont(fontsans_serif);
       labelEmail.setFont(fontDialog);
       lableEmailInformation.setFont(fontsans_serif);
       labelTextKindOfRoom.setFont(fontDialog);
       labelTextPriceOfRoom.setFont(fontDialog);
       labelTextNameOfRoom.setFont(fontDialog);
       labelTextKindOfRoomInf.setFont(fontsans_serif);
       labelTextPriceOfRoomInf.setFont(fontsans_serif);
       labelTextNameOfRoomInf.setFont(fontsans_serif);


       labelTextIntro.setFont(fontFamily);
       labelTextRenters.setFont(fontGasok_one);
       labelTextRenters1.setFont(fontGasok_one);
       labelTextRenterInf.setFont(fontGasok_one);
       labelTextRoomInf.setFont(fontGasok_one);


       // chinh mau chu cac label
       lableEmailInformation.setForeground(Color.gray);
       labelBirthInformation.setForeground(Color.gray);
       labelGenderinformation.setForeground(Color.gray);
       labelIDInformation.setForeground(Color.gray);
       labelNameInformation.setForeground(Color.gray);
       labelNumberPhoneInformation.setForeground(Color.gray);
       labelScccdInformation.setForeground(Color.gray);
       labelTextKindOfRoomInf.setForeground(Color.gray);
       labelTextPriceOfRoomInf.setForeground(Color.gray);
       labelTextNameOfRoomInf.setForeground(Color.gray);
       labelTextIntro.setForeground(new Color(160, 82, 45));
       labelTextRenters.setForeground(new Color(160, 82, 45));
       labelTextRenters1.setForeground(new Color(160, 82, 45));
       labelTextRenterInf.setForeground(new Color(244, 164, 96));
       labelTextRoomInf.setForeground(new Color(244, 164, 96));

        // chinh sua nut room khi di chuyen chuot vao thi chuoi doi thanh hinh ngon tay
        room1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        room2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        room3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        room4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        room5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        room6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        room7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        room8.setCursor(new Cursor(Cursor.HAND_CURSOR));


       springLayout.putConstraint(springLayout.NORTH, labelTextRenterInf, 65, springLayout.NORTH, this);
       springLayout.putConstraint(springLayout.WEST, labelTextRenterInf, 578, springLayout.WEST, this);

       springLayout.putConstraint(springLayout.NORTH, labelTextRoomInf, 415, springLayout.NORTH, this);
       springLayout.putConstraint(springLayout.WEST, labelTextRoomInf, 578, springLayout.WEST, this);

       springLayout.putConstraint(springLayout.NORTH, labelTextRenters, 370, springLayout.NORTH, this);
       springLayout.putConstraint(springLayout.WEST, labelTextRenters, 338, springLayout.WEST, this);

       springLayout.putConstraint(springLayout.NORTH, labelTextRenters1, 390, springLayout.NORTH, this);
       springLayout.putConstraint(springLayout.WEST, labelTextRenters1, 308, springLayout.WEST, this);

       springLayout.putConstraint(springLayout.NORTH, separatorVertical, 80, springLayout.NORTH, this);
       springLayout.putConstraint(springLayout.WEST, separatorVertical, 558, springLayout.WEST, this);

       springLayout.putConstraint(springLayout.NORTH, separatorHorizontal, 405, springLayout.NORTH, this);
       springLayout.putConstraint(springLayout.WEST, separatorHorizontal, 557, springLayout.WEST, this);

       springLayout.putConstraint(springLayout.NORTH, iconAvtLastReSizeLabel, 150, springLayout.NORTH, this);
       springLayout.putConstraint(springLayout.WEST, iconAvtLastReSizeLabel, 298, springLayout.WEST, this);

       springLayout.putConstraint(springLayout.NORTH, labelTextNameOfRoom, 465, springLayout.NORTH, this);
       springLayout.putConstraint(springLayout.WEST, labelTextNameOfRoom, 608, springLayout.WEST, this);

       springLayout.putConstraint(springLayout.NORTH, labelTextNameOfRoomInf, 490, springLayout.NORTH, this);
       springLayout.putConstraint(springLayout.WEST, labelTextNameOfRoomInf, 608, springLayout.WEST, this);

       springLayout.putConstraint(springLayout.NORTH, labelTextKindOfRoom, 465, springLayout.NORTH, this);
       springLayout.putConstraint(springLayout.WEST, labelTextKindOfRoom, 835, springLayout.WEST, this);

       springLayout.putConstraint(springLayout.NORTH, labelTextKindOfRoomInf, 490, springLayout.NORTH, this);
       springLayout.putConstraint(springLayout.WEST, labelTextKindOfRoomInf, 835, springLayout.WEST, this);

       springLayout.putConstraint(springLayout.NORTH, labelTextPriceOfRoom, 535, springLayout.NORTH, this);
       springLayout.putConstraint(springLayout.WEST, labelTextPriceOfRoom, 608, springLayout.WEST, this);

       springLayout.putConstraint(springLayout.NORTH, labelTextPriceOfRoomInf, 560, springLayout.NORTH, this);
       springLayout.putConstraint(springLayout.WEST, labelTextPriceOfRoomInf, 608, springLayout.WEST, this);

       springLayout.putConstraint(springLayout.SOUTH, panelNavigate, -40, springLayout.SOUTH, this);
       springLayout.putConstraint(springLayout.WEST, panelNavigate, 308, springLayout.WEST, this);

       springLayout.putConstraint(springLayout.NORTH, panelInf, 90, springLayout.NORTH, this);
       springLayout.putConstraint(springLayout.WEST, panelInf, 550, springLayout.WEST, panelAvatar);

       springLayoutInf.putConstraint(springLayoutInf.NORTH, labelIDInformation, 60, springLayoutInf.NORTH, panelInf);
       springLayoutInf.putConstraint(springLayoutInf.WEST, labelIDInformation, 60, springLayoutInf.WEST, panelInf);

       springLayoutInf.putConstraint(springLayoutInf.NORTH, labelNameInformation, 60, springLayoutInf.NORTH, panelInf);
       springLayoutInf.putConstraint(springLayoutInf.WEST, labelNameInformation, 280, springLayoutInf.WEST, panelInf);

       springLayoutInf.putConstraint(springLayoutInf.NORTH, labelBirthInformation, 130, springLayoutInf.NORTH, panelInf);
       springLayoutInf.putConstraint(springLayoutInf.WEST, labelBirthInformation, 60, springLayoutInf.WEST, panelInf);

       springLayoutInf.putConstraint(springLayoutInf.NORTH, labelNumberPhoneInformation, 130, springLayoutInf.NORTH, panelInf);
       springLayoutInf.putConstraint(springLayoutInf.WEST, labelNumberPhoneInformation, 280, springLayoutInf.WEST, panelInf);

       springLayoutInf.putConstraint(springLayoutInf.NORTH, labelScccdInformation, 210, springLayoutInf.NORTH, panelInf);
       springLayoutInf.putConstraint(springLayoutInf.WEST, labelScccdInformation, 60, springLayoutInf.WEST, panelInf);

       springLayoutInf.putConstraint(springLayoutInf.NORTH, labelGenderinformation, 210, springLayoutInf.NORTH, panelInf);
       springLayoutInf.putConstraint(springLayoutInf.WEST, labelGenderinformation, 280, springLayoutInf.WEST, panelInf);

       springLayoutInf.putConstraint(springLayoutInf.NORTH, lableEmailInformation, 283, springLayoutInf.NORTH, panelInf);
       springLayoutInf.putConstraint(springLayoutInf.WEST, lableEmailInformation, 60, springLayoutInf.WEST, panelInf);

       springLayoutInf.putConstraint(springLayoutInf.NORTH, labelID, 35, springLayoutInf.NORTH, panelInf);
       springLayoutInf.putConstraint(springLayoutInf.WEST, labelID, 60, springLayoutInf.WEST, panelInf);

       springLayoutInf.putConstraint(springLayoutInf.NORTH, labelName, 35, springLayoutInf.NORTH, panelInf);
       springLayoutInf.putConstraint(springLayoutInf.WEST, labelName, 280, springLayoutInf.WEST, panelInf);

       springLayoutInf.putConstraint(springLayoutInf.NORTH, labelBirth, 108, springLayoutInf.NORTH, panelInf);
       springLayoutInf.putConstraint(springLayoutInf.WEST, labelBirth, 60, springLayoutInf.WEST, panelInf);

       springLayoutInf.putConstraint(springLayoutInf.NORTH, labelNumberPhone, 108, springLayoutInf.NORTH, panelInf);
       springLayoutInf.putConstraint(springLayoutInf.WEST, labelNumberPhone, 280, springLayoutInf.WEST, panelInf);

       springLayoutInf.putConstraint(springLayoutInf.NORTH, labelScccd, 186, springLayoutInf.NORTH, panelInf);
       springLayoutInf.putConstraint(springLayoutInf.WEST, labelScccd, 60, springLayoutInf.WEST, panelInf);

       springLayoutInf.putConstraint(springLayoutInf.NORTH, labelGender, 186, springLayoutInf.NORTH, panelInf);
       springLayoutInf.putConstraint(springLayoutInf.WEST, labelGender, 280, springLayoutInf.WEST, panelInf);

       springLayoutInf.putConstraint(springLayoutInf.NORTH, labelEmail, 259, springLayoutInf.NORTH, panelInf);
       springLayoutInf.putConstraint(springLayoutInf.WEST, labelEmail, 60, springLayoutInf.WEST, panelInf);


       // lang nghe su kien cho cac button
       room1.addActionListener(listInfRenterController);
       room2.addActionListener(listInfRenterController);
       room3.addActionListener(listInfRenterController);
       room4.addActionListener(listInfRenterController);
       room5.addActionListener(listInfRenterController);
       room6.addActionListener(listInfRenterController);
       room7.addActionListener(listInfRenterController);
       room8.addActionListener(listInfRenterController);


   }

    private  JPanel createRoundedTransparentPanel(int colorR, int colorG, int colorB,int colorA) {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g.create();

                int width = getWidth();
                int height = getHeight();
                int borderRadius = 20;

                // Tạo một hình chữ nhật bo tròn và trong suốt
                RoundRectangle2D roundedRectangle = new RoundRectangle2D.Double(0, 0, width - 1, height - 1, borderRadius, borderRadius);
                g2d.setPaint(new Color(colorR,colorB,colorR, colorA));
                g2d.fill(roundedRectangle);

                g2d.dispose();
            }
        };

        return panel;
    }

    private JPanel createRoundedTransparentPanelImg(String imgLink) {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g.create();

                int width = getWidth();
                int height = getHeight();
                int borderRadius = 20;

                // Tạo một hình chữ nhật bo tròn và trong suốt
                RoundRectangle2D roundedRectangle = new RoundRectangle2D.Double(0, 0, width - 1, height - 1, borderRadius, borderRadius);
                g2d.fill(roundedRectangle);

                // Thêm hình ảnh vào panelAvatar và vẽ theo góc của panel
                ImageIcon avatarIcon = new ImageIcon(imgLink);
                Image avatarImage = avatarIcon.getImage();

                // Vị trí và kích thước để vẽ hình ảnh theo góc bo tròn
                int x = 0;
                int y = 0;
                int imageWidth = getWidth();
                int imageHeight = getHeight();

                // Vẽ hình ảnh trong hình chữ nhật bo tròn
                g2d.clip(roundedRectangle);
                g2d.drawImage(avatarImage, x, y, imageWidth, imageHeight, this);

                g2d.dispose();
            }
        };

        return panel;
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

    public JLabel getLabelIDInformation() {
        return labelIDInformation;
    }

    public JLabel getLabelNameInformation() {
        return labelNameInformation;
    }

    public JLabel getLabelBirthInformation() {
        return labelBirthInformation;
    }

    public JLabel getLabelNumberPhoneInformation() {
        return labelNumberPhoneInformation;
    }

    public JLabel getLabelScccdInformation() {
        return labelScccdInformation;
    }

    public JLabel getLabelGenderinformation() {
        return labelGenderinformation;
    }

    public JLabel getLableEmailInformation() {
        return lableEmailInformation;
    }


    public JLabel getLabelTextNameOfRoomInf() {
        return labelTextNameOfRoomInf;
    }

    public JLabel getLabelTextPriceOfRoomInf() {
        return labelTextPriceOfRoomInf;
    }


    public JLabel getLabelTextKindOfRoomInf() {
        return labelTextKindOfRoomInf;
    }
}
