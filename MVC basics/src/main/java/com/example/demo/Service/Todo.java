package com.example.demo.Service;

public class Todo {

    private String todoName;
    private Boolean todoStatus;

    public Todo(String todoName, Boolean todoStatus) {
        this.todoName = todoName;
        this.todoStatus = todoStatus;
    }

    public String getTodoName() {
        return todoName;
    }

    public Boolean getTodoStatus() {
        return todoStatus;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public void setTodoStatus(Boolean todoStatus) {
        this.todoStatus = todoStatus;
    }
}
