package com.example.firstserver.service;

import org.springframework.stereotype.Service;
import com.example.firstserver.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

    //@Override
    public Student getStudent() {
        Student emma = new Student("Emma", "Frost", 29);
        return emma;
    }
}
