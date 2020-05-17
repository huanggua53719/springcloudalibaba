package com.example.springcloud.service;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/17 12:24
 */
public interface StorageService
{

    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
