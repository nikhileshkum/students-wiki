package com.example.studentwiki.service;

import com.example.studentwiki.entity.Student;
import java.util.List;

public interface StudentService {
    Student createStudent(Student s);
    Student getStudentById(Long id);
    List<Student> getAllStudents();
    Student updateStudent(Long id, Student s);
    void deleteStudent(Long id);
}
