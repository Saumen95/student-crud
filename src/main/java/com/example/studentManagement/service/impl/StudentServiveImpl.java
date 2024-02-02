package com.example.studentManagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentManagement.entity.Student;
import com.example.studentManagement.repository.StudentRepository;
import com.example.studentManagement.service.StudentService;

@Service
public class StudentServiveImpl implements StudentService{
	
	@Autowired
	private StudentRepository repo;

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

	@Override
	public Student geStudentById(Long id) {
		// TODO Auto-generated method stub
		Optional<Student> optionalStudent = repo.findById(id);
		return optionalStudent.get();
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Student updateStudent(Long id,Student student) {
		// TODO Auto-generated method stub
		Student existingStudent = repo.findById(id).get();
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setDob(student.getDob());
		existingStudent.setGpa(student.getGpa());
		Student updatedStudent = repo.save(existingStudent);
		return updatedStudent;
	}

	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
