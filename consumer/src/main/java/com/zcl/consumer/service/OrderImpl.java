package com.zcl.consumer.service;

import com.zcl.interfaces.service.DemoService;
import com.zcl.interfaces.service.Order;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author : chenliangzhou
 * create at:  2021/4/6  12:49 AM
 * @description:
 **/
@Component
public class OrderImpl implements Order {

    @DubboReference
    DemoService demoService;

    @Override
    public String order() {
        return demoService.sayHello("____________________________");
    }
}
