package com.example.demo.services;

import com.example.demo.repository.TodoDao;
import com.example.demo.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoDao todoDao;

    public List<Todo> getAllTodos()
    {
        return todoDao.getTodosFromDataSource();
    }

    public String addMyTodo(Todo todo)
    {
        boolean insertionStatus = todoDao.save(todo);//in our case...always true
        if(insertionStatus)
        {
            return "Todo added successfully!!!!!";
        }
        else
        {
            return "Failed!!!!!....Todo Not possible..Database error";//in case of database error ...will see later

        }
    }

    public Todo getTodoBasedOnId(String id)
    {
        List<Todo> todoListRightNow =  todoDao.getTodosFromDataSource();

        for(Todo todo : todoListRightNow)
        {
            if(todo.getId().equals(id))
            {
                return todo;// multiple IDs may exist
            }
        }

        return null;
    }
}
