package com.geekster.Mappings.model;

import com.geekster.Mappings.model.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String studentName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Dept dept;

    @ManyToMany
    @JoinTable(
            name = "student_course_fk",
            joinColumns = @JoinColumn(name = "fk_student_id"),
            inverseJoinColumns = @JoinColumn(name = "fk_course_id")
    )
    private List<Course> courses;
}
