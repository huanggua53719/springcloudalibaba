package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/10 19:20
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9002.class, args);
    }
}
