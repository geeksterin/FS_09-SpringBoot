package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {


    @Autowired
    private UserRepository userRepository;


    //find
    public Iterable<Users> getAllUsers() {

        return	userRepository.findAll();

    }

    public Users findUserById(Integer userId) throws IllegalStateException {
        System.out.println("Finding Enitity by Id = "+userId);
        if(userId == null)
            throw new IllegalStateException("User Id can't be null");

        Optional<Users> findById = userRepository.findById(userId);
        if(findById.isPresent())
            return findById.get();

        throw new IllegalStateException("User With ID = "+userId+" Not found in Database");
    }

    //post

    public String createUser(Users user) {
        Users dbUser = userRepository.save(user);
        System.out.println("Following user info saved in database:");
        System.out.println(dbUser);

        if(dbUser!=null)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }

    public void createUsers(List<Users> userList) {
        Iterable<Users> dbSavedUsers = userRepository.saveAll(userList);
        System.out.println("Following users info saved in database:");
        //dbSavedUsers.forEach(System.out::println);
    }

    //delete :

    public void deleteUserById(int userId) {

        System.out.println("Deleting User whose Id ="+userId);
        userRepository.deleteById(userId);
    }

    //update:

    public void updateUserAgeById(int userId,int newAge) {

        System.out.println("Finding Enitity by Id = "+userId);
        Optional<Users> findById = userRepository.findById(userId);
        Users user = findById.get();
        user.setAge(newAge);

        userRepository.save(user);
    }




}
