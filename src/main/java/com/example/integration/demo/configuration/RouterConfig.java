package com.example.integration.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.router.PayloadTypeRouter;

@Configuration
public class RouterConfig {

    /**
     * Payloard Type Router
     * @return
     */
    @Bean
    @ServiceActivator(inputChannel = ChannelConfig.INPUT_CHANNEL)
    public PayloadTypeRouter inputChannelRouter() {
        PayloadTypeRouter payloadTypeRouter = new PayloadTypeRouter();
        payloadTypeRouter.setChannelMapping(String.class.getName(), ChannelConfig.STRING_INPUT_CHANNEL);
        payloadTypeRouter.setChannelMapping(Integer.class.getName(), ChannelConfig.NUMERIC_INPUT_CHANNEL);
        return payloadTypeRouter;
    }
}
