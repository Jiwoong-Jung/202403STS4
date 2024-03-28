package com.sky.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect {
	@Before("execution(* com.sky.controller.*.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("----------before----------");
		System.out.println(joinPoint.getSignature().getName());
	}
	
	@After("execution(* com.sky.dao.*.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("----------after----------");
		System.out.println(new SimpleDateFormat("yyyy/MM/dd")
				                                    .format(new Date()));
		System.out.println("메서드명: "+joinPoint.getSignature().getName());
	}
	
	@Around("@within(org.springframework.stereotype.Controller)")
    public Object printCurrentTime(ProceedingJoinPoint pointcut) 
    		                                        throws Throwable {
		System.out.println("==============Around 시작============");
		System.out.println("처리 전");
        System.out.println(System.nanoTime()+" 나노초");
        Object result = pointcut.proceed();
        System.out.println("처리 후");
        System.out.println(System.nanoTime()+" 나노초");
        System.out.println("==============Around 끝=============");
        return result;
    }
}
