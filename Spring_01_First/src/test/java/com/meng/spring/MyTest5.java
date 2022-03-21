package com.meng.spring;

import com.meng.spring.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest5 {


    @Test
    public void test(){
        String config = "ba06/applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

}
