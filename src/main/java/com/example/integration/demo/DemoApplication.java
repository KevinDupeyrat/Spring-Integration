package com.example.integration.demo;

import com.example.integration.demo.gateway.PrinterGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

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

        List<Future<Message<?>>> futureList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Message<?> message = MessageBuilder
                    .withPayload(i)
                    .setHeader("messageNumber", i)
                    .setHeader("TypeHeader","Integer")
                    .build();
            futureList.add(printerGateway.print(message));
        }
    }
}
