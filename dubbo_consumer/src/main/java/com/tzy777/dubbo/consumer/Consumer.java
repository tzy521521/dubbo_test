package com.tzy777.dubbo.consumer;

import com.tzy777.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lipu@csii.com.cn
 * @date 2018/9/6 17:14
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/*.xml");
        System.out.println(context.getDisplayName()+" :here");
        context.start();
        System.out.println("consumer start");
        //DemoService demoService = context.getBean(DemoService.class);
        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.getPermissions(1L));
    }
}
