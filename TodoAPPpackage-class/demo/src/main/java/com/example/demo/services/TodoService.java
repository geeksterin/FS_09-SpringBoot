package com.example.demo.services;

import com.example.demo.repository.TodoDao;
import com.example.demo.models.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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


    public List<Todo> getTodosByUserStatus(String status)
    {
        List<Todo> todoListRightNow =  todoDao.getTodosFromDataSource();

        List<Todo> todoListStatusBased = new ArrayList<>();

        for(Todo todo : todoListRightNow)
        {
            if(todo.isTodoStatus() == Boolean.parseBoolean(status))
            {
                todoListStatusBased.add(todo);
            }
        }
        return todoListStatusBased;

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

    public String removeTodoById(String id)
    {
        boolean deleteResponse = false;
        String status;
        if(id != null)
        {
            List<Todo> todoListRightNow =  todoDao.getTodosFromDataSource();

            for(Todo todo : todoListRightNow)
            {
                if(todo.getId().equals(id))
                {
                    deleteResponse = todoDao.remove(todo);
                    if(deleteResponse)
                    {
                        status = "Todo with id: " + id + " was deleted!!!";
                    }
                    else
                    {
                        status = "Todo with id: " + id + " was not deleted!!!...Database error";
                    }
                    return status;
                }
            }

            return "Todo with id: " + id + " does not exist!!!";



        }
        else
        {
            return "Invalid Id ....Cannot accept Null ID!!";
        }
    }


    public String updateTodoStatusById(String id,String status)
    {
        //I purposely put all the business logic for update in the dao layer...students are supposed to restructure
       boolean updateStatus =  todoDao.update(id,Boolean.parseBoolean(status));

       if(updateStatus)
       {
           return "Todo with id: " + id + " was updated!!!";
       }
       else
       {
           return "Todo with id: " + id + " does not exist!!!";
       }
    }
}
