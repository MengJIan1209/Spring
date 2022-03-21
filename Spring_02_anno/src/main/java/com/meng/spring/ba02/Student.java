package com.meng.spring.ba02;

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
                '}';
    }

    public Student() {
        System.out.println("Student的无参构造");
    }
}
