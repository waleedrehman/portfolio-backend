package uk.co.waleed.Employment.Interface;


import org.springframework.data.repository.CrudRepository;
import uk.co.waleed.Employment.Model.EmploymentDTO;

public interface EmploymentRepository extends CrudRepository<EmploymentDTO, Integer> {

}
