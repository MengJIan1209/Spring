package com.meng.service.handle;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {
    //定义方法：表示切面的具体功能
    /*
        前置通知方法的定义：
        1.方法是public
        2.方法是void
        3.方法名称自定义
        4.方法可以有参数，如果有是JoinPoint
          也可以没有
     */

    /*
        @Before:前置通知
        属性：value 切入点表达式，表示切面的位置
              在这个方法时，会同时执行切面的功能
        位置：在切面方法的上面

        特点：
        1.执行时间：在目标方法之前先执行的
        2.不会影响目标方法的执行
        3.不会修改目标方法的执行结果
     */
//    @Before("execution(public void com.meng.service.impl.SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore(){
//        //切面的代码
//        System.out.println("前置通知，切面的功能，在目标方法之前先执行"+new Date());
//    }


//    @Before("execution( void com.meng.service.impl.SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore1(){
//        //切面的代码
//        System.out.println("==前置通知，切面的功能，在目标方法之前先执行=="+new Date());
//    }

    /**
     * 切面类中的通知方法，可以有参数
     * 必须是JoinPoint
     *
     * JoinPoint：表示正在执行的业务方法，相当于反射中的Method
     *   使用要求：必须是参数列表的第一个
     *   作用：获取方法执行时的信息，例如方法名称，方法的参数集合
     */

//    @Before("execution( * *..SomeServiceImpl.do*(..))")
//    public void myBefore2(JoinPoint jp){
//        //获取方法的定义
//        System.out.println("前置通知中，获取目标方法的定义："+jp.getSignature());
//        System.out.println("前置通知中，获取方法的名称："+jp.getSignature().getName());
//        //获取方法执行时参数
//        Object args[] = jp.getArgs();
//        for (Object obj:args){
//            System.out.println("前置通知，获取方法的参数"+obj);
//        }
//
//        String methodName = jp.getSignature().getName();
//        if ("doSome".equals(methodName)){
//            //切面的代码
//            System.out.println("输出日志：===前置通知，切面的功能，在目标方法之前先执行==="+new Date());
//        }else if ("doOther".equals(methodName)){
//            System.out.println("前置通知，作为方法名称，参数的记录");
//        }
//
//
//    }
}
