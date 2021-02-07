package com.example.integration.demo.service;

import com.example.integration.demo.model.Person;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class PrintService {

    public void print(Message<Person> message) {
        System.out.println(message.getHeaders());
        System.out.println(message.getPayload());
    }
}
