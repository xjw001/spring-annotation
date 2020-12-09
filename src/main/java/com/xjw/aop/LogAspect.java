package com.xjw.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LogAspect {

    @Pointcut("execution(public int com.xjw.aop.MathCalc.*(..))")
    public void pointCut(){};

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println("【"+joinPoint.getSignature().getName()+"】方法开始");
    }

    @After(value = "pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println("【"+joinPoint.getSignature().getName()+"】方法结束");
    }
    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(JoinPoint joinPoint,Object result){
        System.out.println("【"+joinPoint.getSignature().getName()+"】方法返回值："+ result);
    }
    @AfterThrowing(value = "pointCut()",throwing = "e")
    public void logException(Exception e){
        System.out.println("抛异常了:"+ e);
    }
}
