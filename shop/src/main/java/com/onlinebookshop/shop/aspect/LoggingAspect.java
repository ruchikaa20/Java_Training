package com.onlinebookshop.shop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect        //tells this is speing aspect
@Component     //register this aspect as a spring bean

public class LoggingAspect {
	
	    //service package -> services
	    //before the methods are called 
		//print any logging statement
	
	    // (* -> tells any return type
		// service.* -> any class inside the service package
		// .*(..)) -> any method inside the class, (..) -> any parameters
	
	@Before("execution(* com.onlinebookshop.shop.service.*.*(..)) ")
	public void beforeServicemethod() {
		System.out.println("-------Logging from aspect : before method called in service layer--------");
	}
	
	@After("execution(* com.onlinebookshop.shop.service.*.*(..)) ")
	public void afterServicemethod() {
		System.out.println("-------Logging from aspect : after method called in service layer--------");
	}
	
	@Around("execution(* com.onlinebookshop.shop.service.*.*(..)) ")
	public Object aroundServicemethod(ProceedingJoinPoint joinPoint) throws Throwable {
		
		long startTime = System.currentTimeMillis();
		Object result = joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println("-------Logging : method execution time "+joinPoint.getSignature().getName()+ "executed in : " +(endTime-startTime));
		return result;
	}
	
	@AfterReturning("execution(* com.onlinebookshop.shop.service.*.*(..)) ")
	public void afterReturningServicemethod() {
		System.out.println("-------Logging from aspect : after returning method called in service layer--------");
	}
	
	
	@AfterThrowing("execution(* com.onlinebookshop.shop.service.*.*(..)) ")
	public void afterThrowingServicemethod() {
		System.out.println("-------Logging from aspect : after throwing method called in service layer--------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
