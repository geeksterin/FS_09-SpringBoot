package com.geekster.ecommerce.repository;

import com.geekster.ecommerce.model.Product;
import com.geekster.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Long> {


    User findByUserId(Long userId);
}
