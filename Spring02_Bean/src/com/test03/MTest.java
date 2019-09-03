package com.test03;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext b = new ClassPathXmlApplicationContext("com/test03/beans.xml");
		
		UserService s = b.getBean("service",UserService.class);
		
		UserDto dto = b.getBean("dto", UserDto.class);
		
		//dto.setMyDate(Date);
		
		s.addUser(dto);
	}
}
