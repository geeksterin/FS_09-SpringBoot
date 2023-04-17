package com.example.demo.Controller;

import com.example.demo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    @Qualifier("Hitarth")
    Student s1;

    @GetMapping("/student")
    public Student getStudent()
    {
        return s1;
    }
}
