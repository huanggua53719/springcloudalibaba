package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/4/24 22:48
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoardMain9001
{
    public static void main(String[] args)
    {
        SpringApplication.run(HystrixDashBoardMain9001.class, args);
    }
}
