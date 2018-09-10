package com.tzy777.dubbo.demo.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author lipu@csii.com.cn
 * @date 2018/9/6 14:24
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/*.xml");
        System.out.println(context.getDisplayName()+" :here");
        context.start();
        System.out.println("服务已经启动");
        System.in.read();
    }
}
