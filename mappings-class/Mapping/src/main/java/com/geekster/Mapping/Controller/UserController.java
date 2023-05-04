package com.geekster.Mapping.Controller;


import com.geekster.Mapping.models.Address;
import com.geekster.Mapping.models.User;
import com.geekster.Mapping.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    IUserRepository userRepository;


    @PostMapping(value = "/user")
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
}
