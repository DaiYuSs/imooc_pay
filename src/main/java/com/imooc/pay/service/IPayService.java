package com.imooc.pay.service;

import com.lly835.bestpay.model.PayResponse;

import java.math.BigDecimal;

/**
 * @author ljj
 * @version 1.0
 * @date 2020/7/6
 */
public interface IPayService {

    /**
     * 创建/发起支付
     *
     * @param orderId 订单号
     * @param amount  支付的金额
     * @author ljj
     * @date 2020/7/6 14:02
     * @return
     */
    PayResponse create(String orderId, BigDecimal amount);
}
