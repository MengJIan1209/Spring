package com.meng.spring.ba03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//使用value指定对象的名称
@Component(value = "myStudent")
public class Student {

    /**
     * 简单类型赋值：@Value
     * @Value：简单类型属性赋值
     *      属性：value 简单类型属性值
     *      位置： 1.在属性定义的上面，无需set方法，推荐使用
     *             2.在set方法的上面
     */
//    @Value(value = "张三")

    //使用外部属性文件中的数据  语法：@Value(${"key"})
    @Value("${myname}")
    private String name;
    @Value("${myage}")
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    /**
     * 引用类型：
     * @Autowared：spring框架提供的，给引用类型赋值的，使用自动注入原理
     *             支持byName，byType。默认是byType
     *       位置：1.在属性定义的上面，无需set方法，推荐使用
     *             2.在set方法上面
     */
    //默认使用byType：
    @Autowired
    private School school;

    public Student() {
        System.out.println("Student的无参构造");
    }
}
