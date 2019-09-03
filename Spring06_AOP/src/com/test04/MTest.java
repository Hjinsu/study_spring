package com.test04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("com/test04/vff.xml");

		Person w = a.getBean("woman", Person.class);
		Person m = a.getBean("man", Person.class);
		
		w.classWork();
		m.classWork();
	}
}
