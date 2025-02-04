package com.Student.StudentService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Student.StudentService.Entity.Student;
import com.Student.StudentService.StudentService.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService service;
	
	
	@PostMapping("/add")
	public Student addStudentByRollNo( @RequestBody Student student)
	{
		return service.addStudentByRollNo(student);
	}
	
	@GetMapping("/")
	public List<Student> getAllStudents(){
	return service.getAllStudents();
	}
	@GetMapping("/{RollNo}")
	public Student getStudentByRollNo(@PathVariable int RollNo )
	{
		return service.getStudentByRollNo(RollNo);
	}
	
	@PutMapping("/{rollno}")
	public Student updateStudentByRollNo(@PathVariable int rollno, @RequestBody Student student)
	{
		return service.updateStudentByRollNo(rollno,student);
	}
	
	@DeleteMapping("/{RollNo}")
	public List<Student> deleteStudentByRollNo(@PathVariable int RollNo)
	{
		return service.deleteStudentByRollNo(RollNo);
	}
}
