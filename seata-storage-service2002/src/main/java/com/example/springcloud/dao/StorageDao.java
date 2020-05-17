package com.example.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/17 12:19
 */
@Mapper
public interface StorageDao
{
    //扣减库存
    void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
