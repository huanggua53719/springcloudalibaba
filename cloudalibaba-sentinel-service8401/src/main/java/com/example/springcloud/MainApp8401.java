package com.example.springcloud;

import com.alibaba.csp.sentinel.transport.config.TransportConfig;
import com.example.springcloud.util.IpUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/14 10:58
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MainApp8401
{
    public static void main(String[] args)
    {
        System.setProperty(TransportConfig.HEARTBEAT_CLIENT_IP, "172.20.10.4");
        SpringApplication.run(MainApp8401.class, args);
    }
}
