package com.akexiu.springcloud.service;


import org.springframework.web.bind.annotation.PathVariable;

/**
 * 描述:
 * PaymentService接口
 *
 * @outhor akexiu
 * @create 2020-03-12 21:47
 */
public interface PaymentService {
    public String paymentInfo_OK(Integer id);
    public String paymentInfo_TimeOut(Integer id);
    public String paymentCircuitBreaker( Integer id);

}
