package com.geekster.InstagramProject.service;


import com.geekster.InstagramProject.repo.IAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {


    @Autowired
    private IAdminRepo adminRepo;
}
