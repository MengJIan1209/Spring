package com.meng.spring;

import com.meng.spring.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest3 {

    @Test
    public void test(){
        String config = "ba04/applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
