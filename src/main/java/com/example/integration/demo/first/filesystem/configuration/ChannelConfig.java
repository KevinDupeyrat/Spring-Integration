package com.example.integration.demo.first.filesystem.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

@Configuration
public class ChannelConfig {

    @Bean
    public MessageChannel fileInputChannel() {
        return new DirectChannel();
    }

    public static final String FILE_INPUT_CHANNEL = "fileInputChannel";


    @Bean
    public MessageChannel fileOutputChannel() {
        return new DirectChannel();
    }

    public static final String FILE_OUTPUT_CHANNEL = "fileOutputChannel";
}
