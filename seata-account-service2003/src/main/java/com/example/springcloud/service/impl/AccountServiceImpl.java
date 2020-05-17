package com.example.springcloud.service.impl;

import com.example.springcloud.dao.AccountDao;
import com.example.springcloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/17 12:41
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService
{
    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money)
    {
        log.info("----------------account-service 中扣减账户余额开始");
        //模拟超时异常，全局事务回滚
        try
        {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        accountDao.decrease(userId, money);
        log.info("----------------account-service 中扣减账户余额结束");
    }
}
