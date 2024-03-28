package com.sky.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
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
}
