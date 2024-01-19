package Controller.ManagerController;

import View.ManagerView.ManagerView;
import View.SignIn.FormSignInView;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TitleController extends MouseAdapter {
   ManagerView managerView;

    public TitleController(ManagerView managerView) {
        this.managerView = managerView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       String option[] = {"Yes","No"};
       int result = JOptionPane.showOptionDialog(null,"Are you sure you want to log out?" , "Log out" ,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,option,option[1]);
       if(result == 0) {
           managerView.dispose();
           FormSignInView formSignInView = new FormSignInView();

       }
    }
}
