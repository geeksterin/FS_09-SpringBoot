package com.geekster.studentcourse.controllers;


import com.geekster.studentcourse.models.Course;
import com.geekster.studentcourse.models.Student;
import com.geekster.studentcourse.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "course/")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping(value = "/")
    public void createCourse(@RequestBody Course myCourse)
    {
        courseService.addCourse(myCourse);
    }


    @GetMapping(value = "student/{courseId}")
    public List<Student> getStudentBYCourseID(@PathVariable Long courseId)
    {
           return courseService.getStudentBYCourseID(courseId);
    }

















}
