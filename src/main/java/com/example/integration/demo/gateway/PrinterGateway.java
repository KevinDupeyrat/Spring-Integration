package com.example.integration.demo.gateway;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

import java.util.concurrent.Future;

@MessagingGateway
public interface PrinterGateway {

    @Gateway(requestChannel = "pollableChannel")
    public Future<Message<?>> print(Message<?> message);
}
