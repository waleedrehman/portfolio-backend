package uk.co.waleed.Education.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.co.waleed.Education.Interface.EducationRepository;
import uk.co.waleed.Education.Model.EducationDTO;


@RestController
@Controller
@RequestMapping(path = "/getEducation")
public class EducationController{
    private EducationRepository educationRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<EducationDTO> getAllUsers() {
        // This returns a JSON or XML with the users
        return educationRepository.findAll();
    }

    @RequestMapping("/getEducation")
    @ResponseBody
    public String getEducation() {
        return String.format("<center><h1>Welcome to Portfolio Backend</h1>"
                + "To be continued");
    }
}
