package com.example.integration.demo;

import com.example.integration.demo.first.overview.gateway.PrinterGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.config.EnableIntegration;


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
