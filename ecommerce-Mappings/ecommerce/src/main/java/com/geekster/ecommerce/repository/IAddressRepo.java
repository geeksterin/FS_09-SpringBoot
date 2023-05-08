package com.geekster.ecommerce.repository;

import com.geekster.ecommerce.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {


    Address findByAddressId(Integer addressID);
}
