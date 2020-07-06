package com.imooc.pay.impl;

import com.imooc.pay.PayApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * @author ljj
 * @version 1.0
 * @date 2020/7/6
 */
public class PayServiceTest extends PayApplicationTests {

    @Autowired
    private PayService payService;

    @Test
    public void create() {
        /**
         * BigDecimal.valueOf(0.01) === new BigDecimal("0.01")
         * 不能使用new BigDecimal(0.01)
         */
        payService.create("213936120771", BigDecimal.valueOf(0.01));
    }
}