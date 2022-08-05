package com.study.studentsystem.service;

import com.study.studentsystem.model.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(final Student student);

    List<Student> getAllStudents();

}
