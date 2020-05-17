package com.example.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/17 11:35
 */
@Configuration
@MapperScan({"com.example.springcloud.dao"})
public class MyBatisConfig
{
}
