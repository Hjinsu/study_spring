package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext p = new ClassPathXmlApplicationContext("com/test03/v.xml");
		
		MyFoodMgr f = p.getBean("myFood", MyFoodMgr.class);
		
		System.out.println(f);
	}
}
