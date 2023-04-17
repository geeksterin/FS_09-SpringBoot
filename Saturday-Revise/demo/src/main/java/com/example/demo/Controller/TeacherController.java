package com.example.demo.Controller;


import ComponetScanTest.Teacher;
import com.example.demo.TeacherSerivePackage.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TeacherController {

   @Autowired
   TeacherService ts;


   @RequestMapping(value = "/teach",method = RequestMethod.GET)
   @ResponseBody
   public String teach()
   {
       return ts.teachServiceCall();
   }

}
