package com.aziz.Students.Managment.System.service;

import com.aziz.Students.Managment.System.entity.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);
    List<Student> searchStudentsByName(String name);

    List<Student> getStudentsByCourse(String course);
}