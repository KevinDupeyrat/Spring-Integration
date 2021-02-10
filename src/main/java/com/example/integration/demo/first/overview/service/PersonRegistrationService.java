package com.example.integration.demo.first.overview.service;

import com.example.integration.demo.first.overview.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonRegistrationService {

    public void registerEmail(Person person) {
        System.out.println("Email creatred for " + person.getFirstName());
    }
}
