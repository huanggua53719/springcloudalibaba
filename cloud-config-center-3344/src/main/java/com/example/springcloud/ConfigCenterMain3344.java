package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/4/26 16:20
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344
{
    public static void main(String[] args)
    {
        SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}
