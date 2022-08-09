package com.xkcoding.orm.mybatis.aspectj;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 用户aop 主要看下接口类型的代理类实现 以及责任链模式
 */
@Aspect
@Component
@Slf4j
public class UserAop {
    /**
     * 切入点
     */
    @Pointcut("execution(public * com.xkcoding.orm.mybatis.service.*.*.*(..))")
    public void user() {

    }

    @Before("user()")
    public void before() {
        System.err.println("before .....");
    }

    @After("user()")
    public void after() {
        System.err.println("after .....");
    }

    @AfterReturning("user()")
    public void afterReturning() {
        System.err.println("afterReturning .....");
    }

    @AfterThrowing("user()")
    public void afterThrowing() {
        System.err.println("afterThrowing .....");
    }


    /**
     * 环绕操作
     *
     * @param point 切入点
     * @return 原方法返回值
     * @throws Throwable 异常信息
     */
    @Around("user()")
    public void aroundLog(ProceedingJoinPoint point) throws Throwable {

        System.err.println("around before .....");
        point.proceed();
        System.err.println("around after .....");
    }


}
