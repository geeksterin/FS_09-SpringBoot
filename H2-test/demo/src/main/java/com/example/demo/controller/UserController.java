package com.example.demo.controller;


import com.example.demo.models.Users;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //Get

    @GetMapping(value = "/users")
    public Iterable<Users> getUsers()
    {
       return userService.getAllUsers();
    }

    //post
    @PostMapping(value = "/users")
    public String insertUsers(@RequestBody List<Users> userList)
    {
        return userService.addUsers(userList);
    }

    //delete
    @DeleteMapping(value = "/user/{id}")
    public void deleteUserById(@PathVariable Integer id)
    {
         userService.removeUserById(id);
    }


}
