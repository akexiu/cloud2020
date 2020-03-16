package com.akexiu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 描述:手写负载均衡接口
 *
 * @outhor akexiu
 * @create 2020-03-14 11:50
 */
public interface LB {
    ServiceInstance instance(List<ServiceInstance> serviceInstanceList);
}
