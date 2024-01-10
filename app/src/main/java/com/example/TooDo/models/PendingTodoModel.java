package com.example.TooDo.models;

public class PendingTodoModel {
    private int todoID;
    private String todoTitle,todoContent,todoDate,
            todoTime,todoTag,todopriority,todoProgress;

    public PendingTodoModel(){}

    public PendingTodoModel(String todoTitle, String todoContent,String todoTag, String todoDate, String todoTime,String todopriority,String todoProgress) {
        this.todoTitle = todoTitle;
        this.todoContent = todoContent;
        this.todoDate = todoDate;
        this.todoTime = todoTime;
        this.todoTag = todoTag;
        this.todopriority=todopriority;
        this.todoProgress=todoProgress;
    }

    public PendingTodoModel(int todoID, String todoTitle, String todoContent,String todoTag, String todoDate, String todoTime,String todopriority,String todoProgress) {
        this.todoID = todoID;
        this.todoTitle = todoTitle;
        this.todoContent = todoContent;
        this.todoDate = todoDate;
        this.todoTime = todoTime;
        this.todoTag = todoTag;
        this.todopriority=todopriority;
        this.todoProgress=todoProgress;
    }

    public String getTodoProgress() {return todoProgress;}
    public void setTodoProgress(String todoProgress){this.todoProgress=todoProgress;}
    public String getTodoPriority() {return todopriority;}
    public void setTodoPriority(String todopriority){this.todopriority=todopriority;}
    public int getTodoID() {
        return todoID;
    }

    public void setTodoID(int todoID) {
        this.todoID = todoID;
    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public String getTodoContent() {
        return todoContent;
    }

    public void setTodoContent(String todoContent) {
        this.todoContent = todoContent;
    }

    public String getTodoDate() {
        return todoDate;
    }

    public void setTodoDate(String todoDate) {
        this.todoDate = todoDate;
    }

    public String getTodoTime() {
        return todoTime;
    }

    public void setTodoTime(String todoTime) {
        this.todoTime = todoTime;
    }

    public String getTodoTag() {
        return todoTag;
    }

    public void setTodoTag(String todoTag) {
        this.todoTag = todoTag;
    }
}
