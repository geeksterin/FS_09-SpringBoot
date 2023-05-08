package com.geekster.ecommerce.controller;


import com.geekster.ecommerce.model.Order;
import com.geekster.ecommerce.model.User;
import com.geekster.ecommerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserRepo iUserRepo;

    @PostMapping()
    void addUser(@RequestBody User myUser)
    {
        iUserRepo.save(myUser);
    }
}
