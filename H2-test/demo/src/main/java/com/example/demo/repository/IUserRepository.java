package com.example.demo.repository;

import com.example.demo.models.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepository extends CrudRepository <Users,Integer>{
}
