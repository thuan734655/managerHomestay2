package Controller;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmailController {
    public SendEmailController () {

    }
    public void sendEmail(String recipientEmail, String content,String title) {
        final String email = "nanco432@gmail.com";
        final String pass = "lufhlxdwexokzvei";

        Properties props = new Properties();

        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props,new Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, pass);
            }
        });

        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("nanco432@gmail.com"));
            message.setRecipients(MimeMessage.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject(title);
            message.setText(content);
            Transport.send(message);

        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
