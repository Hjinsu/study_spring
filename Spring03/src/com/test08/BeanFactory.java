package com.test08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactory {

	Object getBean(String beanName) {
		ApplicationContext d = new ClassPathXmlApplicationContext("com/test08/v.xml");
		
		if(beanName.equals("samsong"))
			return d.getBean("sam");
		else if(beanName.equals("LZ"))
			return d.getBean("lz");
		else
			return null;
	}
}
