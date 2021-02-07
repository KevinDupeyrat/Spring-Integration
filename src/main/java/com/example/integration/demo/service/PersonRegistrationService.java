package com.example.integration.demo.service;

import com.example.integration.demo.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonRegistrationService {

    public void registerEmail(Person person) {
        System.out.println("Email creatred for " + person.getFirstName());
    }
}
