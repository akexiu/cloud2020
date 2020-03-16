package com.akexiu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @auther zzyy
 * @create 2020-02-18 17:23
 */
@RestController
@Slf4j
public class OrderController
{
    //public static final String PAYMENT_URL = "http://localhost:8001";
    //需要调用的服务地址  需要调用的微服务名称
    public static final String PAYMENT_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/order/payment/zk")
    public String getIP()
    {
        return restTemplate.getForObject(PAYMENT_URL +"/payment/zk",String.class);
    }





}
