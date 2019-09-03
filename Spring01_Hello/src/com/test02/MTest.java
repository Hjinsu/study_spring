package com.test02;

public class MTest {
	public static void main(String[] args) {
		MessageBean b = new MessageBeanEn();
		
		b.sayHello("Spring");
		
		b = new MessageBeanKo();
		b.sayHello("스르픵");
	}
}
