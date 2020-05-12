package com.example.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/4/24 9:12
 */
public interface LoadBalancer
{
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
