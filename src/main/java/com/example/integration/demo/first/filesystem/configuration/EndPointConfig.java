package com.example.integration.demo.first.filesystem.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;


@Configuration
public class EndPointConfig {

    @ServiceActivator(inputChannel = ChannelConfig.FILE_OUTPUT_CHANNEL)
    public void fileWriting(String value) {
        System.out.println(value);
    }
}
