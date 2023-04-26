package com.example.demo.service;


import com.example.demo.models.Users;
import com.example.demo.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public Iterable<Users> getAllUsers() {
        Iterable<Users>  allUsers = userRepository.findAll();
        return allUsers;

    }

    public String addUsers(List<Users> userList) {
        Iterable<Users>  addedUsers  = userRepository.saveAll(userList);
        if(addedUsers != null)
            return "Yes";
        else
            return "NO";
    }

    public void removeUserById(Integer id) {
        userRepository.deleteById(id);
    }
}
