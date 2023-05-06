package com.geekster.studentcourse.controllers;


import com.geekster.studentcourse.models.Student;
import com.geekster.studentcourse.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "student/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "course/{id}")
    ResponseEntity<List<Student>> getStudentByCourseId(@PathVariable Long id)
    {
        List<Student> myStudents =  studentService.getStudentByCourseId(id);

        if(myStudents.size() == 0)
        {
            //204 error
            throw new IllegalStateException("Mainak is testing messages");
            //return new ResponseEntity<List<Student>>(myStudents, HttpStatus.NO_CONTENT);
        }
        else
        {
            //200
            return new ResponseEntity<List<Student>>(myStudents, HttpStatus.OK);
        }
    }
}
