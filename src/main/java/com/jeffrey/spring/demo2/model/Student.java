package com.jeffrey.spring.demo2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor


public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private int age;

}
