package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext m = new ClassPathXmlApplicationContext("com/test02/v.xml");
		
		BirthDto d = m.getBean("a",BirthDto.class);
		System.out.println(d);
		d = m.getBean("b",BirthDto.class);
		System.out.println(d);
	}
}
