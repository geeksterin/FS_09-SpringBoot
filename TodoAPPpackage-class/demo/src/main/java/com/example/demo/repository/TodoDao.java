package com.example.demo.repository;

import com.example.demo.models.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoDao {

    private List<Todo> todoList;//data source for all our todos

    public TodoDao()
    {
        todoList = new ArrayList<>() ;
        //not needed ...done for testing
        todoList.add(new Todo("0","Dummy Todo for Testing",true));

    }

    public List<Todo> getTodosFromDataSource()
    {
        return todoList;
    }

    public boolean save(Todo todo)
    {
        todoList.add(todo);//mock Database call
        return true;
    }
}
