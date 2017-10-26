package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.MessageProceeder;
import com.greenfox.messageservice.MessageService;
import com.greenfox.messageservice.service.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean
    public MessageProceeder getMessageProceeder() {
        return new MessageProceeder();
    }
    @Bean
    public MessageService getMessageService() {
        return new EmailService();
    }
}
