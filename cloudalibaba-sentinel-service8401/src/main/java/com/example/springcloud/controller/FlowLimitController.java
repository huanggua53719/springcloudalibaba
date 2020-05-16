package com.example.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/14 10:59
 */
@RestController
@Slf4j
public class FlowLimitController
{
    //QPS测试
    @GetMapping("/testA")
    public String testA()
    {
        log.info(Thread.currentThread().getName()+"\t"+".......testA");
        return "------------testA";
    }

    //QPS测试
    @GetMapping("/testAThread")
    public String testAThread()
    {
        try
        {
            TimeUnit.MILLISECONDS.sleep(800);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return "------------testAThread";
    }

    @GetMapping("/testB")
    public String testB()
    {
        return "------------testB";
    }

    @GetMapping("/testD")
    public String testD()
    {
       /* try
        {
            //暂停几秒钟线程
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        log.info("testD 测试RT");*/

        log.info("testD 异常比例");
        int age = 10/0;
        return "------------testD";
    }

    @GetMapping("/testE")
    public String testE()
    {

        log.info("testE 测试异常数");
        int age = 10/0;
        return "------------testE 测试异常数";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2)
    {
        return "-------testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException exception)
    {
        return "--------deal_testHotKey,------";//sentinel 系统默认的提示,Blocked by Sentinel (flow limiting)
    }
}
