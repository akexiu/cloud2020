package com.akexiu.springcloud.lb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;
import sun.rmi.runtime.Log;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 描述:
 *
 * @outhor akexiu
 * @create 2020-03-14 11:52
 */
@Component
@Slf4j
public class MyLB implements LB {
    //原子类，用于自增数据处理
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAllInteger() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current > Integer.MAX_VALUE ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        log.info("第几次:\t" + next);
        return next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstanceList) {
        //取模算法，获取服务。实现负载均衡
        int index = this.getAllInteger() % serviceInstanceList.size();
        return serviceInstanceList.get(index);
    }
}
