package com.sky.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect {
	@Before("execution(* com.sky.constroller.*.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("----------before----------");
		System.out.println(joinPoint.getSignature().getName());
	}
}
