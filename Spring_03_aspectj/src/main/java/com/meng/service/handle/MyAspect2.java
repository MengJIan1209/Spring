package com.meng.service.handle;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect2 {
    //定义方法：表示切面的具体功能
    /*
        环绕通知方法的定义：
        1.方法是public
        2.方法必须有返回值，推荐使用Object类型
        3.方法名称自定义
        4.方法必须有ProceedingJoinPoint参数
     */

    /**
     * @Around:环绕通知
     *      属性：value 切入点表达式
     *      位置：在方法定义的上面
     *
     *   返回值：Object  表示调用目标方法希望得到执行结果(不一定是目标方法自己的返回值)
     *   参数： ProceedingJoinPoint，相当于反射中Method
     *          作用：执行目标方法的，等于method.invoke()
     */
    @Around("execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp){
        System.out.println("执行了环绕通知的myAround方法，");
        return "HelloAround,不是目标方法的执行结果";
    }


}
