package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Todo {


    private String id;
    @JsonProperty("todoname")
    private String todoName;
    private boolean todoStatus;

    public Todo(String id, String todoName, boolean todoStatus) {
        this.id = id;
        this.todoName = todoName;
        this.todoStatus = todoStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public boolean isTodoStatus() {
        return todoStatus;
    }

    public void setTodoStatus(boolean todoStatus) {
        this.todoStatus = todoStatus;
    }
}
