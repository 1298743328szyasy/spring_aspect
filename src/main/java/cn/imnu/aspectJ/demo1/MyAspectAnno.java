package cn.imnu.aspectJ.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切入点定义
 */
@Aspect
public class MyAspectAnno {
    @Before(value = "mypointcut5()")
    public void before(JoinPoint joinPoint){
        System.out.println("前置通知============="+joinPoint);
    }
    @AfterReturning(value = "mypointcut4()",returning = "sy")
    public void afterReturning(Object sy){
        System.out.println("后置通知============="+sy);
    }
    @Around(value = "mypointcut3()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前通知============");
        Object obj = joinPoint.proceed();
        System.out.println("环绕后通知============");
        return obj;
    }
    @AfterThrowing(value = "mypointcut2()",throwing = "e")
    public void afterThrowing(Throwable e) {
        System.out.println("异常抛出通知===========" + e.getMessage());
    }
    @After(value = "mypointcut1()")
    public void after(){
        System.out.println("最终通知==============");
    }
    @Pointcut(value = "execution(* cn.imnu.aspectJ.demo1.ProductDao.save())")
    public void mypointcut1(){ }
    @Pointcut(value = "execution(* cn.imnu.aspectJ.demo1.ProductDao.findAll())")
    public void mypointcut2(){}
    @Pointcut(value = "execution(* cn.imnu.aspectJ.demo1.ProductDao.update())")
    public void mypointcut3(){}
    @Pointcut(value = "execution(* cn.imnu.aspectJ.demo1.ProductDao.findOne())")
    public  void mypointcut4(){}
    @Pointcut(value = "execution(* cn.imnu.aspectJ.demo1.ProductDao.delete())")
    public void mypointcut5(){}
}
