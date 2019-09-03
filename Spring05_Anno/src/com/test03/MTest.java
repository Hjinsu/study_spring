package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext f = new ClassPathXmlApplicationContext("com/test03/a.xml");
		
		TV tv = f.getBean("samsung",TV.class);
		
		tv.powerOn();
		tv.powerDown();
		tv.volumeUp();
		tv.volumeDown();
	}
}
