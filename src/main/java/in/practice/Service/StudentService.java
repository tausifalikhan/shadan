package in.practice.Service;

import java.util.List;

import in.practice.Entity.Student;

public interface StudentService {

	public String upsertStudent(Student student);
	
	public List<Student> getAllStudent();
	
	//public Boolean updateStudent(Integer StudentId);
	
	public String deleteBook(Integer StudentId);
	
	
	
	
	
	
	
	
}
