package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext beans = new ClassPathXmlApplicationContext("com/test02/beans.xml");
		
		JobAddress hong = beans.getBean("hongjob", JobAddress.class);
		System.out.println(hong);
		
		hong = beans.getBean("leejob", JobAddress.class);
		System.out.println(hong);
		hong = beans.getBean("kimjob", JobAddress.class);
		System.out.println(hong);
	}
}
