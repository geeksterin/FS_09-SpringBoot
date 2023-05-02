package com.geekster.Mapping.repository;

import com.geekster.Mapping.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepository extends CrudRepository<User,Long> {
}
