package com.test03;

import org.springframework.beans.factory.annotation.Autowired;

public class Food {
	private String name;
	private int price;
	
	@Autowired
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Food() {
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String toString() {
		return "음식 이름 : " + name + ", 가격 : " + price + "원";
	}
	
	
}
