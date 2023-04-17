package com.example.demo.TeacherSerivePackage;

import ComponetScanTest.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class TeacherService {

    @Autowired
    Teacher t1;


    public String teachServiceCall()
    {
        return t1.teach();
    }
}
