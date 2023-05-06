package com.geekster.Mapping.Controller;


import com.geekster.Mapping.models.Address;
import com.geekster.Mapping.models.User;
import com.geekster.Mapping.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    IUserRepository userRepository;


    @PostMapping(value = "/users")
    void saveUser(@RequestBody User user)
    {

        //resolved the issue where inserting from reference side gave me : null in FKey
       // List<Address> addressList = user.getUserAddress();

       /* for(Address address :  addressList)
        {
            address.setUser(user);
        }*/

        /*for(Address address :  addressList)
        {
            //List.of(user);//creating a list of Users : right now just contains one user: passed from postman
            //List<User> list = new ArrayList<>();
            //list.add(user);
            address.setUser(List.of(user));
        }*/

        userRepository.save(user);
    }

/*    @GetMapping(value = "/user/{id}")
    List<User> getUserByAddId(@PathVariable Long id)
    {
        return userRepository.getUserByAddress(id);
    }*/

    @GetMapping(value = "/user/{id}")
    Optional<User> getUserById(@PathVariable Long id)
    {
        return userRepository.findById(id);
    }

    @PostMapping(value = "/user")
    void addUser(@RequestBody User user)
    {
        user.getUserAddress().setUser(user);//same problem posting from reference table
        userRepository.save(user);
    }
}
