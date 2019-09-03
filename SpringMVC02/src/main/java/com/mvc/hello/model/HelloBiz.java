package com.mvc.hello.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloBiz {

	@Autowired
	private HelloDao dao;
	
	public Object getHello() {
		// TODO Auto-generated method stub
		return "Hello, "+dao.getHello();
	}

}
