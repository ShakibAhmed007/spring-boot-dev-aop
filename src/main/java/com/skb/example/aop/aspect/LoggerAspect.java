package com.skb.example.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("com.skb.example.aop.aspect.CommonJointPointConfig.serviceLayerExecution()")
    public void beforeExecutionOfMethod(JoinPoint joinPoint){
        // advice
        logger.info("Before execution ===>>>> {}" , joinPoint);
    }

    @After("com.skb.example.aop.aspect.CommonJointPointConfig.serviceLayerExecution()")
    public void afterExecutionOfMethod(JoinPoint joinPoint){
        // advice
        logger.info("After execution ===>>>> {}" , joinPoint);
    }

    @AfterReturning(
            value="com.skb.example.aop.aspect.CommonJointPointConfig.serviceLayerExecution()",
            returning = "result"
    )
    public void afterReturningExecutionOfMethod(JoinPoint joinPoint, Object result){
        // advice
        logger.info("{} executed and returned {}" , joinPoint, result);
    }

    @AfterThrowing(
            value="com.skb.example.aop.aspect.CommonJointPointConfig.serviceLayerExecution()",
            throwing = "exception"
    )
    public void afterThrowingException(JoinPoint joinPoint, Object exception){
        // advice
        logger.info("{} throws exception {}" , joinPoint, exception);
    }

}
