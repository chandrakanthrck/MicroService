package com.lcwd.user.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {

    //bean for rest template to communicate with other services
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
