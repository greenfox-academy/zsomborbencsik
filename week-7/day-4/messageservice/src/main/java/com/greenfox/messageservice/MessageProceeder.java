package com.greenfox.messageservice;


import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {

    @Autowired
    MessageService messageS;

    public MessageProceeder() {
    }
    public void processMessage(String message, String address) {
        messageS.sendMessage(address,message);
    }

}
