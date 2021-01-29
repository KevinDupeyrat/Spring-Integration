package com.example.integration.demo.configuration;

import org.springframework.integration.annotation.Filter;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.messaging.Message;

@MessageEndpoint
public class FilterConfig {


    /**
     * Filter
     *
     * ATTENTION, pas d'annotation @Bean ici replacé par @MessageEndpoint
     *
     * @param message
     * @return
     */
    @Filter(inputChannel = ChannelConfig.INPUT_CHANNEL,
            outputChannel = ChannelConfig.STRING_INPUT_CHANNEL)
    public boolean filterConfigInputChannel(Message<?> message) {
        return Integer.parseInt(message.getPayload().toString()) % 2 == 0;
    }

}
