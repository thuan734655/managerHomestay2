package Controller.ForgotPass;

import View.ForgotPass.EnterCodeEmail;
import View.ForgotPass.NewPassView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterCodeEmailController implements ActionListener {
  EnterCodeEmail enterCodeEmail;
  ForgotPasswordController forgotPasswordController = new ForgotPasswordController();

  public EnterCodeEmailController(EnterCodeEmail enterCodeEmail) {
      this.enterCodeEmail = enterCodeEmail;
  }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (forgotPasswordController.getCodeEmail().equals(enterCodeEmail.getTextFieldCode().getText())) {
            NewPassView newPassView = new NewPassView();
            enterCodeEmail.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "error");
        }
    }

}
