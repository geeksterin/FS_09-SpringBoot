package com.geekster.Mapping.Controller;


import com.geekster.Mapping.models.User;
import com.geekster.Mapping.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    IUserRepository userRepository;


    @PostMapping(value = "/user")
    void saveUser(@RequestBody User user)
    {
        userRepository.save(user);
    }
}
