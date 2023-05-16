package com.geekster.doctorApp.service;

import com.geekster.doctorApp.model.AuthenticationToken;
import com.geekster.doctorApp.model.Patient;

public interface IAuthService {

     void saveToken(AuthenticationToken token);
     AuthenticationToken getToken(Patient patient);
     boolean authenticate(String userEmail, String token);


}
