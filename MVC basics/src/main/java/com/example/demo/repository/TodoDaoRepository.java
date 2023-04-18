package com.example.demo.repository;

import com.example.demo.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class TodoDaoRepository {

    List<Todo> todoList = new ArrayList<>();


    public List<Todo> getTodo(String lastDate, String status) {

        List<Todo> filteredToDoList = new ArrayList<>();

        if( lastDate == null && status == null) {
            return todoList;
        }
        else if (lastDate != null && status != null) {


            for (Todo todoObj : todoList) {
                if(todoObj.getLastDate().equals(lastDate) && todoObj.getTodoStatus().equals(status)) {
                    filteredToDoList.add(todoObj);
                }
            }
            return filteredToDoList;
        } else if (lastDate != null) {

            for (Todo todoObj : todoList) {
                if(todoObj.getLastDate().equals(lastDate)) {
                    filteredToDoList.add(todoObj);
                }
            }
        } else if (status != null) {

            for (Todo todoObj : todoList) {
                if(todoObj.getTodoStatus().equals(status)) {
                    filteredToDoList.add(todoObj);
                }
            }
        }
        return filteredToDoList;
    }

    public void saveTodo(Todo requestData) {
        todoList.add(requestData);

    }
}
