package com.example.integration.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.router.HeaderValueRouter;
import org.springframework.integration.router.PayloadTypeRouter;

@Configuration
public class RouterConfig {

    /**
     * Payloard Type Router
     * @return
     */
    /*@Bean
    @ServiceActivator(inputChannel = ChannelConfig.INPUT_CHANNEL)
    public PayloadTypeRouter inputChannelRouter() {
        PayloadTypeRouter payloadTypeRouter = new PayloadTypeRouter();
        payloadTypeRouter.setChannelMapping(String.class.getName(), ChannelConfig.STRING_INPUT_CHANNEL);
        payloadTypeRouter.setChannelMapping(Integer.class.getName(), ChannelConfig.NUMERIC_INPUT_CHANNEL);
        return payloadTypeRouter;
    }*/

    /**
     * Header Type Router
     * @return
     */
    @Bean
    @ServiceActivator(inputChannel = ChannelConfig.INPUT_CHANNEL)
    public HeaderValueRouter inputChannelRouter() {
        HeaderValueRouter headerValueRouter = new HeaderValueRouter("TypeHeader");
        headerValueRouter.setChannelMapping("String", ChannelConfig.STRING_INPUT_CHANNEL);
        headerValueRouter.setChannelMapping("Integer", ChannelConfig.NUMERIC_INPUT_CHANNEL);
        return headerValueRouter;
    }
}
