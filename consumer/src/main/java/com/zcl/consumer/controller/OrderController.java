package com.zcl.consumer.controller;

import com.zcl.consumer.service.OrderImpl;
import com.zcl.interfaces.service.Order;
import org.apache.dubbo.config.annotation.DubboReference;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : chenliangzhou
 * create at:  2021/4/6  1:40 AM
 * @description:
 **/

@RestController
public class OrderController {

    @Autowired
    OrderImpl order;


    @RequestMapping("/print")
    public String print() {
        return order.order();
    }
}
