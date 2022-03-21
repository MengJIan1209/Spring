package com.meng.spring;

import com.meng.spring.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {

    //spring创建对象，调用的是类的哪个方法？
    //默认是调用无参构造方法
    @Test
    public void test01(){
        String config = "ba01/applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);
//        SomeService service = context.getBean(SomeService.class);
//        service.doSome();

        SomeService service = (SomeService) context.getBean("someService");
        service.doSome();
    }

    /*
        spring是在什么时候创建的对象？
        创建spring容器对象的时候，会读取配置文件，创建文件中声明的java对象

        优点：
            获取对象的速度快，因为对象已经创建好了
        缺点：
            占用内存
     */
    @Test
    public void test02(){
        String config = "ba01/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        //SomeService service = (SomeService) context.getBean("someService");
        //service.doSome();
    }

    /*
        spring容器创建对象，一次创建几个？
        在创建容器对象(ApplicationContext)时，会把配置文件中的所有对象都创建出来(spring默认规则)
     */
    @Test
    public void test03(){
        String config = "ba01/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        //SomeService service = (SomeService) context.getBean("someService");
        //service.doSome();
    }

    /*
      获取容器中对象的信息
     */
    @Test
    public void test04(){
        String config = "ba01/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        //获取容器中对象的数量
        int nums = context.getBeanDefinitionCount();
        System.out.println(nums);

        //获取容器中对象的名称
        String[] names = context.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    /*
        让spring创建非自定义对象
        有class就能让spring创建对象
     */
    @Test
    public void test05(){
        String config = "ba01/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Date myDate = (Date) context.getBean("myDate");
        System.out.println(myDate);
    }
}
