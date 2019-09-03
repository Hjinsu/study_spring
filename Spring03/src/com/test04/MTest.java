package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext s = new ClassPathXmlApplicationContext("com/test04/f.xml");
		
		Developer d = s.getBean("youe",Developer.class);
		System.out.println(d);
		
		Engineer e = s.getBean("kange",Engineer.class);
		System.out.println(e);
	}
}
