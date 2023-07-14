package in.practice.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.practice.Entity.Student;
import in.practice.Repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {

	private StudentRepository repository;
	public StudentServiceImplementation(StudentRepository repository) {
		this.repository=repository;
		
	}
	@Override
	public String upsertStudent(Student student) {
		Integer studentId = student.getStudentId();
		System.out.println(student);
		
		repository.save(student);
		System.out.println(student);
		
		if(studentId==null) {
			return "Student data inserted";
		}else {
			return "Student data updated";
		}
		
	}

	@Override
	public List<Student> getAllStudent() {
		return repository.findAll();
	}

	@Override
	public String deleteBook(Integer StudentId) {
		 repository.deleteById(StudentId);
		 return "Student data deleted" ;
	}

}
