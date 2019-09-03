package com.test01;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Date;

public class Foo {
	Bar bar;
	
	public Foo() {
		System.out.println("Foo 객체 생성");
	}

	public Foo(Date date) {
		System.out.println("Foo(date) 객체 생성" + date);
	}

	public void setBar(Bar bar) {
		this.bar = bar;
		System.out.println("setBar() 호출");
	}
	
	public void setDate(Date date) {
		System.out.println("setDate() 호출 : " + date);
	}
	
	public void setNum(float num) {
		System.out.println("setNum() 호출 : " + num);
	}
	
	public void setStudent(String [] student) {
		System.out.print("setStudent() 호출 : ");
		
		for(String person : student) {
			if(person.equals("임성"))
				System.out.println(person);
			else
				System.out.print(person + ", ");
		}
	}
	
	public void setInfo(List<String> item) {
		System.out.print("setInfo() 호출 : ");
		
		for(String person : item) {
			if(person.equals("겨울"))
				System.out.println(person);
			else
				System.out.print(person + ", ");
		}
	}
	
	public void setSeason(Map<String,String> season) {
		System.out.print("setSeason() 호출 : ");
		Set<String> keys = season.keySet();
		
		for(String key : keys) {
			if(season.get(key).equals("겨울"))
				System.out.println(key + "의 계절 " + season.get(key));
			else
				System.out.print(key + "의 계절 " + season.get(key) +", ");
		}
	}
	
	public void setScore(List<Score> score) {
		System.out.println("setScore() 호출");
		
		for(Score sc : score) {
			System.out.println(sc);
		}
	}
}
