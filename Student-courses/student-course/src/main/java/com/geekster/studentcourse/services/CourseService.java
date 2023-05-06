package com.geekster.studentcourse.services;


import com.geekster.studentcourse.models.Course;
import com.geekster.studentcourse.repositories.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {


    @Autowired
    private ICourseRepo courseRepo;

    public void addCourse(Course myCourse) {

        courseRepo.save(myCourse);
    }
}
