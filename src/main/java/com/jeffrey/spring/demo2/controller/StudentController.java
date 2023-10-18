package com.jeffrey.spring.demo2.controller;

import com.jeffrey.spring.demo2.dao.StudentService;
import com.jeffrey.spring.demo2.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;

    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();

    }
}
