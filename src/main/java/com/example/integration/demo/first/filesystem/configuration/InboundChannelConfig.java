package com.example.integration.demo.first.filesystem.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.core.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.FileWritingMessageHandler;
import org.springframework.integration.file.filters.SimplePatternFileListFilter;
import org.springframework.integration.file.support.FileExistsMode;
import org.springframework.messaging.MessageHandler;

import java.io.File;

@Configuration
public class InboundChannelConfig {

    public static final String INPUT_FILE = "sample.txt";

    public static final String INPUT_DIRECTORY = "/Users/dupeyrat/Desktop/read/";

    public static final String OUTPUT_DIRECTORY = "/Users/dupeyrat/Desktop/write/";

    public static final String FILE_PATTERN = INPUT_FILE;

    @Bean
    @InboundChannelAdapter(channel = ChannelConfig.FILE_INPUT_CHANNEL,
            poller = @Poller(fixedRate = "5000"))
    public MessageSource<File> fileReadingMessageSource() {
        FileReadingMessageSource source = new FileReadingMessageSource();
        source.setDirectory(new File(INPUT_DIRECTORY));
        source.setFilter(new SimplePatternFileListFilter(FILE_PATTERN));
        return source;
    }

    @Bean
    @ServiceActivator(inputChannel = ChannelConfig.FILE_INPUT_CHANNEL)
    public MessageHandler fileWritingMessageHandler() {
        FileWritingMessageHandler messageHandler = new FileWritingMessageHandler(
                new File(OUTPUT_DIRECTORY));
        messageHandler.setFileExistsMode(FileExistsMode.APPEND);
        messageHandler.setAutoCreateDirectory(true);
        messageHandler.setExpectReply(false);
        return messageHandler;
    }
}
