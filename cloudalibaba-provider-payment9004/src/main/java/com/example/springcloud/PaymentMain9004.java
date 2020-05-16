package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/15 16:58
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9004
{
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentMain9004.class,args);
    }
}
