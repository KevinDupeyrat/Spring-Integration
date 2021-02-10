package com.example.integration.demo.first.overview.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

    private String firstName;
    private String lastName;
    private String numberPhone;
}
