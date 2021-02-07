package com.example.integration.demo.configuration;

import com.example.integration.demo.interceptor.CustomChannelInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.BridgeTo;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.integration.channel.QueueChannel;

import java.util.concurrent.Executors;

@Configuration
public class ChannelConfig {

    /*@Autowired
    private ComparatorService comparatorService;*/

   /* @Bean
    public PriorityChannel inputChannel() {
        return  new PriorityChannel(10, comparatorService);
    }*/

    /*@Bean
    public DirectChannel inputChannel() {
        DirectChannel directChannel = new DirectChannel();
        directChannel.setFailover(false);

        return directChannel;
    }*/

    /*@Bean
    @BridgeTo(value = "inputChannel",
            poller = @Poller(fixedRate = "5000", maxMessagesPerPoll = "2"))
    public QueueChannel pollableChannel(CustomChannelInterceptor customChannelInterceptor) {
        QueueChannel queueChannel = new QueueChannel(10);
//        queueChannel.addInterceptor(customChannelInterceptor);
        return queueChannel;
    }
    public static final String POLLABLE_CHANNEL = "pollableChannel";


    @Bean
    public PublishSubscribeChannel inputChannel() {
        return new PublishSubscribeChannel(Executors
                .newFixedThreadPool(5));
    }
    public static final String INPUT_CHANNEL = "inputChannel";


    @Bean
    public DirectChannel numericInputChannel() {
        return new DirectChannel();
    }
    public static final String NUMERIC_INPUT_CHANNEL = "numericInputChannel";


    @Bean
    public DirectChannel stringInputChannel() {
        return new DirectChannel();
    }
    public static final String STRING_INPUT_CHANNEL = "stringInputChannel";


    @Bean
    public DirectChannel defaultInputChannel() {
        return new DirectChannel();
    }
    public static final String DEFAULT_INPUT_CHANNEL = "defaultInputChannel";
*/

    @Bean
    public DirectChannel inputChannel() {
        return new DirectChannel();
    }
    public static final String INPUT_CHANNEL = "inputChannel";


    @Bean
    public DirectChannel outputChannel() {
        return new DirectChannel();
    }
    public static final String OUTPUT_CHANNEL = "outputChannel";


    @Bean
    public DirectChannel uppercaseChannel() {
        return new DirectChannel();
    }
    public static final String UPPERCASE_CHANNEL = "uppercaseChannel";

}
