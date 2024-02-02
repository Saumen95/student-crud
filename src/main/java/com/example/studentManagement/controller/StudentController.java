package com.example.studentManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentManagement.entity.Student;
import com.example.studentManagement.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	 @PostMapping("/new-student")
	    public Student saveStudent(@Valid @RequestBody(required=true) Student student) {
	        return studentService.createStudent(student);
	    }
	 
	 @GetMapping("/all-student")
	    public List<Student> getAll() {
	        return studentService.getAllStudents();
	    }
	 
	 @GetMapping("/student/{id}")
	    public Student getStudentById(@PathVariable("id") Long id) {
	        return studentService.geStudentById(id);
	    }
	 
	 @PutMapping("/student/{id}")
	    public Student updateStudent(@PathVariable("id") @Valid Long id, @RequestBody Student student) {
	        return studentService.updateStudent(id,student);
	    }
	 
	 @DeleteMapping("/student/{id}")
	    public void deleteStudent(@PathVariable("id") Long id) {
	        studentService.deleteStudent(id);
	    }
	 
	 
}
