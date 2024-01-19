package View.ManagerView;

import Controller.ManagerController.ChangePassController;

import javax.swing.*;
import java.awt.*;

public class PaneChangePass extends JPanel {
    private JLabel passOldCP = new JLabel("Current password");
    private JLabel newPassCP = new JLabel("New password");
    private JLabel typeAgainNewPassCP = new JLabel("Type again");

    private JPasswordField inputPassOldCP = new JPasswordField();
    private JPasswordField inputNewPassCP = new JPasswordField();
    private JPasswordField inputTypeAgainNewPassCP = new JPasswordField();
    private JCheckBox visibleOfPass = new JCheckBox("Show password");
    private JLabel descriptionPass1CP = new JLabel("Password must have: 1 uppercase character");
    private JLabel descriptionPass2CP = new JLabel("1 lower case character, 1 special character");
    private JLabel descriptionPass3CP = new JLabel("and must be 8 characters long");
    Font dialogFont =  new Font("dialog", Font.BOLD, 18);
    Font fontMonospaced =  new Font("monospaced", Font.BOLD, 14);
    private SpringLayout springLayout = new SpringLayout();
    private JButton buttonConfirm = new JButton("Confirm");

    public PaneChangePass() {
        this.setPreferredSize(new Dimension(1100,800));
        this.setBackground(new Color(240,255,255));
        this.setLayout(springLayout);

        this.add(passOldCP);
        this.add(newPassCP);
        this.add(typeAgainNewPassCP);
        this.add(inputNewPassCP);
        this.add(inputPassOldCP);
        this.add(inputTypeAgainNewPassCP);
        this.add(descriptionPass1CP);
        this.add(descriptionPass2CP);
        this.add(descriptionPass3CP);
        this.add(buttonConfirm);
        this.add(visibleOfPass);

        passOldCP.setFont(dialogFont);
        newPassCP.setFont(dialogFont);
        typeAgainNewPassCP.setFont(dialogFont);
        descriptionPass1CP.setFont(fontMonospaced);
        descriptionPass2CP.setFont(fontMonospaced);
        descriptionPass3CP.setFont(fontMonospaced);

        descriptionPass1CP.setForeground(new Color(238, 99, 99));
        descriptionPass2CP.setForeground(new Color(238, 99, 99));
        descriptionPass3CP.setForeground(new Color(238, 99, 99));


        inputNewPassCP.setPreferredSize(new Dimension(250,40));
        inputTypeAgainNewPassCP.setPreferredSize(new Dimension(250,40));
        inputPassOldCP.setPreferredSize(new Dimension(250,40));

        inputPassOldCP.setBorder(BorderFactory.createLineBorder(Color.gray));
        inputNewPassCP.setBorder(BorderFactory.createLineBorder(Color.gray));
        inputTypeAgainNewPassCP.setBorder(BorderFactory.createLineBorder(Color.gray));

        buttonConfirm.setFocusPainted(false);
        buttonConfirm.setCursor(new Cursor(Cursor.HAND_CURSOR));

        visibleOfPass.setOpaque(false);
        visibleOfPass.setCursor(new Cursor(Cursor.HAND_CURSOR));
        visibleOfPass.setFocusPainted(false);


        springLayout.putConstraint(springLayout.NORTH, passOldCP,150, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, passOldCP,550, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, newPassCP,240, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, newPassCP,550, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, typeAgainNewPassCP,330, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, typeAgainNewPassCP,550, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, inputPassOldCP,180, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, inputPassOldCP,550, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, inputNewPassCP,270, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, inputNewPassCP,550, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, inputTypeAgainNewPassCP,360, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, inputTypeAgainNewPassCP,550, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, visibleOfPass,400, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, visibleOfPass,550, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, buttonConfirm,430, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, buttonConfirm,640, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, descriptionPass1CP,480, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, descriptionPass1CP,520, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, descriptionPass2CP,500, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, descriptionPass2CP,520, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, descriptionPass3CP,520, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, descriptionPass3CP,520, springLayout.WEST,this);


        buttonConfirm.addActionListener(new ChangePassController(this));
        visibleOfPass.addActionListener(new ChangePassController(this));

    }

    public JPasswordField getInputPassOldCP() {
        return inputPassOldCP;
    }

    public JPasswordField getInputNewPassCP() {
        return inputNewPassCP;
    }

    public JPasswordField getInputTypeAgainNewPassCP() {
        return inputTypeAgainNewPassCP;
    }

}
