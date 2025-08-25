package com.wipro.sindhu.studentService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.sindhu.entites.Student;

@Service
public interface StudentService {
	
	 List<Student> getAll();

	 void save(Student student);

	 Student getByRollNo(int rollno);

	 void delete(int rollno);
	 
	 Student updateUserDobById(int rollno, Student student);
	
}
