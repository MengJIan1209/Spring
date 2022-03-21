package com.meng.spring;

import com.meng.spring.dao.UserDAO;
import com.meng.spring.pojo.SysUser;
import com.meng.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

    @Test
    public void test1(){
        String config = "config/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        UserService service = (UserService) context.getBean("userService");
//        SysUser user = new SysUser();
//        user.setAge(23);
//        user.setName("大咪咪");
//        service.addUser(user);

        UserDAO dao = (UserDAO) context.getBean("mysqlDao");
        dao.insertUser(null);

    }


}
