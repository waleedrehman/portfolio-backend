package uk.co.waleed.Employment.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import uk.co.waleed.Employment.Interface.EmploymentRepository;
import uk.co.waleed.Employment.Model.EmploymentDTO;


@RestController
@Controller
@RequestMapping(path = "/getEmployment")
@CrossOrigin(origins = "*")
public class EmploymentController {

    @Autowired
    private EmploymentRepository employmentRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<EmploymentDTO> getAllUsers() {
        // This returns a JSON or XML with the users
        return employmentRepository.findAll();
    }
}
