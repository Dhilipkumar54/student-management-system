package net.javaguides.sma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import net.javaguides.sma.entity.Student;
import net.javaguides.sma.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner  {

	public static void main(String[] args)  {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		
	}
	
	@Autowired
	StudentRepository studentRepository;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Student s1 = new Student("Dhilip", "Kumar" , "kushidk@gmail.com");
//		studentRepository.save(s1)
		
	}

	
	

}
