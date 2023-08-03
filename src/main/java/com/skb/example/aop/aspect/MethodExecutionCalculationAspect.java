package com.skb.example.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MethodExecutionCalculationAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* com.skb.example.aop.service.*.*(..))")
    public void beforeExecutionOfMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        // advice
        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("{} taken time {}" , joinPoint, timeTaken);
    }
}
