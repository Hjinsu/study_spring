package com.test05;

public class Emp {
	private String name;
	private String salary;
	
	public void setName(String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getSalary() {
		return salary;
	}
	public String toString() {
		return "이름 : " + name + "\t 월급 : " + salary;
				
	}
}
