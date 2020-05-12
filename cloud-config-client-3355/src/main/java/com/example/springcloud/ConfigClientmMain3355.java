package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/4/26 16:58
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientmMain3355
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConfigClientmMain3355.class, args);
    }
}
