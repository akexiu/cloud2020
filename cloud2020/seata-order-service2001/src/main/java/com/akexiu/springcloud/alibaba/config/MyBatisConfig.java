package com.akexiu.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther akexiu
 */
@Configuration
@MapperScan({"com.akexiu.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
