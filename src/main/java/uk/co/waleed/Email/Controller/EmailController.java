package uk.co.waleed.Email.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailController{

    //https://docs.spring.io/spring/docs/5.1.6.RELEASE/spring-framework-reference/integration.html#mail
    @Autowired
    private JavaMailSender javaMailSender;

    @RequestMapping("/sendEmail")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public String email(@RequestParam(value="subject") String subject,
                        @RequestParam(value="name") String name,
                        @RequestParam(value="email") String email,
                        @RequestParam(value="message") String message){
        if (subject != "" && name != ""
                && email != "" && message != "") {
            sendEmail(subject, name, email, message);
        }
        else {
            return "Validation Failed";
        }
        return String.format("success");
    }

    void sendEmail(String subject, String name, String email, String message) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("hello@waleedrehman.co.uk");

        msg.setReplyTo(email);
        msg.setSubject(subject);
        msg.setText(String.format("Message from %s \n %s",name, message));

        javaMailSender.send(msg);

    }
}
