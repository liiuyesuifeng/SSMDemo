package com.cat.test.aop.show.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {
    @Pointcut("execution(* com.cat.test.aop.show.Performance.perform(..))")
    public void performance(){}
    /**
     * 方法调用之前
     */
//    @Before("execution(* com.cat.test.aop.show.Performance.perform(..))")
    @Before("performance()")
    public void silenceCellPhone(){
        System.out.println("关闭手机");
    }

    /**
     * 方法调用之前
     */
    @Before("execution(* com.cat.test.aop.show.Performance.perform(..))")
    public void takeSeats(){
        System.out.println("就做");
    }

    /**
     * 执行成功之后
     */
    @AfterReturning("execution(* com.cat.test.aop.show.Performance.perform(..))")
    public void applause(){
        System.out.println("成功");
    }

    /**
     * 出现异常之后
     */
    @AfterThrowing("execution(* com.cat.test.aop.show.Performance.perform(..))")
    public void demanRefund(){
        System.out.println("失败");
    }

    @Around("performance()")
    public void aroundPerForMance(ProceedingJoinPoint joinPoint){
        try{
            System.out.println("1");
            System.out.println("2");
            /**
             * 通知切点方法执行
             */
            joinPoint.proceed();
            System.out.println("3");
        }catch (Throwable te){
            System.out.println("4");
        }

    }
}
