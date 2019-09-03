package com.test02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class School {
	@Autowired
	//@Qualifier("lee")
	@Resource(name="hong")
	private Student person;
	private int grade;
	
	public School(Student person, int grade) {
		super();
		this.person = person;
		this.grade = grade;
	}
	
	public School() {
	}
	
	public Student getPerson() {
		return person;
	}
	
	public void setPerson(Student person) {
		this.person = person;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "학생 - " + person + ", 등급 : " + grade;
	}
	
	
}
