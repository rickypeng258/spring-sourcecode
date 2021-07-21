package com.pxd.test.demo05.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @description: DemoAspect
 * @author: rickypeng
 * @date: 2021/1/6
 */
@Component
@Aspect
public class DemoAspect {

	@Pointcut("@annotation(com.pxd.test.demo05.annotation.DemoAnnotation)")
	public void pointCut() {}

	@Before(value = "pointCut()", argNames = "joinpoint")
	public void doBefore(JoinPoint joinpoint) {
		System.out.println("==============before===============");
	}

	@After(value = "pointCut()", argNames = "joinpoint")
	public void doAfter(JoinPoint joinpoint) {
		System.out.println("==============after===============");
	}

	@Around("pointCut()")
	public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("==============around-before===============");
		Object obj = joinPoint.proceed(joinPoint.getArgs());
		System.out.println("==============around-after===============");
		return obj;
	}
}
