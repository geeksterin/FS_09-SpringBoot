package com.geekster.ecommerce.service;


import com.geekster.ecommerce.model.User;
import com.geekster.ecommerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    IUserRepo iUserRepo;

    public void save(User myUser) {

        iUserRepo.save(myUser);
    }

    public User getUserById(Long id) {
        return iUserRepo.findByUserId(id);
    }
}
