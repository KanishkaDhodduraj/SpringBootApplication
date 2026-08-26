package com.spring.Application;

import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    String getStudentDetails() {
        return "Student Details";
    }
}