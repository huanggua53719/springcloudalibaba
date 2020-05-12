package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/10 10:08
 */
@SpringBootApplication
public class StreamMQMain8801
{
    public static void main(String[] args)
    {
        SpringApplication.run(StreamMQMain8801.class,args);
    }
}
