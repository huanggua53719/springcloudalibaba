package com.example.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/17 11:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account
{
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 总额度
     */
    private BigDecimal total;

    /**
     * 已用额度
     */
    private BigDecimal used;

    /**
     * 剩余额度
     */
    private BigDecimal residue;

}
