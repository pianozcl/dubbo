package com.zcl.provider.service;

import com.zcl.interfaces.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author : chenliangzhou
 * create at:  2021/4/5  11:58 PM
 * @description:
 **/
@Component
@DubboService(interfaceClass = DemoService.class)
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "provider被调用了，参数为" +name;
    }
}
