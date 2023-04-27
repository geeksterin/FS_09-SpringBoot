package com.example.demo.repository;

import com.example.demo.models.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IUserRepository extends CrudRepository <Users,Integer>{

    //get by name
    public List<Users> findByName(String name);

    //get above certain age
    public List<Users> findByAgeGreaterThan(Integer age);

    //or
    public List<Users> findByNameOrAgeGreaterThan(String name,Integer age);

    //and
    public List<Users> findByNameAndAgeGreaterThan(String name,Integer age);


    //make your own queries

    @Query(value = "select * from Users order by user_age asc" , nativeQuery = true)
    public List<Users> findUsersOrderedByAgeASC();

    //@Query(value = "select * from Users where user_age = ?1 order by user_age asc" , nativeQuery = true)
    //public List<Users> findUsersOrderedByAgeASCWithWhere(Integer age);

    @Query(value = "select * from Users where user_age = :age" , nativeQuery = true)
    public List<Users> findUsersOrderedByAgeASCWithWhere(Integer age);


}
