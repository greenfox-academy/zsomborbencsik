package com.greenfox.todos;

import com.greenfox.todos.model.Todo;
import com.greenfox.todos.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosApplication implements CommandLineRunner{

	@Autowired
	ToDoRepository todo;

	public static void main(String[] args) {
		SpringApplication.run(TodosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todo.save(new Todo("I have to learn Object Relational Mapping"));
	}
}
