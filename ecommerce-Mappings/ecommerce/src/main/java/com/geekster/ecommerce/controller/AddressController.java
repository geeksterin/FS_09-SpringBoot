package com.geekster.ecommerce.controller;

import com.geekster.ecommerce.model.Address;
import com.geekster.ecommerce.model.User;
import com.geekster.ecommerce.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    IAddressRepo iAddressRepo;

    @PostMapping()
    void addAddress(@RequestBody Address myAddress)
    {
        iAddressRepo.save(myAddress);
    }
}
