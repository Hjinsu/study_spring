package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext b = new ClassPathXmlApplicationContext("com/test01/b.xml");
		
		AbstractTest b2 = b.getBean("singleton", AbstractTest.class);
		
		System.out.println(b2.dayInfo());
	}
}
/*
 * 싱글톤 레지스트리
 * 스프링이 직저 싱글톤 형태의 오브젝트를 만들고 관리하는 기능을 제공
 * (스프링 빈 오브젝트는 내부적으로 싱글톤 레지스트리를 만들어서 연동)
 * 
 */