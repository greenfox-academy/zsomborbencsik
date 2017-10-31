package com.greenfox.todos.repository;

import com.greenfox.todos.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

public interface ToDoRepository extends CrudRepository<Todo, Integer> {

}
