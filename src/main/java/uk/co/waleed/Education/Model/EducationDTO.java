package uk.co.waleed.Education.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "education")
public class EducationDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String coursetitle;

    private String datefromto;

    private String institution;

    private String description;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getCourseTitle() {
        return coursetitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.coursetitle = courseTitle;
    }

    public String getDateFromTo() {
        return datefromto;
    }

    public void setDateFromTo(String dateFromTo) {
        this.datefromto = dateFromTo;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
