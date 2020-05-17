package com.example.springcloud.service;

import com.example.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/17 11:22
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService
{
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);

}
