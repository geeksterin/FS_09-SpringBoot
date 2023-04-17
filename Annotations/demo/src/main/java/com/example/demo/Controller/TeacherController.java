package com.example.demo.Controller;


import ComponetScanTest.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

   @Autowired
   Teacher t1;

   @RequestMapping(value = "/teach",method = RequestMethod.GET)
   public String teach()
   {
       return t1.teach();
   }
}
