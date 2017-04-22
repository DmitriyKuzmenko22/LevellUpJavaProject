package email;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by java on 21.04.2017.
 */
public class Main {
    //private static Sender tlsSender = new Sender("dp190792kdg@gmail.com", "repmvtyrj");

    public static void main(String[] args) throws InterruptedException {
      //  tlsSender.send("This is Subject", "TLS: kak dela?", "dp190792kdg@gmail.com", "levelup.java.16.6@gmail.com");
       /* email: levelup.java.16.6@gmail.com
        password: JavaLevelUp166*/

   /*     EmailSender emailSender=EmailSender.INSTANCE;
        emailSender.sendEmail("dp190792kdg@gmail.com","fgfgf","fgr");
        emailSender.sendEmail("dp190792kdg@gmail.com","vgergtgtrgtr","tyr");*/

        ArrayBlockingQueue<EmailMessage> queue = new ArrayBlockingQueue<>(10);
        EmailProducer producer=new EmailProducer(queue);

        EmailConsumer consumer=new EmailConsumer(queue);
        EmailConsumer consumer1=new EmailConsumer(queue);
        EmailConsumer consumer2=new EmailConsumer(queue);

        producer.start();

        consumer.start();
        consumer1.start();
        consumer2.start();
        Thread.sleep(10000);

    }
}
/*
package email;

        import java.util.*;
        import javax.mail.*;
        import javax.mail.internet.*;

*/
/**
 * Created by java on 21.04.2017.
 *//*

public class email.EmailSender {

    public static void main(String [] args) {
        // Recipient's email ID needs to be mentioned.
        String to = "levelup.java.16.6@gmail.com";

        // email.Sender's email ID needs to be mentioned
        String from = "levelup.java.16.6@gmail.com";

        // Assuming you are sending email from localhost
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        final String password = "JavaLevelUp166";
        // Setup mail server
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("This is the Subject Line!");

            // Now set the actual message
            message.setText("This is actual message");

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        }catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
*/
