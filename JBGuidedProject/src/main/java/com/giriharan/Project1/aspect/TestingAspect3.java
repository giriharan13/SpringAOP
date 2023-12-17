package com.giriharan.Project1.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestingAspect3 {
	
	@After("args(name)")
	public void firstAdvice(String name) {
		System.out.println("After the method with a single parameter called name gets executed");
	}
	
	/* @AfterReturning(pointcut="execution(* com.giriharan.Project1.model.Circle.setAndReturn*(..))", returning="res")
	public void secondAdvice(String name,String res) // Object res for any type
	{
		System.out.println("After the method with a single String parameter:"+name +" ,and returning a String :"+res);
	} this throws error for some reason */
	
	@AfterThrowing(pointcut="args(name)",throwing = "ex") // Exception ex for any type
	public void thirdAdvice(String name,RuntimeException ex) {
		System.out.println("Exception thrown:"+ex);
	}

}
