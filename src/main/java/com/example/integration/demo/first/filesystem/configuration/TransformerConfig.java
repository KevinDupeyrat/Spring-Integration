package com.example.integration.demo.first.filesystem.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.file.transformer.FileToStringTransformer;

@Configuration
public class TransformerConfig {

    @Bean
    @Transformer(inputChannel = ChannelConfig.FILE_INPUT_CHANNEL,
            outputChannel = ChannelConfig.FILE_OUTPUT_CHANNEL)
    public FileToStringTransformer fileToStringTransformer() {
        return new FileToStringTransformer();
    }
}
