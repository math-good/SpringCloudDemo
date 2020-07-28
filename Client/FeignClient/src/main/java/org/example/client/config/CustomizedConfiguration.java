package org.example.client.config;

import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CustomizedConfiguration {
    @Bean
    public Decoder feignDecoder() {
        return new MyDecoder();
    }

    @Bean
    public Encoder feignEncoder() {
        return new MyEncoder();
    }
}
