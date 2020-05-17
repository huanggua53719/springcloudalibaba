package com.example.springcloud.service;

import com.example.springcloud.domain.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/17 12:40
 */
public interface AccountService
{
    /**
     * 扣减账户余额
     * @param userId 用户ID
     * @param money 金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
