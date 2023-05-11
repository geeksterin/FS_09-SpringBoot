package com.geekster.doctorApp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Appointment {

    @Id
    @EmbeddedId
    private AppointmentKey appointmentKey;

    @ManyToOne
    @JoinColumn(name = "fk_doctor_doc_id")
    private Doctor doctor;

    @OneToOne
    private Patient patient;


}
