package com.greenfox.colors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyColorConfig {

        @Bean
        public MyColor getColor() {
            MyColor color = new RedColor();
            return color;
        }
}
