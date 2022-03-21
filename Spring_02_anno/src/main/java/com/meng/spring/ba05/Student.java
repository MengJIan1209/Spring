package com.meng.spring.ba05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


//使用value指定对象的名称
@Component(value = "myStudent")
public class Student {

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
     * @Resource:来自jdk中，给引用类型赋值的，支持byName，byType，默认是byName
     *            spring支持这个注解的使用
     *      位置：1.在属性定义的上面，无需set方法，推荐使用
     *           2.在set方法的上面
     */
    //默认是用byName自动注入
    //先使用byName赋值，如果赋值失败，在使用byType
    //本例是使用byType赋值成功
    @Resource
    private School school;

    public Student() {
        System.out.println("Student的无参构造");
    }
}
