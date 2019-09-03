package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext f = new ClassPathXmlApplicationContext("com/test05/h.xml");
		
		Developer d = f.getBean("dv",Developer.class);
		System.out.println(d);
		
		Engineer e = f.getBean("en", Engineer.class);
		System.out.println(e);
	}
}
