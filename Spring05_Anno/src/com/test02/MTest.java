package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("com/test02/a.xml");
		
		School e = a.getBean("school", School.class);
		
		System.out.println(e);
	}
}
