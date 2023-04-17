package com.example.demo.repository;

import com.example.demo.Service.Todo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class TodoDaoRepository {

    private List<Todo> todoList = new ArrayList<>();


}
