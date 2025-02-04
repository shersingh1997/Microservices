package com.Student.StudentService.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.StudentService.Entity.Student;
import com.Student.StudentService.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repo;
	
	public Student addStudentByRollNo(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	public Student getStudentByRollNo(int rollNo) {
		// TODO Auto-generated method stub
		return repo.getStudentByRollNo(rollNo);
	}


	public List<Student> deleteStudentByRollNo(int rollNo) {
		
		if(repo.existsById(rollNo)) {
			
			repo.deleteById(rollNo);
		}
		
		return repo.findAll();
	}

	public Student updateStudentByRollNo(int rollno, Student student) {
		
		Student st = repo.getStudentByRollNo(rollno);
		
	    if (student.getName() != null) {
	        st.setName(student.getName());
	    }
	    if (student.getAddress() != null) {
	        st.setAddress(student.getAddress());
	    }
	    if (student.getMarks() != 0) {  // Assuming marks default value is 0 for uninitialized
	        st.setMarks(student.getMarks());
	    }
	    

		
		return repo.save(st);
	}


	

	
}
