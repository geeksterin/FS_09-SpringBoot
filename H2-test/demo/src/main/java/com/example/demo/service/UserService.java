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

    public List<Users> getAllUsersSorted() {
        return  userRepository.findUsersOrderedByAgeASC();


    }

    public List<Users> getAllUsersWhere(String age) {

        Integer userAge = Integer.parseInt(age);
        return  userRepository.findUsersOrderedByAgeASCWithWhere(userAge);


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

    public List<Users> fetchUserBYName(String name) {

        return userRepository.findByName(name);
    }

    public List<Users> fetchUserByAgeFactor(String age) {
        Integer userAge = Integer.parseInt(age);
        return userRepository.findByAgeGreaterThan(userAge);
    }

    public List<Users> getUsersByNameOrAgeAbove(String name, String age) {

        Integer userAge = Integer.parseInt(age);
        return userRepository.findByNameOrAgeGreaterThan(name,userAge);
    }

    public List<Users> getUsersByNameAndAgeAbove(String name, String age) {

        Integer userAge = Integer.parseInt(age);
        return userRepository.findByNameAndAgeGreaterThan(name,userAge);
    }

}

