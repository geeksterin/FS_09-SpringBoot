package com.geekster.doctorApp.repository;

import com.geekster.doctorApp.model.AuthenticationToken;
import com.geekster.doctorApp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken, Long> {


    AuthenticationToken findByPatient(Patient patient);

    AuthenticationToken findFirstByToken(String token);
}
