package View.ForgotPass;

import Controller.ForgotPass.NewPassController;

import javax.swing.*;
import java.awt.*;


public class NewPassView extends JFrame {
    private  JLabel textNewPass= new JLabel("New password");
    private JLabel textPass = new JLabel("Password");
    private JLabel textRetype = new JLabel("Retype");
    private JLabel descriptionPass1 = new JLabel("Password must have: 1 uppercase character");
    private JLabel descriptionPass2 = new JLabel("1 lower case character, 1 special character");
    private JLabel descriptionPass3 = new JLabel("and must be 8 characters long");

    private JPasswordField textFieldPass = new JPasswordField();
    private JPasswordField textFieldRetype = new JPasswordField();
    private JButton confirm = new JButton("Confirm");
    private SpringLayout springLayout = new SpringLayout();
    private SpringLayout springLayoutMain = new SpringLayout();
    Dimension dimensionTextField = new Dimension(200,30);
    Font fontMonospaced =  new Font("monospaced", Font.BOLD, 10);
    Font dialogFont =  new Font("dialog", Font.BOLD, 18);

    Font fontSerif = new Font(Font.SERIF,Font.PLAIN|Font.BOLD ,14);
    private JPanel panelCenter = new JPanel();
    Dimension dimensionPanelCenter = new Dimension(300,300);
    NewPassController newPassController = new NewPassController(this);


    public NewPassView(){
        super("Enter verify code");
        init();
        this.setVisible(true);
    }
    public void init () {
        this.setSize(300, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(springLayoutMain);
        this.add(panelCenter);

        panelCenter.setPreferredSize(dimensionPanelCenter);

        panelCenter.setLayout(springLayout);
        panelCenter.add(textNewPass);
        panelCenter.add(textPass);
        panelCenter.add(textFieldPass);
        panelCenter.add(confirm);
        panelCenter.add(textRetype);
        panelCenter.add(textFieldRetype);
        panelCenter.add(descriptionPass1);
        panelCenter.add(descriptionPass2);
        panelCenter.add(descriptionPass3);

        // chinh kich thuoc cho textfield
        textFieldPass.setPreferredSize(dimensionTextField);
        textFieldRetype.setPreferredSize(dimensionTextField);

        // chinh font chu cho textPass ,textRetype,descriptionPass
        textPass.setFont(fontMonospaced);
        textRetype.setFont(fontMonospaced);
        descriptionPass1.setFont(fontMonospaced);
        descriptionPass2.setFont(fontMonospaced);
        descriptionPass3.setFont(fontMonospaced);
        textNewPass.setFont(dialogFont);
        textFieldPass.setFont(fontSerif);
        textFieldRetype.setFont(fontSerif);
        // chinh mau chu cho descriptionPass
        descriptionPass1.setForeground(new Color(238, 99, 99));
        descriptionPass2.setForeground(new Color(238, 99, 99));
        descriptionPass3.setForeground(new Color(238, 99, 99));

        confirm.setFocusPainted(false);
        confirm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        springLayout.putConstraint(springLayout.NORTH, textNewPass, 25, springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST, textNewPass, 90, springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH, textPass, 60, springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST, textPass, 55, springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH, textFieldPass, 80, springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST, textFieldPass, 50, springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH, textRetype, 110, springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST, textRetype, 50, springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH, textFieldRetype, 130, springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST, textFieldRetype, 50, springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH, confirm, 170, springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST, confirm, 100, springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH, descriptionPass1, 200, springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST, descriptionPass1, 10, springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH, descriptionPass2, 217, springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST, descriptionPass2, 10, springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH, descriptionPass3, 234, springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST, descriptionPass3, 10, springLayout.WEST, this);

        // lang nghe su kien cho nut xac nhan
        confirm.addActionListener(newPassController);
    }

    public JPasswordField getTextFieldPass() {
        return textFieldPass;
    }


    public JPasswordField getTextFieldRetype() {
        return textFieldRetype;
    }

}

