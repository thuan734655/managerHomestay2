package Controller.ManagerController;

import Controller.Feature.Feature;
import View.ManagerView.PaneSendEmail;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SendEmailController implements ActionListener {
    PaneSendEmail sendEmail;
    Feature feature = new Feature();
    public SendEmailController( PaneSendEmail sendEmail) {
        this.sendEmail = sendEmail;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String recipient = sendEmail.getEmailRecipientTextFieldSM().getText();
        String content = sendEmail.getContentSM().getText();
        String title = sendEmail.getSubjectTextFieldSM().getText();
        feature.sendEmail(recipient,content,title);
    }

}
