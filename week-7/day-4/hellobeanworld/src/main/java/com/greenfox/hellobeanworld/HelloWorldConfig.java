package com.greenfox.hellobeanworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld getMessage() {
        HelloWorld helo = new HelloWorld();
        return helo;
    }
}
