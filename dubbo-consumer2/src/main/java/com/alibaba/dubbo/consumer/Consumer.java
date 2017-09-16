package com.alibaba.dubbo.consumer;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        classPathXmlApplicationContext.start();
        System.out.println("consumer2 start");
        DemoService demoService = classPathXmlApplicationContext.getBean(DemoService.class);
        System.out.println("consumer2");
        System.out.println(demoService.getPermissions(2L));
    }
}
