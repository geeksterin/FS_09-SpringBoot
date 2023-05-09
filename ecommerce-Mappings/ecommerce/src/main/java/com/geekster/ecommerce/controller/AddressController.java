package com.geekster.ecommerce.controller;

import com.geekster.ecommerce.model.Address;
import com.geekster.ecommerce.model.User;
import com.geekster.ecommerce.repository.IAddressRepo;
import com.geekster.ecommerce.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")

public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping()
    void addAddress(@RequestBody Address myAddress)
    {
        addressService.save(myAddress);
    }

    @GetMapping("/{id}")
    Address getAddressById(@PathVariable Integer id)
    {
        return addressService.getAddressById(id);
    }


}
