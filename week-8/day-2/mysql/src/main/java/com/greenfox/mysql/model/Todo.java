package com.greenfox.mysql.model;

import com.greenfox.mysql.Assignee;

import javax.persistence.*;
import java.util.List;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String title;
    boolean isUrgent;
    boolean isDone;

    @OneToOne
    public Assignee assignee;

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }



    public Todo() {
        this.isDone = false;
        this.isUrgent = false;
    }


    public Todo(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(boolean done) {
        isDone = done;
    }
}
