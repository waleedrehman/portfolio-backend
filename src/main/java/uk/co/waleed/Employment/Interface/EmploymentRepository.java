package uk.co.waleed.Employment.Interface;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.co.waleed.Employment.Model.EmploymentDTO;

@Repository
public interface EmploymentRepository extends JpaRepository<EmploymentDTO, Integer> {

}
