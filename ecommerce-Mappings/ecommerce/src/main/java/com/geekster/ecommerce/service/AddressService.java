package com.geekster.ecommerce.service;

import com.geekster.ecommerce.model.Address;
import com.geekster.ecommerce.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public void save(Address myAddress) {

        iAddressRepo.save(myAddress);
    }


    public Address getAddressById(Integer id) {
        return iAddressRepo.findByAddressId(id);
    }
}
