package com.akexiu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述:
 * 支付dto类
 *
 * @outhor akexiu
 * @create 2020-03-12 21:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    public Long id;
    public Long serial;
}
