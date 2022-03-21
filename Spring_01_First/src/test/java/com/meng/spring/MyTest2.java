package com.meng.spring;

import com.meng.spring.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest2 {

    @Test
    public void test01(){
        String config = "ba03/applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }


    @Test
    public void testFile(){
        String config = "ba03/applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        File file = (File) context.getBean("file");
        System.out.println(file.getName());

    }
}
