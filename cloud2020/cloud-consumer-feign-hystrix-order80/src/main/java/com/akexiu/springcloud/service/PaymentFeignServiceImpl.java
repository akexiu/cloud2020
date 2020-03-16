package com.akexiu.springcloud.service;

import com.akexiu.springcloud.entities.CommonResult;
import com.akexiu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * 描述:
 *
 * @outhor akexiu
 * @create 2020-03-15 15:54
 */
@Component
public class PaymentFeignServiceImpl implements PaymentFeignService {
    @Override
    public String getPaymentById(Long id) {
        return "1";
    }

    @Override
    public String paymentFeignTimeout() {
        return "2";
    }
}
