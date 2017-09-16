package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * Created by QinYixuan on 2017/09/16
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}