package com.example.integration.demo.service;

import com.example.integration.demo.model.Person;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
public class UpperCasePrintService {

    public String execute(Person person) {

        try {
            TimeUnit.SECONDS.sleep(new Random().nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        return (person.getFirstName() + " " + person.getLastName())
                .toUpperCase();
    }
}
