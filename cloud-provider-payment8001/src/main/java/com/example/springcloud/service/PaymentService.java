package com.example.springcloud.service;

import com.example.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/4/22 10:04
 */
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
