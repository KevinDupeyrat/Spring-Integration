package com.example.integration.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Router;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.router.AbstractMessageRouter;
import org.springframework.integration.router.HeaderValueRouter;
import org.springframework.integration.router.PayloadTypeRouter;
import org.springframework.integration.router.RecipientListRouter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import java.util.ArrayList;
import java.util.Collection;

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
    /*@Bean
    @ServiceActivator(inputChannel = ChannelConfig.INPUT_CHANNEL)
    public HeaderValueRouter inputChannelRouter() {
        HeaderValueRouter headerValueRouter = new HeaderValueRouter("TypeHeader");
        headerValueRouter.setChannelMapping("String", ChannelConfig.STRING_INPUT_CHANNEL);
        headerValueRouter.setChannelMapping("Integer", ChannelConfig.NUMERIC_INPUT_CHANNEL);
        return headerValueRouter;
    }*/

    /**
     * Recipient List Router
     * @return
     */
   /* @Bean
    @ServiceActivator(inputChannel = ChannelConfig.INPUT_CHANNEL)
    public RecipientListRouter inputChannelRouter() {
        RecipientListRouter recipientListRouter = new RecipientListRouter();
        recipientListRouter.setSendTimeout(1_234L);
        recipientListRouter.setIgnoreSendFailures(true);
        recipientListRouter.setApplySequence(true);
        recipientListRouter.addRecipient(ChannelConfig.STRING_INPUT_CHANNEL,
                message -> message.getPayload().equals(41)); // Add exceptions for this route
        recipientListRouter.addRecipient(ChannelConfig.NUMERIC_INPUT_CHANNEL,
                message -> message.getPayload().equals(41));
        recipientListRouter.setDefaultOutputChannelName(ChannelConfig.DEFAULT_INPUT_CHANNEL);
        return recipientListRouter;
    }*/


    @Bean
    @Router(inputChannel = ChannelConfig.INPUT_CHANNEL)
    public AbstractMessageRouter abstractMessageRouter(DirectChannel numericInputChannel,
                                                       DirectChannel stringInputChannel) {
        return new AbstractMessageRouter() {
            @Override
            protected Collection<MessageChannel> determineTargetChannels(Message<?> message) {
                Collection<MessageChannel> messageChannels = new ArrayList<>();

                if (Integer.parseInt(message.getPayload().toString()) % 2 == 0) { // Impaire
                    messageChannels.add(numericInputChannel);
                } else { // Paire
                    messageChannels.add(stringInputChannel);
                }

                return messageChannels;
            }
        };
    }


}
