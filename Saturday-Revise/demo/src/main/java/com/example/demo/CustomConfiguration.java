package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"ComponetScanTest"})
public class CustomConfiguration {


    private void print(String logLine)
    {
        System.out.println(logLine);
    }
    @Bean("Satyam")
    public Student getStudent1()
    {


        print("Spring calll.. in config bean of student");
        return new Student("Satyam Jaiswal");
    }

    @Bean("Hitarth")
    @Lazy
    public Student getStudent2()
    {
        print("Spring calll.. in config bean of student");
        return new Student("Hitarth Singh");
    }

}
