package com.geekster.doctorApp.controller;


import com.geekster.doctorApp.dto.SignInInput;
import com.geekster.doctorApp.dto.SignInOutput;
import com.geekster.doctorApp.dto.SignUpInput;
import com.geekster.doctorApp.dto.SignUpOutput;
import com.geekster.doctorApp.model.Patient;
import com.geekster.doctorApp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    //sign up

    // sign up input
    //sign up output
    @PostMapping("/signup")
    public SignUpOutput signup(@RequestBody SignUpInput signUpDto)
    {
        return patientService.signUp(signUpDto);
    }

    //sign in

    @PostMapping("/signin")
    public SignInOutput signup(@RequestBody SignInInput signInDto)
    {
        return patientService.signIn(signInDto);
    }



}
