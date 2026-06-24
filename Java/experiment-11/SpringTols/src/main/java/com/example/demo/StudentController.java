package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {

	    return service.addStudent(student);
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
	    return service.getStudents();
	}

	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") int id) {
	    return service.getStudent(id);
	}
    
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable("id") int id,
	                             @RequestBody Student newStudent) {

	    return service.updateStudent(id, newStudent);
	}
    
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") int id) {

	    return service.deleteStudent(id);
	}
    
    
}