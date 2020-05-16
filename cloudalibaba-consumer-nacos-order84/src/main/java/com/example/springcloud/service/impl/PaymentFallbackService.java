package com.example.springcloud.service.impl;

import com.example.springcloud.entities.CommonResult;
import com.example.springcloud.entities.Payment;
import com.example.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/16 16:02
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(444,"服务降级返回, ---- PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
