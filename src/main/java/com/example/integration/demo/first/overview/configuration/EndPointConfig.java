package com.example.integration.demo.first.overview.configuration;

import org.springframework.context.annotation.Configuration;

// @Configuration
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

    /*@Autowired
    private UpperCasePrintService upperCasePrintService;

    @Autowired
    private PrintService printService;

    @Autowired
    private PersonRegistrationService personRegistrationService;*/

   /* @ServiceActivator(inputChannel = ChannelConfig.INPUT_CHANNEL,
    outputChannel = ChannelConfig.OUTPUT_CHANNEL)
    public String inputChannelServiceActivator(Person person) {
        return upperCasePrintService.execute(person);
    }*/


    /*@Bean
    @ServiceActivator(inputChannel = ChannelConfig.INPUT_CHANNEL)
    public MessageHandler inputServiceActivator() {
        return message -> printService.print(((Message<Person>) message));
    }

    @ServiceActivator(inputChannel = ChannelConfig.UPPERCASE_CHANNEL)
    public String uppercaseServiceActivator(Person person) {
        return upperCasePrintService.execute(person);
    }



    // Outbound channel adapter
    @ServiceActivator(inputChannel = ChannelConfig.INPUT_CHANNEL)
    public void uoutboundChannelAdapter(Person person) {
        personRegistrationService.registerEmail(person);
    }*/
}
