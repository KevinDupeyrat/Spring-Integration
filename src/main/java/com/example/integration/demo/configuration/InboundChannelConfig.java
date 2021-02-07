package com.example.integration.demo.configuration;

import com.example.integration.demo.model.Person;
import com.example.integration.demo.service.PersonDirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;

@Configuration
public class InboundChannelConfig {

    @Autowired
    private PersonDirectoryService personDirectoryService;

    @InboundChannelAdapter(channel = ChannelConfig.INPUT_CHANNEL,
            poller = @Poller(fixedRate = "3000"))
    public Person firstInboundChannel() {
        return personDirectoryService.findNewPeople();
    }
}
