package com.jeffrey.spring.demo2.service;


import com.jeffrey.spring.demo2.dao.InMemoryStudentDao;
import com.jeffrey.spring.demo2.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentDao inDao;
    @Override
    public Student save(Student s) {
        return inDao.save(s);
    }

    public List<Student> findAllStudents(){


     return inDao.findAllStudents();
    }

    @Override
    public Student findByEmail(String email) {
        return inDao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return inDao.update(s);
    }

    @Override
    public void delete(String email) {
        inDao.delete(email);

    }

}
