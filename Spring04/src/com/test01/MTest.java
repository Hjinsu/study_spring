package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("com/test01/b.xml");
		
		Bar bar = a.getBean("bar",Bar.class);
		
		bar.pr();
		
		Foo foo = a.getBean("foo", Foo.class);
		
	}
}
