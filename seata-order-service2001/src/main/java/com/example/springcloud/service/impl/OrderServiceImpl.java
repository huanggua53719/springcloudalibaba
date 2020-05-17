package com.example.springcloud.service.impl;

import com.example.springcloud.dao.OrderDao;
import com.example.springcloud.domain.Order;
import com.example.springcloud.service.AccountService;
import com.example.springcloud.service.OrderService;
import com.example.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/17 11:20
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService
{
    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "fsp-create-order", rollbackFor = Exception.class)
    public void create(Order order)
    {
        log.info("-----开始新建订单");
        orderDao.create(order);

        log.info("-------订单微服务开始调用库存，做扣减");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("-------订单微服务开始调用库存，做扣减end");

        log.info("-------订单微服务开始调用账户，做扣减Money");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("-------订单微服务开始调用账户，做扣减end");

        // 修改订单状态从0到1
        log.info("------修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("------修改订单状态开始 end");

        log.info("------下订单结束---------");
    }

}
