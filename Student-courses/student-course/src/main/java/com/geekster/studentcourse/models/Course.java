package com.geekster.studentcourse.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CourseTable")   //will see this in DB
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseName;
    private Integer courseDurationInMonths;

    @Enumerated(value = EnumType.STRING)
    private CourseType courseType;

    private Double courseFee;


    //@OneToOne(cascade = CascadeType.ALL)

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_course_course_id")
    private List<Student> student;
}
