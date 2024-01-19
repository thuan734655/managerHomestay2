    package View.SignIn;

    import Controller.SignInController;

    import javax.swing.*;
    import javax.swing.SpringLayout;
    import java.awt.*;

    public class FormSignInView extends JFrame {
        private SignInController signInController = new SignInController(this);
        private SpringLayout springLayout = new SpringLayout();
        private SpringLayout springLayoutMain = new SpringLayout();

        private JLabel textSignIn = new JLabel("Sign in");
        private JLabel textUsername = new JLabel("user");
        private   JLabel textPasswordd = new JLabel("Password");
        private JLabel forgotPassword = new JLabel("Forgot password");

        ImageIcon iconSignIn = new ImageIcon("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\img\\icons8-student-64.png");
        Image iconSignInImg = iconSignIn.getImage();
        JLabel labelIconSignInLastResize = new JLabel(new ImageIcon(iconSignInImg.getScaledInstance(100,100,Image.SCALE_SMOOTH)));

        ImageIcon backgroundIcon = new ImageIcon("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\img\\z5086320661346_2be297b25c2724e55d17642e3c4507a4.jpg");
        Image backgroundImage = backgroundIcon.getImage();
        JLabel backgroundLabel = new JLabel(new ImageIcon(backgroundImage.getScaledInstance(800, 600, Image.SCALE_SMOOTH)));

        private  JTextField textFieldUsername = new JTextField();

        private  JPasswordField   textFieldPassword = new JPasswordField();

        private JButton confirm = new JButton("Confirm");
        private JCheckBox hideOrVisiblePass = new JCheckBox("Show pass word");

        JPanel panelCenter = new JPanel();

        Font fontMonospaced =  new Font("Dialog", Font.BOLD, 15);
        Font fontSerif = new Font(Font.SERIF,Font.PLAIN|Font.BOLD ,14);

        Dimension dimensionTextField = new Dimension(200,30);
        Dimension dimensionPanelCenter = new Dimension(500,400);


        public FormSignInView() {
            super("Sign in");
            this.init();
            this.setVisible(true);
        }

        public  void init() {
            this.setSize(800,600);
            this.setResizable(false);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            // chinh do trong suot cua panelCenter
            panelCenter.setOpaque(false);

            this.setLayout(springLayoutMain);
            this.add(panelCenter);
            this.getContentPane().add(backgroundLabel);


            //can chinh panel center
            springLayoutMain.putConstraint(springLayoutMain.NORTH,panelCenter,50,springLayoutMain.NORTH,this);
            springLayoutMain.putConstraint(springLayoutMain.EAST,panelCenter,645,springLayoutMain.WEST,this);

            panelCenter.setPreferredSize(dimensionPanelCenter);

            panelCenter.add(textSignIn);
            panelCenter.add(confirm);
            panelCenter.add(textUsername);
            panelCenter.add(textFieldUsername);
            panelCenter.add(textPasswordd);
            panelCenter.add(textFieldPassword);
            panelCenter.add(forgotPassword);
            panelCenter.add(labelIconSignInLastResize);
            panelCenter.add(hideOrVisiblePass);
            panelCenter.setLayout(springLayout);

            // set font
            textSignIn.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 22));
            textUsername.setFont(fontMonospaced);
            textPasswordd.setFont(fontMonospaced) ;
            forgotPassword.setFont(fontSerif);


            //chinh mau chu
            textSignIn.setForeground(new Color(65, 105, 225));
            forgotPassword.setForeground(new Color(0, 104, 139));

            // chinh kich thuoc cua cac jtextfield
            textFieldUsername.setPreferredSize(dimensionTextField);
            textFieldPassword.setPreferredSize(dimensionTextField);


            // chinh sua kich thuoc chu trong textfield
            textFieldUsername.setFont(fontSerif);
            textFieldPassword.setFont(fontSerif);


            springLayout.putConstraint(springLayout.NORTH,textSignIn,130,springLayout.NORTH,panelCenter);
            springLayout.putConstraint(springLayout.WEST,textSignIn,215,springLayout.WEST,panelCenter);

            springLayout.putConstraint(springLayout.SOUTH,confirm,-60,springLayout.SOUTH,panelCenter);
            springLayout.putConstraint(springLayout.WEST,confirm,217,springLayout.WEST,panelCenter);

            springLayout.putConstraint(springLayout.SOUTH ,textUsername, 193, springLayout.NORTH, panelCenter);
            springLayout.putConstraint(springLayout.WEST ,textUsername, 163, springLayout.WEST, panelCenter);

            springLayout.putConstraint(springLayout.SOUTH,textFieldUsername,225,springLayout.NORTH,panelCenter);
            springLayout.putConstraint(springLayout.WEST,textFieldUsername,155,springLayout.WEST,panelCenter);

            springLayout.putConstraint(springLayout.SOUTH ,textPasswordd,258, springLayout.NORTH, panelCenter);
            springLayout.putConstraint(springLayout.WEST ,textPasswordd, 163, springLayout.WEST, panelCenter);

            springLayout.putConstraint(springLayout.SOUTH,textFieldPassword,290,springLayout.NORTH,panelCenter);
            springLayout.putConstraint(springLayout.WEST,textFieldPassword,155,springLayout.WEST,panelCenter);

            springLayout.putConstraint(springLayout.SOUTH,forgotPassword,260,springLayout.NORTH,panelCenter);
            springLayout.putConstraint(springLayout.WEST,forgotPassword,260,springLayout.WEST,panelCenter);

            springLayout.putConstraint(springLayout.SOUTH,labelIconSignInLastResize,130,springLayout.NORTH,panelCenter);
            springLayout.putConstraint(springLayout.WEST,labelIconSignInLastResize,213,springLayout.WEST,panelCenter);

            springLayout.putConstraint(springLayout.SOUTH,hideOrVisiblePass,310,springLayout.NORTH,panelCenter);
            springLayout.putConstraint(springLayout.WEST,hideOrVisiblePass,168,springLayout.WEST,panelCenter);


            // chinh sua bieu tuong chuot khi hold vaof quen mat khau va  nut dang nhap
            forgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            confirm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            // xoa vien va set trong suot cho hideOrVisiblePass
            hideOrVisiblePass.setOpaque(false);
            hideOrVisiblePass.setBorder(null);

            // xoa vien xung quan chu cua nut dang nhap
            confirm.setFocusPainted(false);

            // lang nghe su kien nhan
            confirm.addActionListener(signInController);
            forgotPassword.addMouseListener(signInController);
            forgotPassword.addMouseMotionListener(signInController);
            hideOrVisiblePass.addActionListener(signInController);
        }


        public JTextField getTextFieldUsername() {
            return textFieldUsername;
        }
        public JPasswordField getTextFieldPassword() {
            return textFieldPassword;
        }

        public JLabel getForgotPassword() {
            return forgotPassword;
        }


    }
