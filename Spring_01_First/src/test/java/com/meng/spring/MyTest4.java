package com.meng.spring;

import com.meng.spring.ba05.Student;
import com.meng.spring.pojo.SysUser;
import com.meng.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest4 {


    @Test
    public void test(){
        String config = "ba05/applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }


    @Test
    public void testUser(){
        String config = "config/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) context.getBean("userService");
        SysUser user = new SysUser("杨幂",23);
        service.addUser(user);
    }
}
