package com.example.integration.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Splitter;
import org.springframework.messaging.Message;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class SplitterConfig {

    /*@Splitter(inputChannel = ChannelConfig.INPUT_CHANNEL,
            outputChannel = ChannelConfig.STRING_INPUT_CHANNEL)
    public Object splitterMessage(Message<?> message) {
        return new ArrayList<>(Arrays.asList(message.getPayload()
        .toString().split(" ")));
    }*/
}
