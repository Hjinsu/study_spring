package com.test07;

public class BeanFactory {
	
	public BeanFactory() {
	}

	Object getBean(String beanName) {
		if(beanName.equals("samsong"))
			return new Samsong();
		else if(beanName.equals("LZ"))
			return new LZ();
		else
			return null;
	}
}
