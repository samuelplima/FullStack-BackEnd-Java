package com.study.studentsystem.service.impl;

import com.study.studentsystem.model.Student;
import com.study.studentsystem.repository.StudentRepository;
import com.study.studentsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public Student saveStudent(final Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


}
