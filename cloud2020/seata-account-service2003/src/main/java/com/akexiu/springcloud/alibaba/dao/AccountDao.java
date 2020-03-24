package com.akexiu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * 描述:
 *
 * @outhor akexiu
 * @create 2020-03-19 20:59
 */
@Mapper
public interface AccountDao {
    /**
     * 扣减账户余额
     */
  public  void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
