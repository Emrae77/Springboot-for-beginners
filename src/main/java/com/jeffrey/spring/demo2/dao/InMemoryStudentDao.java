package com.jeffrey.spring.demo2.dao;

import com.jeffrey.spring.demo2.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {
    private final List<Student> Students = new ArrayList<>();



    public Student save(Student s) {
       Students.add(s);
       return s;
    }

    public List<Student> findAllStudents(){
        return Students;


//        return List.of(new Student(
//                "jeffrey",
//                "ehimare",
//                LocalDate.now(),
//                "jeffreyehimare@gmail.com",
//                34
//        ));
    }


    public Student findByEmail(String email) {
        return Students.stream()
                .filter(student -> email.equals(student.getEmail()))
                .findFirst()
                .orElse(null);
    }


    public Student update(Student s) {
        int studentIndex = IntStream.range(0, Students.size())
                .filter(index -> Students.get(index).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);

        if (studentIndex != -1) {
            Students.set(studentIndex, s);
            return s;
        }

        return null;
    }



    public void delete(String email) {
        Student student = findByEmail(email);
        if(student != null){
            Students.remove(student);
        }

    }


}
