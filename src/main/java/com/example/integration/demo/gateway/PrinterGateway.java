package com.example.integration.demo.gateway;

import com.example.integration.demo.configuration.ChannelConfig;
import com.example.integration.demo.model.Person;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.GatewayHeader;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.Future;

@MessagingGateway()
public interface PrinterGateway {

    /*@Gateway(requestChannel = ChannelConfig.POLLABLE_CHANNEL)
    public Future<Message<?>> print(Message<?> message);*/

    /*@Gateway(requestChannel = ChannelConfig.INPUT_CHANNEL,
            headers = @GatewayHeader(name = "globalHeader", value = "toto"))
    public void print(Person person);

    @Gateway(requestChannel = ChannelConfig.UPPERCASE_CHANNEL)
    public ListenableFuture<String> upperCase(Person person);*/
}
