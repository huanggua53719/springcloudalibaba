package com.example.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.WebEndpoint;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/4/22 12:37
 */
@Configuration
public class ApplicationContextConfig
{
    @Bean
//    @LoadBalanced //使用@LoadBalanced 注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
