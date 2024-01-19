package Controller.ManagerController;

import Controller.Feature.Feature;
import DAO.AccountDAO;
import Model.AccountManager;
import View.ManagerView.PaneChangePass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePassController implements ActionListener {
    PaneChangePass paneChangePass;
    Feature feature = new Feature();

    public ChangePassController(PaneChangePass paneChangePass) {
        this.paneChangePass = paneChangePass;
    }

    AccountDAO accountDAO = new AccountDAO();
    @Override
    public void actionPerformed(ActionEvent e) {
        AccountManager accountManager = accountDAO.selectAccount();

        if (e.getSource() instanceof JCheckBox) {
            JCheckBox checkBox = (JCheckBox) e.getSource();
            paneChangePass.getInputPassOldCP().setEchoChar(checkBox.isSelected() ? '\0' : '*');
            paneChangePass.getInputNewPassCP().setEchoChar(checkBox.isSelected() ? '\0' : '*');
            paneChangePass.getInputTypeAgainNewPassCP().setEchoChar(checkBox.isSelected() ? '\0' : '*');
        } else {
            // check mat khau hien tai co dung khong
            if (paneChangePass.getInputPassOldCP().getText().equals(accountManager.getPassword())) {
                try {
                    // check tinh hop le cua mat khau
                    feature.isValidityPass(paneChangePass.getInputNewPassCP().getText());

                    //check mat khau moi co trung nhau hay khong
                    if (paneChangePass.getInputNewPassCP().getText().equals(paneChangePass.getInputTypeAgainNewPassCP().getText())) {
                        accountManager.setPassword(paneChangePass.getInputNewPassCP().getText());
                        int result = accountDAO.updatePass(accountManager);
                        if (result > 0) {
                            JOptionPane.showMessageDialog(null, "Password changed successfully");
                            String email = accountManager.getEmail();
                            String title = "Change password";
                            String content = "Hi! " + "\n" + "\n" + "We\n" +
                                    "We are sending this email to notify you that you have successfully changed your password\n" +
                                    "\n" +
                                    "thanks" + "\n" + "Thuan";
                            feature.sendEmail(email, title, content);
                        } else {
                            JOptionPane.showMessageDialog(null, "Password change failed");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Passwords are not the same");
                    }

                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Password incorrect");
            }
        }
    }
}
