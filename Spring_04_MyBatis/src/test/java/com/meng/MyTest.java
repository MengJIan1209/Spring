package com.meng;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01(){
        String config = "applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        String names[] = context.getBeanDefinitionNames();
        for (String name:names){
            System.out.println("容器中对象的名称:"+name);
        }
    }
}
