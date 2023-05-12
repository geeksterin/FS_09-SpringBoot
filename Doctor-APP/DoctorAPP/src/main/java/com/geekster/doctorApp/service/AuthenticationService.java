package com.geekster.doctorApp.service;


import com.geekster.doctorApp.model.AuthenticationToken;
import com.geekster.doctorApp.model.Patient;
import com.geekster.doctorApp.repository.IPatientRepo;
import com.geekster.doctorApp.repository.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    ITokenRepo iTokenRepo;

    public void saveToken(AuthenticationToken token)
    {
        iTokenRepo.save(token);
    }

    public AuthenticationToken getToken(Patient patient) {
       return  iTokenRepo.findByPatient(patient);

    }

    public boolean authenticate(String userEmail, String token) {

         AuthenticationToken authToken = iTokenRepo.findFirstByToken(token);//find token object via token string
         String expectedEmail = authToken.getPatient().getPatientEmail();
         return expectedEmail.equals(userEmail);

    }
}
