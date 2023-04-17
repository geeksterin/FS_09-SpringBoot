package com.example.demo.repository;

import com.example.demo.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Repository
public class TodoDaoRepository {

    List<Todo> todoList = new ArrayList<>();


    public List<Todo> getAllTodos() {

        return todoList;
    }

    public void saveTodo(Todo requestData) {
        todoList.add(requestData);

    }
}
