package uk.co.waleed.Education.Interface;

import org.springframework.data.repository.CrudRepository;

import uk.co.waleed.Education.Model.EducationDTO;

public interface EducationRepository extends CrudRepository<EducationDTO, Integer> {


}
