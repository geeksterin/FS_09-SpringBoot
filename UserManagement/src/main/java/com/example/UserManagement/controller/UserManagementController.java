package com.example.UserManagement.controller;

import com.example.UserManagement.model.User;
import com.example.UserManagement.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserManagementController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/addUser")
    public String addUser(@Valid @RequestBody User user) {
        return userService.addNewUser(user);
    }

    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "getUser/{userid}")
    public User getUser(@PathVariable String userid) {
        return userService.getUserById(userid);
    }

    @PutMapping(value = "/updateUserInfo/{userid}")
    public String updateUserInfo(@PathVariable String userid, @RequestBody User user) {
        return userService.updateUser(userid, user);
    }

    @DeleteMapping(value = "/deleteUser/{userid}")
    public String deleteUser(@PathVariable String userid) {
        return userService.deleteUserById(userid);
    }

}