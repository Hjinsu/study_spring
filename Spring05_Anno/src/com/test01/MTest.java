package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext f = new ClassPathXmlApplicationContext("com/test01/v.xml");
		
		MyNickName a = f.getBean("name",MyNickName.class);
		
		System.out.println(a);
		
		((ClassPathXmlApplicationContext)f).close();
	}
}	
