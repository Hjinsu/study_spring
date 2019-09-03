package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("com/test02/c.xml");
		
		System.out.println("여학생 입장");
		
		Person w = a.getBean("woman",Person.class);
		w.classWork();
		System.out.println("--------");
		System.out.println("남학생 입장");
		Person ㅡ = a.getBean("man",Person.class);
		ㅡ.classWork();
		
	}
}
