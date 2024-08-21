package com.lcwd.user.service.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {

    //bean for rest template to communicate with other services
    @Bean
    //by using loadbalance our local host name changed to the service is recognized
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
