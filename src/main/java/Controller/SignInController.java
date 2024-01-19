package Controller;

import DAO.AccountDAO;
import Model.AccountManager;
import View.ForgotPass.ForgotPasswordView;
import View.ManagerView.ManagerView;
import View.SignIn.FormSignInView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignInController extends MouseMotionAdapter implements ActionListener, MouseListener {
       FormSignInView formSignInView;
       AccountDAO accountDAO = new AccountDAO();

       public SignInController(FormSignInView formSignInView) {
              this.formSignInView = formSignInView;
       }

       @Override
       public void actionPerformed(ActionEvent e) {

              if(e.getSource() instanceof JCheckBox ) {
                     // Xử lý sự kiện khi checkbox thay đổi trạng thái
                     JCheckBox checkBox = (JCheckBox) e.getSource();
                     formSignInView.getTextFieldPassword().setEchoChar(checkBox.isSelected() ? '\0' : '*');
              }
              else {
                     String password = formSignInView.getTextFieldPassword().getText();
                     String username = formSignInView.getTextFieldUsername().getText();

                     if (checkResultSignIn(username,password)) {
                            ManagerView managerView = new ManagerView();
                            formSignInView.dispose();
                     } else {
                            JOptionPane.showMessageDialog(null, "Wrong account or password");
                     }
              }
       }

       // ham kiem tra dang nhap
       public boolean checkResultSignIn(String user,String pass) {
              AccountManager accoutManager = accountDAO.selectAccount();
            return (accoutManager.getUser().equals(user) && (accoutManager.getPassword().equals(pass)));
       }

       @Override
       public void mouseClicked(MouseEvent e) {
              ForgotPasswordView forgotPasswordView = new ForgotPasswordView();
       }

       @Override
       public void mousePressed(MouseEvent e) {

       }

       @Override
       public void mouseReleased(MouseEvent e) {

       }

       @Override
       public void mouseEntered(MouseEvent e) {

       }

       @Override
       public void mouseExited(MouseEvent e) {
              formSignInView.getForgotPassword().setForeground(new Color(0, 104, 139));
       }
       public void mouseMoved(MouseEvent e) {
            formSignInView.getForgotPassword().setForeground(new Color(24, 116, 205));
       }
}
