package com.meng.spring.ba01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class StudentTest {

    @Test
    public void testStudent(){
        String config = "ba01/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Object name = context.getBean("student");
        System.out.println(name);
    }


    @Test
    public void testDate(){
        String config = "ba01/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Date mydate = (Date) context.getBean("mydate");
        System.out.println(mydate);
    }
}
