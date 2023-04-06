package com.geekster.simpleApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private String age;

}
