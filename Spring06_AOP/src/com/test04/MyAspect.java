package com.test04;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(public * *(..))")
	public void before() {
		System.out.println("학원 카드 찍음");
	}
	@After("execution(public * *(..))")
	public void after() {
		System.out.println("집");
	}
}
