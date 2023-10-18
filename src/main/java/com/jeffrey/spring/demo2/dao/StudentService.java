package com.jeffrey.spring.demo2.dao;


import com.jeffrey.spring.demo2.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents( ){


     return List.of(new Student(
                "jeffrey",
                "ehimare",
                LocalDate.now(),
                "jeffreyehimare@gmail.com",
                34
                        ));
    }

}
