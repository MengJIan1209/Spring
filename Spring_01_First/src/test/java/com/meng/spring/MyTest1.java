package com.meng.spring;

import com.meng.spring.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest1 {

    @Test
    public void test01(){
        String config = "ba02/applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
