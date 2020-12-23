package uk.co.waleed.Home.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return String.format("<center><h1>Welcome to Portfolio Backend</h1>"
                        + "<b>This web service is currently being used by the portfolio UI to fetch the employment and education data from the database"
                        + "<br />The endpoints currently available are as follows:"
                        + "<br />'getEducation' is being used to return the data in education table: "
                        + "<a href='getEducation/'>/getEducation/</a>"
                        + "<br />'getEmployment' is being used to return the data in employment table: "
                        + "<a href='getEmployment/'>/getEmployment/</a>"
                        + "</b></center>");
    }
}
