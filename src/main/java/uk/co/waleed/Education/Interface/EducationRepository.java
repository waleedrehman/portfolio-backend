package uk.co.waleed.Education.Interface;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.co.waleed.Education.Model.EducationDTO;

@Repository
public interface EducationRepository extends JpaRepository<EducationDTO, Integer> {

}
