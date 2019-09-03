package com.test02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		Object returnVal = null;
		
		System.out.println("출첵");
		
		try {
			returnVal = invocation.proceed(); //cc(target)
		} catch (Exception e) {
			System.out.println("쉬는 날");
		}finally {
			System.out.println("집");
		}
		return returnVal;
	}

}
