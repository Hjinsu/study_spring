package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTetst {
	public static void main(String[] args) {
		
		
		ApplicationContext a = new ClassPathXmlApplicationContext("com/test05/x.xml");
		
		Person w = a.getBean("woman", Person.class);
		Person m = a.getBean("man", Person.class);
		
		w.classWork();
		m.classWork();
	}
}
