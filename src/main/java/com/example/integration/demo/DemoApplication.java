package com.example.integration.demo;

import com.example.integration.demo.configuration.ChannelConfig;
import com.example.integration.demo.gateway.PrinterGateway;
import com.example.integration.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;


@SpringBootApplication
@EnableIntegration
public class DemoApplication implements ApplicationRunner {

    @Autowired
    private PrinterGateway printerGateway;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {

       /* Person[] people = {Person.builder()
                .firstName("Bowersox")
                .lastName("Kevin")
                .numberPhone("123456")
                .build(),
                Person.builder()
                        .firstName("Doe")
                        .lastName("John")
                        .numberPhone("789010")
                        .build()};

        for (Person person: people) {
            // printerGateway.print(person);
            System.out.println("Invoking the gateway methode");

            printerGateway.upperCase(person).addCallback(new ListenableFutureCallback<String>() {
                @Override
                public void onSuccess(String s) {
                    System.out.println("Invoking success method");
                    System.out.println(s);
                }

                @Override
                public void onFailure(Throwable throwable) {

                }
            });
        }*/
    }
}
