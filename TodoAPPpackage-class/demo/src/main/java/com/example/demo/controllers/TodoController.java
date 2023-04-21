package com.example.demo.controllers;

import com.example.demo.services.TodoService;
import com.example.demo.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/todoPackage")
public class TodoController {

    @Autowired
    TodoService todoService;

    //get me all the todos in my present todo-List:

    @GetMapping(value = "/getAllTodos")
    public List<Todo> getAllTodos()
    {
        return todoService.getAllTodos();
    }

    @GetMapping(value = "/getTodosByStatus")//request param
    public List<Todo> getTodosByStatus(@RequestParam String status)
    {
        return todoService.getTodosByUserStatus(status);
    }

    @RequestMapping(value = "/getTodoById/{id}",method = RequestMethod.GET)
    public Todo getTodoById(@PathVariable String id)
    {
        return todoService.getTodoBasedOnId(id);
    }

    /////////////////

    @PostMapping(value = "/addTodo")
    public String addTodo(@RequestBody Todo todo)
    {
       return  todoService.addMyTodo(todo);
    }

    ///////////////////////

    //create a delete endpoint:
    @DeleteMapping(value = "/deleteTodoById/{id}")
    public String deleteTodoById(@PathVariable String id)
    {
        return todoService.removeTodoById(id);
    }

    //////////////////////
    //Updation of todo

    @PutMapping(value = "/updateTodoById/{id}/{status}")
    public String updateTodoStatusById(@PathVariable String id, @PathVariable String status)
    {
        return todoService.updateTodoStatusById(id,status);
    }





}
