package com.geekster.simpleApplication.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CatController {

    @GetMapping(value = "/cat")
    public String getCatInfo() {
        String message = "This is the information about cat";
        return message;
    }

    @PostMapping(value = "/cat")
    public String saveCat(@RequestBody String requestData) {
        System.out.println(requestData);
        return "Saved- " + requestData;
    }

}
