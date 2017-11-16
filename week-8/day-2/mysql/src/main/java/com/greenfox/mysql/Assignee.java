package com.greenfox.mysql;

import com.greenfox.mysql.model.Todo;

import javax.persistence.*;

@Entity
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String name;
    String email;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Assignee() {
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
