package Networking.Email;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender {
    public static void main(String[] args) {
        // Sender's email credentials
        final String senderEmail = "your-email@gmail.com"; // Replace with your email
        final String senderPassword = "your-app-password"; // Replace with your app password

        // Recipient's email
        String recipientEmail = "recipient-email@example.com";

        // Email properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        // Create a session
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create the email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(
                    Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Test Email from Java");
            message.setText("Hello, this is a test email sent from a Java program!");

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("Error sending email: " + e.getMessage());
        }
    }
}
