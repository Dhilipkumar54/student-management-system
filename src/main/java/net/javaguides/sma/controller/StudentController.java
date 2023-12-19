package net.javaguides.sma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.sma.entity.Student;
import net.javaguides.sma.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentservice;

	public StudentController(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}
	
	//Handler method to handle list of students and return model and view
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		
		model.addAttribute("students",studentservice.getAllStudents());
		return "students";
			
	}
	
	//flow 1.1
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		// student object to hold student data
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";   // flow 1.2
	}
	
	//Flow 1.3
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student")Student student) {
		studentservice.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudent(@PathVariable int id,Model model) {
		model.addAttribute("student",studentservice.getById(id) );
		return "edit_student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(
			@PathVariable int id,
		    @ModelAttribute("student")  Student student,
		    Model model
			) {
		Student existingStudent = studentservice.getById(id);
		existingStudent.setId(id);
		existingStudent.setFirstname(student.getFirstname());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setEmail(student.getEmail());
		
		
		studentservice.saveStudent(existingStudent);
		return "redirect:/students";
	}
	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		studentservice.deleteStudent(id);
		return "redirect:/students";
	}
}
