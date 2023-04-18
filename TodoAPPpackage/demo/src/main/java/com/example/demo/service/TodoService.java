package com.example.demo.service;


import com.example.demo.dao.TodoRepository;
import com.example.demo.service.todoModels.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public List<Todo> getAllTodos()
    {
       return todoRepository.getTodoFromTodoList();
    }

    public boolean addTodo(Todo todo)
    {
       boolean insertionStatus =  todoRepository.pushTodo(todo);
       return insertionStatus;
    }

    public Todo getTodoById(String id)
    {
        if(id!=null)
        {
            Todo idSpecificTodo = todoRepository.fetchTodoById(id);
            return idSpecificTodo;
        }

        return null;
    }

    public List<Todo> getTodoByStatus(String status)
    {
        List<Todo> allTodosRightNow = todoRepository.getTodoFromTodoList();
        List<Todo> statusSpecificTodos = new ArrayList<>();
        boolean todoStatus = Boolean.parseBoolean(status);

        for(Todo todo : allTodosRightNow)
        {
            if(todoStatus == todo.getStatus())
            {
                statusSpecificTodos.add(todo);
            }
        }

        return statusSpecificTodos;
    }
}
