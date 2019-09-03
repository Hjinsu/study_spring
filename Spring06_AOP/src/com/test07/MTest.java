package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		//aop동작 방식 
		ApplicationContext a = new ClassPathXmlApplicationContext("com/test07/x.xml");
		
		MessageBean m = a.getBean("proxy", MessageBean.class);
		
		m.sayHello();
	}
}
