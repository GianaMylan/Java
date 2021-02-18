package com.example.firstserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstserver.service.StudentService;
import com.example.firstserver.model.Student;

@RestController //will give us the HTTP methods so when
// we make requests from insomnia itll pass through this
@RequestMapping("/students") // turns the link to http://localhost:8080/students
// from http://localhost/8080/

public class StudentController {
    @Autowired
    StudentService studentService;
    // springboot will automatically tie the object to the class with Autowired
    // we don't need to write StudentService studentService = new StudentService();

    @GetMapping
    public Student getStudent() {
        return studentService.getStudent();
    }
}
