package com.upgrade.mvc.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAop {
	
	@Before("execution(public * com.upgrade.mvc.dao.*Dao*.*(..))")
	public void before(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		
		logger.info("===========로거 시작===========");
		Object args[] = join.getArgs();
		
		if(args != null) {
			logger.info("메서드 : " + join.getSignature().getName());
			
			for(int i = 0 ; i < args.length ; i++)
				logger.info(i+"번째 : " + args[i]);
		}
	}
	
	@After("execution(public * com.upgrade.mvc.dao.*Dao*.*(..))")
	public void after(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		logger.info("===========로거 끝===========");
	}
	
	public void afterThrowing(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		
		logger.info("에러 : "+join.getArgs());
		logger.info("에러 : "+join.toString());
	}
}
