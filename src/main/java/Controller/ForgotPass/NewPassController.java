package Controller.ForgotPass;

import Controller.Feature.Feature;
import DAO.AccountDAO;
import Model.AccountManager;
import View.ForgotPass.NewPassView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewPassController implements ActionListener {
    NewPassView newPassView;
    AccountDAO accountDAO = new AccountDAO();
    Feature feature = new Feature();

    public NewPassController(NewPassView newPassView) {
        this.newPassView = newPassView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AccountManager accoutManager = accountDAO.selectAccount();

        if(newPassView.getTextFieldPass().getText().equals(newPassView.getTextFieldRetype().getText())) {

           try{
               // kiem tra mat khau co hop le hay khong
               feature.isValidityPass(newPassView.getTextFieldPass().getText());

               // doi mat khau trong class Account
               accoutManager.setPassword(newPassView.getTextFieldPass().getText());

               // doi mat khau trong database
               accountDAO.updatePass(accoutManager);

               // tat jframe doi mat khau moi
               newPassView.dispose();

               JOptionPane.showMessageDialog(null,"Password changed successfully");
           }
           catch (Exception exception) {
               JOptionPane.showMessageDialog(null,exception.getMessage());
           }

        }
        else{
            JOptionPane.showMessageDialog(null,"Password incorrect");
        }

    }
}
