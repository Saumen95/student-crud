package com.example.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentManagement.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
