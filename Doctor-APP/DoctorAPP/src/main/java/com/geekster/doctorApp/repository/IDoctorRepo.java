package com.geekster.doctorApp.repository;

import com.geekster.doctorApp.model.Doctor;
import com.geekster.doctorApp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepo extends JpaRepository<Doctor, Long> {


    Doctor findByDoctorId(Long docId);
}
