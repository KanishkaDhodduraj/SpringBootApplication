package com.spring.Application;

import com.spring.Application.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Bean or //Servive annotation
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudent(int id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student Not Found"));
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudentById(int id) {
         studentRepository.delete(getStudent(id));
    }

    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }

}