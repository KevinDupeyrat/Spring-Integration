package com.example.integration.demo.service;

import com.example.integration.demo.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonDirectoryService {

    public Person findNewPeople() {
        return Person.builder()
                .lastName("Jan")
                .firstName("Doe")
                .build();
    }
}
