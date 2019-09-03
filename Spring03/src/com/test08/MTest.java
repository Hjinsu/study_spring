package com.test08;

import com.test08.BeanFactory;
import com.test08.TV;

public class MTest {
	public static void main(String[] args) {
		BeanFactory f = new BeanFactory();
		
		TV tv = (TV)f.getBean("LZ");
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}

}
