package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("com/test03/f.xml");

		Person w = a.getBean("woman",Person.class);
		Person m = a.getBean("man",Person.class);
		System.out.println("여학생 출격");
		w.classWork();
		System.out.println("--------");
		System.out.println("남학생 출격");
		m.classWork();
	}
}
