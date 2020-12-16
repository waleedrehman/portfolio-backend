package uk.co.waleed.Email.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

@RestController
@Controller
@CrossOrigin(origins = "*")
public class EmailController{

    //https://docs.spring.io/spring/docs/5.1.6.RELEASE/spring-framework-reference/integration.html#mail
    @Autowired
    private JavaMailSender javaMailSender;

    @CrossOrigin(origins = "*")
    @RequestMapping("/sendEmail")
    @ResponseBody
    public String email(@RequestParam(value="subject") String subject,
                        @RequestParam(value="name") String name,
                        @RequestParam(value="email") String email,
                        @RequestParam(value="message") String message) throws MessagingException {
        if (subject != "" && name != ""
                && email != "" && message != "") {
            sendEmail(subject, name, email, message);
        }
        else {
            return "Validation Failed";
        }
        return String.format("success");
    }

    void sendEmail(String subject, String name, String email, String message) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
        String htmlMsg = "<h1>A new message received from Contact Form</h1>" +
                String.format("<p>Email: %s</p>",email) +
                String.format("<p>Subject: %s</p>",subject) +
                String.format("<p>Name: %s</p>",name) +
                String.format("<p>Message: %s</p>",message);
        helper.setText(htmlMsg, true); // Use this or above line.
        helper.setTo("hello@waleedrehman.co.uk");
        helper.setSubject(subject);
        helper.setFrom("admin@waleedrehman.co.uk");
        helper.setReplyTo(email);
        javaMailSender.send(mimeMessage);
    }
}
