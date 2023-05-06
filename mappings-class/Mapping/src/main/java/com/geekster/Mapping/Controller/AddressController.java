package com.geekster.Mapping.Controller;


import com.geekster.Mapping.models.Address;
import com.geekster.Mapping.models.User;
import com.geekster.Mapping.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    IAddressRepository iAddressRepository;

    @PostMapping(value = "/address")
    void saveAddress(@RequestBody Address address)
    {
        iAddressRepository.save(address);
    }


    @GetMapping(value = "/address/{id}")
    Optional<Address> getAddressById(@PathVariable Long id)
    {
        return iAddressRepository.findById(id);
    }


}
