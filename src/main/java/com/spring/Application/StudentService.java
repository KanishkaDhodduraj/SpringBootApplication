package com.spring.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Bean or //Servive annotation
@Service
public class StudentService {
    private StudentRepository studentRepository;

    //AutoWired
    @Autowired

    public StudentService() {
        studentRepository = new StudentRepository();
    }

        public void getStudentDetails() {
            System.out.println(studentRepository.getStudentDetails());
        }
    }