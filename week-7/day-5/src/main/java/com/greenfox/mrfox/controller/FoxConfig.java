package com.greenfox.mrfox.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class FoxConfig {


    @Bean
    public Fox getFox() {
        return new Fox("Mr Fox", new ArrayList<>(Arrays.asList(new Trick("poop"))),new Food("chips"),new                    Drink("sprite"));
    }

}
