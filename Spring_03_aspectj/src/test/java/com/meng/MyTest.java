package com.meng;

import com.meng.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) context.getBean("someService");

//        System.out.println("service=="+service.getClass().getName());
        service.doSome("李四",20);
    }

    @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) context.getBean("someService");
        service.doSome("李四",20);
//        service.doOther();
    }


    @Test
    public void test03(){
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) context.getBean("someService");
        String ret = service.doFirst("wangw");
        System.out.println("ret调用目标方法的结果=="+ret);
    }
}
