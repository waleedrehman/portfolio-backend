package uk.co.waleed.Home.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{

    @RequestMapping("/")
    @ResponseBody
    public String handleError() {
        return String.format("<center><h1>Welcome to Portfolio Backend</h1>"
                        + "To be continued");
    }
}
