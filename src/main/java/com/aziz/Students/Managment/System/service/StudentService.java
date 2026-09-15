package com.aziz.Students.Managment.System.service;

import com.aziz.Students.Managment.System.entity.Student;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();
    Page<Student> getAllStudents(Pageable pageable);

    Student getStudentById(Long id);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);
    List<Student> searchStudentsByName(String name);
}