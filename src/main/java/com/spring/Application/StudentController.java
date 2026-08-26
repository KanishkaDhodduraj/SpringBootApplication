package com.spring.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")

public class StudentController {

    @Autowired

    private StudentService studentService;
    @GetMapping("/getId")
    String getStudentId() {
        studentService.getStudentDetails();
        return "Student ID";
    }

    @GetMapping("/{id}")
    String getId(@PathVariable int id){
        return("Student ID: " + id);
    }

    @GetMapping
    String getSID(@RequestParam("SID") int id){
        return("Student ID: " + id);
    }

    @PostMapping("/create")
    String createStudent(@RequestBody String body){
        return body;
    }

    @PutMapping("/{id}")
    String updateStudentById(@PathVariable int id){
        return("Update Student ID: " + id);
    }

    @DeleteMapping("/{id}")
    String deleteStudentById(@PathVariable int id){
        return("Delete Student ID: " + id);
    }
}