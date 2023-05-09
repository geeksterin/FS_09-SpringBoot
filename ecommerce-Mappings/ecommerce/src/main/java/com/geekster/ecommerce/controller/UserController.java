package com.geekster.ecommerce.controller;


import com.geekster.ecommerce.model.Address;
import com.geekster.ecommerce.model.Order;
import com.geekster.ecommerce.model.User;
import com.geekster.ecommerce.repository.IUserRepo;
import com.geekster.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping()
    void addUser(@RequestBody User myUser)
    {

        List<Address> Addresses = myUser.getUserAddresses();
        for (Address add : Addresses)
        {
            add.setUser(myUser);
        }
        userService.save(myUser);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id)
    {
        return userService.getUserById(id);
    }
}
