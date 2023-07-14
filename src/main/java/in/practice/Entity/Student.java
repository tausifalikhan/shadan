package in.practice.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="StudentTable")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name= "STUDENT_ID")
	public Integer StudentId;
	
	@Column(name= "STUDENT_NAME")
	public String StudentName;
	
	@Column(name= "ADMISSION_DATE")
	public LocalDate AdmissionDate;
	
	@Column(name= "STUDENT_AGE")
	public Float Age;
	
	@Column(name= "COURSE_GRADE")
	public Character Grade;
	
	
	
	
	
}
