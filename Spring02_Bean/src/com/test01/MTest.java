package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		MessageBean apple = (MessageBean)factory.getBean("apple");
		apple.sayHello();
		
		          // (형변환)     자식객체
		apple = (MessageBean)factory.getBean("watermelon");
		apple.sayHello();
		
		apple = (MessageBean)factory.getBean("jadu");
		apple.sayHello();
		
		apple = (MessageBean)factory.getBean("fine");
		apple.sayHello();
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
