package com.example.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.example.springcloud.entities.CommonResult;
import com.example.springcloud.entities.Payment;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/15 15:10
 */
public class CustomerBlockHandler
{
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客户自定义测试OK,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客户自定义测试OK,global handlerException----2");
    }
}
