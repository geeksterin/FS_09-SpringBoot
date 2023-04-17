package com.example.demo.Controller;

import com.example.demo.Service.Todo;
import com.example.demo.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;


    @GetMapping(value = "/getTodos")
    public List<Todo> getAllTodos()
    {
        return todoService.getALLTodosInMyList();
    }


}
