package com.akexiu.springcloud.controller;

import com.akexiu.springcloud.entities.CommonResult;
import com.akexiu.springcloud.entities.Payment;
import com.akexiu.springcloud.service.PaymentFeignService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @auther
 * @create 2020-02-20 0:05
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "default_TimeOutHandler")//配置默认兜底方法
public class OrderFeignHystrixController
{
    @Resource
    private PaymentFeignService paymentFeignService;


    @GetMapping(value = "/c/payment/feign/timeout")
    public String paymentFeignTimeout()
    {
        // OpenFeign客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }

    @GetMapping(value = "/c/payment/h/{id}")
    @HystrixCommand
   // @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")})
    public String paymentInfo_TimeOut(Integer id) {
        try {
            int a = 101/0;
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:  " + Thread.currentThread().getName() + " id:  " + id + "\t" + "O(∩_∩)O哈哈~" + "  耗时(秒): ";
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池:  " + Thread.currentThread().getName() + "  80系统繁忙或者运行报错，请稍后再试,id:  " + id + "\t" + "o(╥﹏╥)o";
    }

    public String default_TimeOutHandler() {
        return "线程池:  " + Thread.currentThread().getName() + "  default80系统繁忙或者运行报错，请稍后再试,id:  " + "" + "\t" + "o(╥﹏╥)o";
    }
}
