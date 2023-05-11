package com.geekster.doctorApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;

    private String doctorName;

    @Enumerated(EnumType.STRING)
    private Specialization specialization;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

}
