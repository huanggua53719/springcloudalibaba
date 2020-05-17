package com.example.springcloud.controller;

import com.example.springcloud.domain.CommonResult;
import com.example.springcloud.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/17 12:27
 */
@RestController
public class StorageController
{
    @Resource
    private StorageService storageService;

    /**
     * @title 扣减库存
     * @param productId
     * @param count
     * @return
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count)
    {
        storageService.decrease(productId, count);

        return new CommonResult(200,"扣减库存成功");
    }
}
