package com.example.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/17 12:35
 */
@Mapper
public interface AccountDao
{
    /**
     * @title 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money );
}
