package com.example.springcloud.service;

import com.example.springcloud.dao.StorageDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/17 12:25
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService
{

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count)
    {
        log.info("----------storage-service 中扣减库存开始");
        storageDao.decrease(productId, count);
        log.info("----------storage-service 中扣减库存结束");
    }
}
