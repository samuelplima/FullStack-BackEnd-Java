package com.study.studentsystem.controller;

import com.study.studentsystem.model.Student;
import com.study.studentsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/student")
@CrossOrigin
public class StudentController {

    private final StudentService studentService;

    @PostMapping(value = "/add")
    public String add (@RequestBody final Student student){
        studentService.saveStudent(student);
        return  "New Student is added!";
    }

    @GetMapping(value = "/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
