package com.akexiu.springcloud.service.impl;

import com.akexiu.springcloud.dao.PaymentDao;
import com.akexiu.springcloud.entities.Payment;
import com.akexiu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 描述:
 * PaymentService 实现类
 *
 * @outhor akexiu
 * @create 2020-03-12 21:47
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
