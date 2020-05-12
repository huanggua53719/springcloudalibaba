package com.example.springcloud;

import com.example.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/4/22 12:29
 */
@SpringBootApplication
@EnableEurekaClient
//自定义选择Ribbon的哪种负载均衡算法，配置的MySelfRule启动类同包下
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain80
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderMain80.class, args);
    }
}
