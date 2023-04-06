package com.geekster.simpleApplication.controller;

import com.geekster.simpleApplication.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class CatController {

    @GetMapping(value = "/cat")
    public String getCatInfo() {
        String message = "This is the information about cat";
        return "This is the information about cat" + "\n" + "";
    }

    @PostMapping(value = "/cat")
    public String saveCat(@RequestBody String studentObj) {


        return "Saved- " + studentObj;
    }

}
