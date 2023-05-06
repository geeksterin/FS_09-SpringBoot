package com.geekster.studentcourse.services;


import com.geekster.studentcourse.models.Course;
import com.geekster.studentcourse.models.Student;
import com.geekster.studentcourse.repositories.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {


    @Autowired
    private ICourseRepo courseRepo;

    public void addCourse(Course myCourse) {

        courseRepo.save(myCourse);
    }

    public List<Student> getStudentByCourse(Long id)
    {
        Optional<Course> myCourse = courseRepo.findById(id);
        Course actualCourse  = myCourse.get();
        return actualCourse.getStudent();
    }

    public List<Student> getStudentBYCourseID(Long courseId) {

        Optional<Course> myCourse = courseRepo.findById(courseId);
        System.out.println("Mainak is not a liar");
        Course course = myCourse.get();//not good ... can give null
        return course.getStudent();

    }
}
