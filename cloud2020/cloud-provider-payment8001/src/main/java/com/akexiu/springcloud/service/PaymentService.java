package com.akexiu.springcloud.service;

import com.akexiu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * 描述:
 * PaymentService接口
 *
 * @outhor akexiu
 * @create 2020-03-12 21:47
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
