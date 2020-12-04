package uk.co.waleed.Employment.Interface;


import org.springframework.data.jpa.repository.JpaRepository;
import uk.co.waleed.Employment.Model.EmploymentDTO;

public interface EmploymentRepository extends JpaRepository<EmploymentDTO, Integer> {

}
