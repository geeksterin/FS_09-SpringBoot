package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    Service userService;

    @GetMapping(value = "/getAllUser")
    public Iterable<Users> getAllUser() {
        return userService.getAllUsers();
    }

    @PostMapping(value = "/addUser")
    public String addUser( @RequestBody Users user) {
        return userService.createUser(user);
    }


}
