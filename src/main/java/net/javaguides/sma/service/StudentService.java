package net.javaguides.sma.service;

import java.util.List;

import net.javaguides.sma.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getById(int id);
	
	Student updateStudent(Student student);
	
	void deleteStudent(int id);
}
