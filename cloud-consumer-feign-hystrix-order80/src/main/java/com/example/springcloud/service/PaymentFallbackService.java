package com.example.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/4/24 21:54
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService
{
    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "PaymentFallbackService fall back paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "PaymentFallbackService fall back paymentInfo_TimeOut";
    }
}
