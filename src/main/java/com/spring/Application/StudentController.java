package com.spring.Application;

import com.spring.Application.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")

public class StudentController {

    @Autowired

    private StudentService studentService;


    @GetMapping("/{id}")
    ResponseEntity<Student> getId(@PathVariable int id) {
        try {
            Student createdStudent = studentService.getStudent(id);
            return new ResponseEntity<>(createdStudent, HttpStatus.OK);
        } catch (RuntimeException exception) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


    @PostMapping("/create")
    ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.createStudent(student), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    ResponseEntity<Student> updateStudentById(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.updateStudent(student), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    void deleteStudentById(@PathVariable int id) {
        studentService.deleteStudentById(id);
    }
}