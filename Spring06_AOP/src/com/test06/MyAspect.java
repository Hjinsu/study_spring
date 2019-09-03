package com.test06;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component("myAspect")
@Aspect
public class MyAspect {
	
	private int a;
	@Pointcut("execution(public * *(..))")
	public void a() {}
	@Before("a()")
	public void before() {
		a++;
		System.out.println("비포" +a);
	}
	@After("a()")
	public void after() {
		++a;
		System.out.println("애프타"+a);
	}
}
