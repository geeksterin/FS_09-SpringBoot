package com.geekster.Mapping.Controller;


import com.geekster.Mapping.models.Address;
import com.geekster.Mapping.models.User;
import com.geekster.Mapping.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    IAddressRepository iAddressRepository;

    @PostMapping(value = "/address")
    void saveAddress(@RequestBody Address address)
    {
        iAddressRepository.save(address);
    }
}
