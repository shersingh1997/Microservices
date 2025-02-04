package com.Student.StudentService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Student.StudentService.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student getStudentByRollNo(int rollNo);


}
