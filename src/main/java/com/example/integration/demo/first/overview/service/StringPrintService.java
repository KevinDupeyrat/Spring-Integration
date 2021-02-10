package com.example.integration.demo.first.overview.service;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class StringPrintService {

    public void print(Message<?> message) {
        System.out.println("String Printing service : " + message.getPayload());
    }
}
