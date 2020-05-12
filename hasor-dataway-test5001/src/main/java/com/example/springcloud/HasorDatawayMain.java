package com.example.springcloud;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/6 13:35
 */
@EnableHasor
@EnableHasorWeb
@SpringBootApplication(scanBasePackages = { "com.example.springcloud.hasor.module" })
public class HasorDatawayMain
{
    public static void main(String[] args)
    {
        SpringApplication.run(HasorDatawayMain.class, args);
    }
}
