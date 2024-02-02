package com.example.studentManagement.service;

import java.util.List;

import com.example.studentManagement.entity.Student;

public interface StudentService {
	
	Student createStudent(Student student);

    Student geStudentById(Long id);

    List<Student> getAllStudents();

    Student updateStudent(Long id,Student student);

    void deleteStudent(Long id);

}
