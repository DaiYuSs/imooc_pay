package com.imooc.pay.controller;

import com.imooc.pay.impl.PayService;
import com.lly835.bestpay.model.PayResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ljj
 * @version 1.0
 * @date 2020/7/6
 */
@Controller
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private PayService payService;

    /**
     * @param orderId 订单号 "213936120771"
     * @param amount  金额 0.01
     * @return org.springframework.web.servlet.ModelAndView
     * @author ljj
     * @date 2020/7/6 17:48
     */
    @GetMapping("/create")
    public ModelAndView create(@RequestParam("orderId") String orderId, @RequestParam("amount") BigDecimal amount) {
        PayResponse response = payService.create(orderId, amount);

        Map<String, String> map = new HashMap<>();
        map.put("codeUrl", response.getCodeUrl());
        return new ModelAndView("create", map);
    }
}
