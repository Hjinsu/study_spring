package com.test01;

public class MessageBeanImpl implements MessageBean{
	private String fruit;
	private int cost;
	
	public MessageBeanImpl() {
		this.fruit = "사과";
		this.cost = 1500;
	}

	
	public MessageBeanImpl(String fruit, int cost) {
		this.fruit = fruit;
		this.cost = cost;
	}

	@Override
	public void sayHello() {
		System.out.println(this.fruit +"의 가격은 " + this.cost +"원 입니다.");
	}
}
