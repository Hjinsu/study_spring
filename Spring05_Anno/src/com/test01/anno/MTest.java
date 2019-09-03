package com.test01.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext f = new ClassPathXmlApplicationContext("com/test01/anno/a.xml");
		
		MyNickName a = f.getBean("myNickName", MyNickName.class);
		
		System.out.println(a);
	}
}
