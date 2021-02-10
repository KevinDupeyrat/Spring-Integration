package com.example.integration.demo.first.overview.gateway;

import org.springframework.integration.annotation.MessagingGateway;

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
