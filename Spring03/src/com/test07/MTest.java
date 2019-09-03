package com.test07;

import com.test07.BeanFactory;

public class MTest {
	public static void main(String[] args) {
		BeanFactory f = new BeanFactory();
		
		TV tv = (TV)f.getBean("samsong");
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}
