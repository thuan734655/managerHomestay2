package View.ForgotPass;

import Controller.ForgotPass.EnterCodeEmailController;

import javax.swing.*;
import java.awt.*;

public class EnterCodeEmail extends JFrame {
    private  JLabel textConfirmCode = new JLabel("Enter verify code");
    private JLabel textCode = new JLabel("Verify code");
    private JTextField textFieldCode = new JTextField();
    private JButton confirm = new JButton("Verify");
    private SpringLayout springLayout = new SpringLayout();
    private SpringLayout springLayoutMain = new SpringLayout();
    Dimension dimensionTextField = new Dimension(200,30);
    Font fontMonospaced =  new Font("monospaced", Font.BOLD, 12);
    Font dialogFont =  new Font("dialog", Font.BOLD, 18);

    Font fontSerif = new Font(Font.SERIF,Font.PLAIN|Font.BOLD ,14);
    private JPanel panelCenter = new JPanel();
    Dimension dimensionPanelCenter = new Dimension(300,200);

    EnterCodeEmailController enterCodeEmailController = new EnterCodeEmailController(this);


    public EnterCodeEmail(){
        super("Enter verify code");
        init();
        this.setVisible(true);
    }
    public void init () {
        this.setSize(300, 200);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(springLayoutMain);
        this.add(panelCenter);

        textFieldCode.setPreferredSize(dimensionTextField);

        textFieldCode.setFont(fontSerif);
        textCode.setFont(fontMonospaced);
        textConfirmCode.setFont(dialogFont);

        confirm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        panelCenter.setLayout(springLayout);
        panelCenter.add(textConfirmCode);
        panelCenter.add(textCode);
        panelCenter.add(textFieldCode);
        panelCenter.add(confirm);
        panelCenter.setPreferredSize(dimensionPanelCenter);

        springLayout.putConstraint(springLayout.NORTH, textConfirmCode, 25, springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST, textConfirmCode, 72, springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH, textCode, 60, springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST, textCode, 55, springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH, textFieldCode, 80, springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST, textFieldCode, 50, springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH, confirm, 120, springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST, confirm, 115, springLayout.WEST, this);

        confirm.addActionListener(enterCodeEmailController);
    }

    public JTextField getTextFieldCode() {
        System.out.println(textFieldCode.getText());
        return textFieldCode;
    }

}
