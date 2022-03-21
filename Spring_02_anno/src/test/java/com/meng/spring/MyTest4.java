package com.meng.spring;

import com.meng.spring.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest4 {

    @Test
    public void test1(){

        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Student student = (Student) context.getBean("myStudent");
        System.out.println("student = " + student);
    }
}
