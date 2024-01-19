package Controller.ForgotPass;

import Controller.Feature.Feature;
import DAO.AccountDAO;
import Model.AccountManager;
import View.ForgotPass.EnterCodeEmail;
import View.ForgotPass.ForgotPasswordView;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForgotPasswordController  implements ActionListener {
    public ForgotPasswordController() {
    }

    ForgotPasswordView forgotPasswordView;
    Feature feature = new Feature();
    AccountDAO accountDAO = new AccountDAO();
    AccountManager accoutManager;


  private static   String codeEmail="";  // chuoi so xac nhan email

    public ForgotPasswordController(ForgotPasswordView forgotPasswordView) {
        this.forgotPasswordView = forgotPasswordView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

            try{

                feature.isValidityEmail(forgotPasswordView.getTextFieldEmail().getText());

                accoutManager = accountDAO.selectAccount();

                if(accoutManager.getEmail().equals(forgotPasswordView.getTextFieldEmail().getText())) {
                    // random ma de gui ve email
                    double codeRandDouble = Math.random();
                    codeRandDouble *= 10000 + 10000;
                    int codeRandInt = (int)codeRandDouble;
                    codeEmail = String.valueOf(codeRandInt);

                    // gui mail
                    feature.sendEmail(accoutManager.getEmail(),"Verify code",codeEmail);

                    forgotPasswordView.setVisible(false);
                    EnterCodeEmail enterCodeEmail = new EnterCodeEmail();

                }
                else {
                    JOptionPane.showMessageDialog(null,"Email account does not exist!");
                }
            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog(null,exception.getMessage());
            }
        }


    public String getCodeEmail() {
        return codeEmail;
    }
}
