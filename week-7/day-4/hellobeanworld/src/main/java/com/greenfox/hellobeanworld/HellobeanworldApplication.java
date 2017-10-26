package com.greenfox.hellobeanworld;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class HellobeanworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellobeanworldApplication.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(HelloWorldConfig.class);
		ctx.refresh();
		HelloWorld helo1 = ctx.getBean(HelloWorld.class);
		helo1.setMessage("Dawggg");
		helo1.getMessage();
		ctx.close();
	}
}
