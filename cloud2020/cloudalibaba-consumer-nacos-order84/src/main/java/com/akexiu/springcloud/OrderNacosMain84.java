package com.akexiu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther akexiu
 * @create 2020-02-23 14:44
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain84
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderNacosMain84.class,args);
    }
}
