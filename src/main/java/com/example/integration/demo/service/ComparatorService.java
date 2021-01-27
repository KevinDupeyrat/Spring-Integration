package com.example.integration.demo.service;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.Comparator;

@Service
public class ComparatorService implements Comparator<Message<?>> {


    @Override
    public int compare(Message<?> o1, Message<?> o2) {
        String payload1 = (String) o1.getPayload();
        String payload2 = (String) o2.getPayload();

        Integer element1 = Integer.valueOf(payload1.substring(payload1.length() - 1));
        Integer element2 = Integer.valueOf(payload2.substring(payload2.length() - 1));

        if (element1 > element2) {
            return -1;
        } else if (element1 < element2) {
            return 1;
        }

        return 0;
    }
}
