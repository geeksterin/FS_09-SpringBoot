package com.example.demo.Service;

import com.example.demo.repository.TodoDaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoDaoRepository todoDaoRepository;


    public List<Todo> getALLTodosInMyList()
    {
        //return todoDaoRepository.getAllTodos()
        return todoList;
    }




}
