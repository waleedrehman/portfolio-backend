package uk.co.waleed.Email.Controller;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@RestController
@Controller
@CrossOrigin(origins = "*")
public class MailController {

    //https://docs.spring.io/spring/docs/5.1.6.RELEASE/spring-framework-reference/integration.html#mail
    @Autowired
    private JavaMailSender javaMailSender;

    @CrossOrigin(origins = "*")
    @RequestMapping("/sendMail")
    @ResponseBody
    public String email(@RequestParam(value="subject") String subject,
                        @RequestParam(value="email") String email,
                        @RequestParam(value="message") String message1) throws MessagingException {
        if (subject != "" &&  email != "" && message1 != "") {
            //sendEmail(subject, name, email, message);
            String recipient = "waleedrehman@yahoo.co.uk";

            // email ID of  Sender.
            String sender = "admin@waleedrehman.co.uk";

            // using host as localhost
            String host = "127.0.0.1";

            // Getting system properties
            Properties properties = System.getProperties();

            // Setting up mail server
            properties.setProperty("mail.smtp.host", host);

            // creating session object to get properties
            Session session = Session.getDefaultInstance(properties);

            try
            {
                // MimeMessage object.
                MimeMessage message = new MimeMessage(session);

                // Set From Field: adding senders email to from field.
                message.setFrom(new InternetAddress(sender));

                // Set To Field: adding recipient's email to from field.
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));

                // Set Subject: subject of the email
                message.setSubject(subject);

                // set body of the email.
                message.setText(message1);

                // Send email.
                Transport.send(message);
                System.out.println("Mail successfully sent");
            }
            catch (MessagingException mex)
            {
                mex.printStackTrace();
            }
        }
        else {
            return "Validation Failed";
        }
        return String.format("success");
    }

}
