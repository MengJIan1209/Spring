package com.meng.spring.service.impl;

import com.meng.spring.service.SomeService;

public class SomeServiceImpl implements SomeService {

    public SomeServiceImpl(){
        System.out.println("SomeService的无参构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("执行了业务方法doSome()");
    }
}
