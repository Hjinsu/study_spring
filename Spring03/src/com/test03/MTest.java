package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext df = new ClassPathXmlApplicationContext("com/test03/gg.xml");
		
		Emp g = df.getBean("you",Developer.class);
		System.out.println(g);
		
		g = df.getBean("kang",Engineer.class);
		System.out.println(g);
		
		((ClassPathXmlApplicationContext)df).close();
	}
}
