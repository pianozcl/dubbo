package com.zcl.consumer.test;

import com.zcl.consumer.ConsumerApplication;
import com.zcl.interfaces.service.DemoService;
import com.zcl.interfaces.service.Order;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : chenliangzhou
 * create at:  2021/4/6  1:15 AM
 * @description:
 **/

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestConsumer {

    @DubboReference
    DemoService demoService;


    @Test
    public void test() {
        String xxxxxxx = demoService.sayHello("XXXXXXX");
        System.out.println(xxxxxxx);
    }
}
