package com.meng.service.impl;

import com.meng.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("业务方法doSome(),创建商品的订单");
    }

    @Override
    public String doOther(String name,Integer age) {
        System.out.println("===doOther()===");
        return "abcd";
    }

    @Override
    public String doFirst(String name) {
        System.out.println("执行了业务方法doFirst，处理库存");
        return "doFirst";
    }
}
