package com.tzy777.dubbo.demo;

import java.util.List;

/**
 * @author lipu@csii.com.cn
 * @date 2018/9/6 12:00
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
