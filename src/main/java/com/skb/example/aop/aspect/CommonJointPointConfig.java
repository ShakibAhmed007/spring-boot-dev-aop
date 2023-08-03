package com.skb.example.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJointPointConfig {

    @Pointcut("execution(* com.skb.example.aop.service.*.*(..))")
    public void serviceLayerExecution(){}

//    @Pointcut("bean(*dao*")
//    public void beanLayerExecution(){}

    @Pointcut("within(com.skb.example.aop.service.*)")
    public void withinAllExecution(){}
}
