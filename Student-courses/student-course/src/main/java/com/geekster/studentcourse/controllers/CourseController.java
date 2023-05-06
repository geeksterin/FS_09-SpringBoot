package com.geekster.studentcourse.controllers;


import com.geekster.studentcourse.models.Course;
import com.geekster.studentcourse.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
