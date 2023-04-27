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

    //get by name

    @GetMapping(value = "users/{name}")
    public List<Users> getUsersByName(@PathVariable String name)
    {
        return userService.fetchUserBYName(name);
    }

    //get age greater than
    @GetMapping(value = "users/age/{age}")
    public List<Users> getUsersByAgeFactor(@PathVariable String age)
    {
        return userService.fetchUserByAgeFactor(age);
    }

    //name something or get age greater than something
    @GetMapping(value = "users/{name}/greaterThan/{age}")
    public List<Users> getUsersByNameOrAgeAbove(@PathVariable String name,@PathVariable String age)
    {
        return userService.getUsersByNameOrAgeAbove(name,age);
    }

    //name something and get age greater than something
    @GetMapping(value = "users/ageGreater/combined")
    public List<Users> getUsersByNameAndAgeAbove(@RequestParam String name,@RequestParam String age)
    {
        return userService.getUsersByNameAndAgeAbove(name,age);
    }

    //custom query :

    @GetMapping(value = "/userSort")
    public List<Users> getOrderedUsers()
    {
        return userService.getAllUsersSorted();
    }

    @GetMapping(value = "/userWhere/{age}")
    public List<Users> getUserWhereAge(@PathVariable String age)
    {
        return userService.getAllUsersWhere(age);
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
