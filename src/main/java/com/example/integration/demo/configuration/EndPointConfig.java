package com.example.integration.demo.configuration;

import com.example.integration.demo.model.Person;
import com.example.integration.demo.service.StringPrintService;
import com.example.integration.demo.service.NumericPrintService;
import com.example.integration.demo.service.PrintService;
import com.example.integration.demo.service.UpperCasePrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;

@Configuration
public class EndPointConfig {

   /* @Bean
    @ServiceActivator(inputChannel = "inputChannel",
            poller = @Poller(fixedRate = "5000", maxMessagesPerPoll = "2"))
    public MessageHandler inputChannelServiceActivator() {
        return message -> printService.print((Message<String>) message);
    }*/

    /*@Bean
    @ServiceActivator(inputChannel = ChannelConfig.NUMERIC_INPUT_CHANNEL)
    public MessageHandler numericInputChannelServiceActivator(NumericPrintService numericPrintService) {
        return message -> numericPrintService.print(message);
    }*/

    /*@Bean
    @ServiceActivator(inputChannel = ChannelConfig.STRING_INPUT_CHANNEL)
    public MessageHandler StringInputChannelServiceActivator(StringPrintService stringPrintService) {
        return message -> stringPrintService.print(message);
    }*/

    /*@Bean
    @ServiceActivator(inputChannel = ChannelConfig.DEFAULT_INPUT_CHANNEL)
    public MessageHandler DefaultInputChannelServiceActivator() {
        return message -> System.out.println("Default Input Channle -> " + message.getPayload());
    }*/

    @Autowired
    private UpperCasePrintService upperCasePrintService;

    @Autowired
    private PrintService printService;

   /* @ServiceActivator(inputChannel = ChannelConfig.INPUT_CHANNEL,
    outputChannel = ChannelConfig.OUTPUT_CHANNEL)
    public String inputChannelServiceActivator(Person person) {
        return upperCasePrintService.execute(person);
    }*/


    @Bean
    @ServiceActivator(inputChannel = ChannelConfig.INPUT_CHANNEL)
    public MessageHandler inputServiceActivator() {
        return message -> printService.print(((Message<Person>) message));
    }

    @ServiceActivator(inputChannel = ChannelConfig.UPPERCASE_CHANNEL)
    public String uppercaseServiceActivator(Person person) {
        return upperCasePrintService.execute(person);
    }
}
