package com.example.integration.demo.service;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class PrintService {

    public Message<String> print(Message<String> message) {
        System.out.println(message.getPayload());
        int messageNumbe = (int) message.getHeaders().get("messageNumber");
        return MessageBuilder
                .withPayload("I'm a return message from Output Channel with number " + messageNumbe)
                .build();
    }
}
