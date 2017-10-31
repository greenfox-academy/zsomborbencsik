package com.greenfox.mysql.repository;

import com.greenfox.mysql.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

public interface ToDoRepository extends CrudRepository<Todo, Integer> {

}
