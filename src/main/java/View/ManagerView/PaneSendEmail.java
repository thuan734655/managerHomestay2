package View.ManagerView;

import Controller.ManagerController.SendEmailController;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PaneSendEmail extends JPanel {

    private JLabel textRecipientSM = new JLabel("Recipient");
    private JLabel textSubjectSM = new JLabel("Subject");
    private JTextField emailRecipientTextFieldSM = new JTextField();
    private JTextField subjectTextFieldSM = new JTextField();
    private JTextArea contentSM  = new JTextArea();
    private JButton sendMailSM = new JButton("Send");
    private Font fontDialog = new Font(Font.DIALOG,Font.PLAIN |Font.BOLD,16);
    private Font fontsans_serif = new Font(Font.SANS_SERIF , Font.BOLD | Font.PLAIN , 12);
    private Font fontFamily  = loadCustomFont("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\font\\Anton\\Anton-Regular.ttf");
    private Font fontMontserrat = loadCustomFont("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\font\\Montserrat\\Montserrat-Italic-VariableFont_wght.ttf");
    private Font fontRubik = loadCustomFont("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\font\\Rubik_Doodle_Triangles\\RubikDoodleTriangles-Regular.ttf");
    private Font fontGasok_one = loadCustomFont("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\font\\Gasoek_One\\GasoekOne-Regular.ttf");

    private SpringLayout springLayoutSM = new SpringLayout();
    private SendEmailController sendEmailController = new SendEmailController(this);

    public PaneSendEmail() {
        this.setBackground(new Color(240,255,255));
        this.setLayout(springLayoutSM);

        // chinh sua kich thuoc cho panel
        this.setPreferredSize(new Dimension(1100,800));

        this.add(textRecipientSM);
        this.add(textSubjectSM);
        this.add(subjectTextFieldSM);
        this.add(emailRecipientTextFieldSM);
        this.add(contentSM);
        this.add(sendMailSM);

        // chinh sua font cho cac label
        textRecipientSM.setFont(fontDialog);
        textSubjectSM.setFont(fontDialog);

        // xet trong suot cho jtextField va jtextArea
        emailRecipientTextFieldSM.setOpaque(false);
        subjectTextFieldSM.setOpaque(false);
        contentSM.setOpaque(false);

        // tao duong vien mau xam
        contentSM.setBorder(BorderFactory.createLineBorder(Color.gray));


        // chinh sua kich thuoc cho jtextField va jtextArea
        emailRecipientTextFieldSM.setPreferredSize(new Dimension(250,30));
        subjectTextFieldSM.setPreferredSize(new Dimension(250,30));
        contentSM.setPreferredSize(new Dimension(440,500));


        //chinh sua button
        sendMailSM.setFocusPainted(false);
        sendMailSM.setOpaque(false);
        sendMailSM.setCursor(new Cursor(Cursor.HAND_CURSOR));



        springLayoutSM.putConstraint(springLayoutSM.NORTH,textRecipientSM,100,springLayoutSM.NORTH,this);
        springLayoutSM.putConstraint(springLayoutSM.WEST,textRecipientSM,320,springLayoutSM.WEST,this);

        springLayoutSM.putConstraint(springLayoutSM.NORTH,textSubjectSM,170,springLayoutSM.NORTH,this);
        springLayoutSM.putConstraint(springLayoutSM.WEST,textSubjectSM,320,springLayoutSM.WEST,this);

        springLayoutSM.putConstraint(springLayoutSM.NORTH,emailRecipientTextFieldSM,125,springLayoutSM.NORTH,this);
        springLayoutSM.putConstraint(springLayoutSM.WEST,emailRecipientTextFieldSM,300,springLayoutSM.WEST,this);

        springLayoutSM.putConstraint(springLayoutSM.NORTH,subjectTextFieldSM,200,springLayoutSM.NORTH,this);
        springLayoutSM.putConstraint(springLayoutSM.WEST,subjectTextFieldSM,300,springLayoutSM.WEST,this);

        springLayoutSM.putConstraint(springLayoutSM.NORTH,contentSM,100,springLayoutSM.NORTH,this);
        springLayoutSM.putConstraint(springLayoutSM.WEST,contentSM,600,springLayoutSM.WEST,this);

        springLayoutSM.putConstraint(springLayoutSM.NORTH,sendMailSM,270,springLayoutSM.NORTH,this);
        springLayoutSM.putConstraint(springLayoutSM.WEST,sendMailSM,390,springLayoutSM.WEST,this);

        sendMailSM.addActionListener(sendEmailController);

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

    public JTextField getEmailRecipientTextFieldSM() {
        return emailRecipientTextFieldSM;
    }

    public JTextField getSubjectTextFieldSM() {
        return subjectTextFieldSM;
    }

    public JTextArea getContentSM() {
        return contentSM;
    }
}
