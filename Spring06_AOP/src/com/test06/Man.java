package com.test06;

import org.springframework.stereotype.Component;

@Component("man")
public class Man implements Person {

	@Override
	public void classWork() {
		System.out.println("gg");
	}

}
