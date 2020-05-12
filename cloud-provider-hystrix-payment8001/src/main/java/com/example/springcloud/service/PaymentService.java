package com.example.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/4/24 10:54
 */
public interface PaymentService
{
    public String paymentInfo_OK(Integer id);

    public String paymentInfo_TimeOut(Integer id);

    public String paymentCircuitBreaker(@PathVariable("id") Integer id);
}