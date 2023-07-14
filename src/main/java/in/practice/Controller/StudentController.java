package in.practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.practice.Entity.Student;
import in.practice.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/student")
	public ResponseEntity<String> upsertStudent(@RequestBody Student student){
		String message = service.upsertStudent(student);
		return new ResponseEntity<>(message, HttpStatus.CREATED);
		
	}
	@GetMapping("/students")
	public ResponseEntity<List<Student>> gatAllStudent(@RequestBody Student student){
		List<Student> allStudent = service.getAllStudent();
		return new ResponseEntity<>(allStudent, HttpStatus.OK);
		
	}
	/*@PutMapping("/student/{StudentId}")
	public ResponseEntity<Boolean> updateBook(@PathVariable Integer StudentId){
		boolean student = service.updateStudent(StudentId);
		return new ResponseEntity<>(student, HttpStatus.OK);
		
	} */
	public ResponseEntity<String> deleteStudent(@PathVariable Integer StudentId){
		String msg = service.deleteBook(StudentId);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	
}
