package com.example.springcloud.dao;

import com.example.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/17 11:08
 */
@Mapper
public interface OrderDao
{
    //1 新建订单
    void create(Order order);

    //2 修改订单状态 从0到1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
