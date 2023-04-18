package com.example.demo.dao;


import com.example.demo.service.todoModels.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {

   private  List<Todo> todoList;

    public TodoRepository()
    {
        todoList = new ArrayList<>();
        todoList.add(new Todo("0","Initial Default Todo",true));
    }

    public List<Todo> getTodoFromTodoList()
    {
        return todoList;
    }

    public boolean pushTodo(Todo todo)
    {
        if(todo != null)
        {
            todoList.add(todo);
            return true;
        }
        else
        {
            return false;
        }
    }

    public Todo fetchTodoById(String id)
    {
        for(Todo todo : todoList)
        {
            if(todo.getId().equals(id))
            {
                return todo;
            }
        }
        return null;
    }

}
