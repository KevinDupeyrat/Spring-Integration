package com.example.integration.demo.service;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class NumericPrintService {

    public void print(Message<?> message) {
        System.out.println("Numeric Printing service : " +
                message.getPayload() + " " + message.getHeaders().get("messageNumber"));
    }
}
