package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/4/23 15:54
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004
{
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
