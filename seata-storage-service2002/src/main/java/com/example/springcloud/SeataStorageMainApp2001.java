package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/17 12:03
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //取消数据源的自动创建
public class SeataStorageMainApp2001
{
    public static void main(String[] args)
    {
        SpringApplication.run(SeataStorageMainApp2001.class, args);
    }
}
