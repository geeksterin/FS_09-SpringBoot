package com.example.demo.models;

//import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
public class Todo {


    private String id;
    //@JsonProperty("todoname")
    private String todoName;
    private boolean todoStatus;



}

