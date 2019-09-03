package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		
		ApplicationContext a = new ClassPathXmlApplicationContext("com/test06/f.xml");
		
		Developer d = a.getBean("dv", Developer.class);
		Engineer e = a.getBean("en", Engineer.class);
		
		System.out.println(d);
		System.out.println(e);
	}
}	
