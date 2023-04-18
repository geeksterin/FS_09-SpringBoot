package com.example.demo.controller;

import com.example.demo.service.TodoService;
import com.example.demo.service.todoModels.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping(value = "/getAllTodos")
    public List<Todo> getAllTodos()
    {
       return todoService.getAllTodos();
    }

    @PostMapping(value = "/addTodo")
    public String addThisTodo(@RequestBody Todo myTodo)
    {
        boolean insertionStatus = todoService.addTodo(myTodo);
        if(insertionStatus)
        {
            //log
            return "todo Added";
        }
        else
        {
            return "Todo_Not_Added";
        }
    }

    @GetMapping(value = "/getMyTodo/{id}")
    public Todo getTodoById(@PathVariable String id)
    {
       return todoService.getTodoById(id);
    }

    @GetMapping(value = "/getMyTodos/{status}")
    public List<Todo> getTodoByStatus(@PathVariable String status)
    {
        return todoService.getTodoByStatus(status);
    }


}
