package com.greenfox.mysql;

import com.greenfox.mysql.model.Todo;
import com.greenfox.mysql.repository.AssigneeRepository;
import com.greenfox.mysql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlApplication implements CommandLineRunner {

	@Autowired
	ToDoRepository todo;
	@Autowired
	AssigneeRepository assigneeRepository;

	public static void main(String[] args) {
		SpringApplication.run(MysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	todo.save(new Todo("Asdsdsds"));
	assigneeRepository.save(new Assignee("Aladar","aladar@gmail.com"));
	}
}
