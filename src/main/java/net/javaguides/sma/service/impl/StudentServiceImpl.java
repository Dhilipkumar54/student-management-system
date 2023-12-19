package net.javaguides.sma.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sma.entity.Student;
import net.javaguides.sma.repository.StudentRepository;
import net.javaguides.sma.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	
	private StudentRepository studentrepo;
	
	
	public StudentServiceImpl(StudentRepository studentrepo) {
		super();
		this.studentrepo = studentrepo;
	}

	@Override
	public List<Student> getAllStudents(){
		
		
		return studentrepo.findAll();
				
	}

	@Override
	public Student saveStudent(Student student) {
		return studentrepo.save(student);
	}

	@Override
	public Student getById(int id) {
		return studentrepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentrepo.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		
		studentrepo.deleteById(id);
	}

}
