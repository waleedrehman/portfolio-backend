package uk.co.waleed.Education.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.co.waleed.Education.Interface.EducationRepository;
import uk.co.waleed.Education.Model.EducationDTO;


@RestController
@Controller
@RequestMapping(path = "/getEducation")
@CrossOrigin(origins = "*")
public class EducationController{

    @Autowired
    private EducationRepository educationRepository;

    @GetMapping(path="/")
    public @ResponseBody Iterable<EducationDTO> getAllUsers() {
        // This returns a JSON or XML with the users
        return educationRepository.findAll();
    }
}
