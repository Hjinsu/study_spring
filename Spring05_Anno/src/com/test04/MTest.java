package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		//서비스 객체의 adduser 호출
		ApplicationContext f = new ClassPathXmlApplicationContext("com/test04/a.xml");
		
		UserService u = f.getBean("userService",UserService.class );
		//UserDto u = f.getBean("myUser01", UserDto.class);
		u.addUser();
		
	}
}
