package com.example.demo.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BussinessAspect {
	
	
	@Pointcut("execution (void com.example.demo.service.ProductServiceImpl.*())")
    public void serviceMethod() {}

	
	//@After("execution (void com.example.demo.service.ProductServiceImpl.*())" )
	@After("serviceMethod()" )
	public void sendMail(JoinPoint joinPoint) {
		System.out.println("email confirmation about product is send");
	//	joinPoint.proceed();
	//	System.out.println("email confirmation about product is send - After order placed");
	}
	
	//@AfterReturning(pointcut = "execution(* com.example.demo.service.ProductServiceImpl.*(..))", returning="address")
	//public void afterReturningAddress(JoinPoint joinPoint, String address) {
	//public void afterThrowingException(JoinPoint joinPoint, String address) {
	@AfterThrowing(pointcut = "execution(* com.example.demo.service.ProductServiceImpl.*(..))", throwing="ex")
	public void afterThrowingException(JoinPoint joinPoint, Exception ex) {
		System.out.println("executing after returning the value from bussiness class");
		System.out.println("The returned exception msg :" +ex.getMessage());
	}

}
