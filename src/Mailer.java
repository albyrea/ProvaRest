import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {

	public static void main(String[] args) {
		
		Properties props = new Properties();
		
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		
        Session session = Session.getInstance(props,new javax.mail.Authenticator()  
        {protected javax.mail.PasswordAuthentication   
            getPasswordAuthentication()   
        {return new javax.mail.PasswordAuthentication("alberto.reali@gmail.com","Amadio2010");}});  
		
		String msgBody = "Messaggio di prova";
		System.out.println("settato testo");
		
		try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("alberto.reali@gmail.com", "Alberto Reali"));
            msg.addRecipient(Message.RecipientType.TO,
                             new InternetAddress("alberto_reali@hotmail.com", "Alberto Reali"));
            msg.setSubject("Email di prova");
            msg.setText(msgBody);
            Transport.send(msg);
            System.out.println("inviato");

        } catch (AddressException e) {
            // ...
        } catch (MessagingException e) {
        	System.out.println(e.getMessage());
        } catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
