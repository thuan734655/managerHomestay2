package View.ForgotPass;

import Controller.ForgotPass.ForgotPasswordController;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class ForgotPasswordView extends JFrame {
    private ForgotPasswordController forgotPasswordController = new ForgotPasswordController(this);
    private SpringLayout springLayout = new SpringLayout();
    private SpringLayout springLayoutMain = new SpringLayout();
    private JLabel textForgotPass = new JLabel("Reset your password");
    private JLabel textEmail = new JLabel("Email");


    private ImageIcon iconForgotPass = new ImageIcon("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\img\\icons8-key-100.png");
    Image iconSignInImg = iconForgotPass.getImage();
    JLabel labelIconSignInLastResize = new JLabel(new ImageIcon(iconSignInImg.getScaledInstance(150,150,Image.SCALE_SMOOTH | Image.SCALE_DEFAULT)));


    private ImageIcon backgroundIcon = new ImageIcon("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\img\\z5085569642831_d664e3bf38cdf1f9e414b61aaf70e3d4.jpg");
    Image backgroundImage = backgroundIcon.getImage();
    JLabel backgroundLabel = new JLabel(new ImageIcon( backgroundImage.getScaledInstance(800, 600, Image.SCALE_SMOOTH)));

    private  JTextField textFieldEmail = new JTextField();

    private JButton confirm = new JButton("confirm");

    private JPanel panelCenter = new JPanel();
    Font fontSerif = new Font(Font.SERIF,Font.PLAIN|Font.BOLD ,14);

    Dimension dimensionTextField = new Dimension(200,30);
    Dimension dimensionPanelCenter = new Dimension(500,400);


    public ForgotPasswordView() {
        super("Sign in");
        this.init();
        this.setVisible(true);

    }

    public  void init() {
        this.setSize(800,600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //chinh sua kich thuoc  panelCenter
        panelCenter.setPreferredSize(dimensionPanelCenter);

        // chinh do trong suot cua panelCenter
        panelCenter.setOpaque(false);

        this.setLayout(springLayoutMain);
        this.add(panelCenter);

        // chen hinh anh lam hinh nen
        this.getContentPane().add(backgroundLabel);

        // them cac than phan vao panel
        panelCenter.setLayout(springLayout);
        panelCenter.add(textForgotPass);
        panelCenter.add(confirm);
        panelCenter.add(textEmail);
        panelCenter.add(textFieldEmail);
        panelCenter.add(labelIconSignInLastResize);

//       chinh sua chu quen mat khau va email
        textForgotPass.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 22));
        textEmail.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));



        // can chinh panel center
        springLayoutMain.putConstraint(springLayoutMain.NORTH,panelCenter,50,springLayoutMain.NORTH,this);
        springLayoutMain.putConstraint(springLayoutMain.EAST,panelCenter,660,springLayoutMain.WEST,this);

        textFieldEmail.setPreferredSize(dimensionTextField);

        textFieldEmail.setFont(fontSerif);
        textForgotPass.setForeground(new Color(255 ,250, 250));

        confirm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        springLayout.putConstraint(springLayout.NORTH,textForgotPass,150,springLayout.NORTH,panelCenter);
        springLayout.putConstraint(springLayout.WEST,textForgotPass,147,springLayout.WEST,panelCenter);

        springLayout.putConstraint(springLayout.SOUTH,confirm,-110,springLayout.SOUTH,panelCenter);
        springLayout.putConstraint(springLayout.WEST,confirm,224,springLayout.WEST,panelCenter);

        springLayout.putConstraint(springLayout.SOUTH ,textEmail, 210, springLayout.NORTH, panelCenter);
        springLayout.putConstraint(springLayout.WEST ,textEmail, 165, springLayout.WEST, panelCenter);

        springLayout.putConstraint(springLayout.SOUTH,textFieldEmail,245,springLayout.NORTH,panelCenter);
        springLayout.putConstraint(springLayout.WEST,textFieldEmail,160,springLayout.WEST,panelCenter);

        springLayout.putConstraint(springLayout.SOUTH,labelIconSignInLastResize,170,springLayout.NORTH,panelCenter);
        springLayout.putConstraint(springLayout.WEST,labelIconSignInLastResize,185,springLayout.WEST,panelCenter);

        confirm.setFocusPainted(false);

        // lang nghe su kien nhan nut dang nhap
        confirm.addActionListener(forgotPasswordController);

    }


    public JTextField getTextFieldEmail() {
        return textFieldEmail;
    }

    public static void main(String[] args) {
        ForgotPasswordView forgotPasswordView = new ForgotPasswordView();
    }
  
}
