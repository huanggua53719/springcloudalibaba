package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/10 21:35
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377
{
    public static void main(String[] args)
    {
        SpringApplication.run(NacosConfigClientMain3377.class,args);
    }
}
