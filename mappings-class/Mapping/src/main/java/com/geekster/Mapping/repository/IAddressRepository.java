package com.geekster.Mapping.repository;

import com.geekster.Mapping.models.Address;
import com.geekster.Mapping.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IAddressRepository extends CrudRepository<Address,Long> {



}
