package com.jeffrey.spring.demo2.controller;

import com.jeffrey.spring.demo2.service.StudentService;
import com.jeffrey.spring.demo2.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;

    @PostMapping
    public Student save (@RequestBody Student student){
        return studentService.save(student);
    }


    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email){
        return studentService.findByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();


    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return studentService.update(student);
    }


    @DeleteMapping("/{email}")
    public void deleteStudent(@PathVariable String email){
         studentService.delete(email);
    }
}
