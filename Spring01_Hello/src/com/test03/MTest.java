package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//가져오는 방법
		// 1.Resource res = new FileSystemResource("src/com/test03/beans.xml");
		// 2.Resource res = new ClassPathResource("com/test03/beans.xml");
		// 3.
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/beans.xml");
		//en
		MessageBean bean = (MessageBean)factory.getBean("bean01");
		bean.sayHello("Spring");
		//ko
		bean = (MessageBean)factory.getBean("bean02");
		bean.sayHello("스프링");
		/*
		 * 1.ApplicationContext, ClassPathXmlApplicationContext
		 * 스프링의 ApplicationContext 객체는 스프링 컨테이너의 인스턴스
		 * 스프링은 ApplicationContext 인터페이스의 몇가지 기본적인 구현을 제공합니다.
		 * ClassPathXmlApplicationContext : xml형식의 독립형 어플리케이션에 적합
		 * - 지정된 classpath에서 xml파일을 읽어서 생성
		 * 
		 * 2.contents, contexts, container
		 * content : 기능
		 * context : 기능을 구현하기 위한 정보
		 * container : 담을 객체
		 * 
		 * */
	}
}
