package in.practice.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.practice.Entity.Student;

public interface StudentRepository extends JpaRepository <Student, Serializable>{

}
