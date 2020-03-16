package com.akexiu.springcloud.dao;

import com.akexiu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 描述:
 * 支付dao类
 *
 * @outhor akexiu
 * @create 2020-03-12 21:44
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
