package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext f = new ClassPathXmlApplicationContext("com/test06/c.xml");

		Person w = f.getBean("woman", Person.class);
		Person m = f.getBean("man", Person.class);
		
		w.classWork();
		m.classWork();
	}
}
