package com.example.integration.demo.first.overview.configuration;

import org.springframework.integration.annotation.MessageEndpoint;

// @MessageEndpoint
public class FilterConfig {


    /**
     * Filter
     *
     * ATTENTION, pas d'annotation @Bean ici replacé par @MessageEndpoint
     *
     * @param message
     * @return
     */
    /*@Filter(inputChannel = ChannelConfig.INPUT_CHANNEL,
            outputChannel = ChannelConfig.STRING_INPUT_CHANNEL)
    public boolean filterConfigInputChannel(Message<?> message) {
        return Integer.parseInt(message.getPayload().toString()) % 2 == 0;
    }*/

}
