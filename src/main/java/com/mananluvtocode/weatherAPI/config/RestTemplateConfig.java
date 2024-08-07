package com.mananluvtocode.weatherAPI.config;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    // This will automatically build the rest template for doing the further work.
    @Bean
    public RestTemplate restTemplateconfiguration(RestTemplateBuilder builder) {
        return builder.build();
    }
}