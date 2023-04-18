package com.example.demo.model;

import lombok.Data;

@Data
public class Todo {

    private  int id;
    private String todoName;
    private String todoStatus;
    private String lastDate;

}
