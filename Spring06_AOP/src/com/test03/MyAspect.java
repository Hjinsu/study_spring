package com.test03;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	public void before(JoinPoint join) {
		System.out.println("출석");
	}
	
	public void after(JoinPoint join) {
		System.out.println("집");
	}
	
	public void afterThrowing() {
		System.out.println("쉬는 날");
	}
}
