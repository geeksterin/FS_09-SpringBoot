package com.geekster.studentcourse.services;


import com.geekster.studentcourse.models.Student;
import com.geekster.studentcourse.repositories.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    public List<Student> getStudentByCourseId(Long id) {
        return studentRepo.getStudentByCourseID(id);
    }
}
