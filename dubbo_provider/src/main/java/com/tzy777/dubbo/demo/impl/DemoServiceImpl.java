package com.tzy777.dubbo.demo.impl;

import com.tzy777.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lipu@csii.com.cn
 * @date 2018/9/6 12:01
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
