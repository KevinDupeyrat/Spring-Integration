package com.example.integration.demo.first.overview.configuration;

import org.springframework.context.annotation.Configuration;

// @Configuration
public class SplitterConfig {

    /*@Splitter(inputChannel = ChannelConfig.INPUT_CHANNEL,
            outputChannel = ChannelConfig.STRING_INPUT_CHANNEL)
    public Object splitterMessage(Message<?> message) {
        return new ArrayList<>(Arrays.asList(message.getPayload()
        .toString().split(" ")));
    }*/
}
