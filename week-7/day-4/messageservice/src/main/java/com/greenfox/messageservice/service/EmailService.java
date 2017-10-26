package com.greenfox.messageservice.service;

import com.greenfox.messageservice.MessageService;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String address, String message) {
        System.out.println("Email sent to: " + address + " Message= " + message);
    }
}
