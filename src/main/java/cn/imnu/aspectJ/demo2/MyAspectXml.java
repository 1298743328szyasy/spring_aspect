package cn.imnu.aspectJ.demo2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXml {
    //前置通知
    public void before(JoinPoint joinPoint){
        System.out.println("XML方式的前置通知"+joinPoint);
    }
    public void afterReturning(Object result){
        System.out.println("XML方式的后置通知"+result);
    }
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("XML方式的环绕前置通知");
        Object obj = joinPoint.proceed();
        System.out.println("XML方式的环绕前置通知");
        return obj;
    }
}
