package com.geekster.Mapping.repository;

import com.geekster.Mapping.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IUserRepository extends CrudRepository<User,Long> {

    //@Query(value = "select user.* from user inner join address on user.user_id = address.FK_Address_Userid where address_id = :addressId", nativeQuery = true)
    @Query(value = "select user.* from user inner join address on address.address_id = user.FK_Address_Userid where address_id = :addressId", nativeQuery = true)
    List<User> getUserByAddress(Long addressId);
}
