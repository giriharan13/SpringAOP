package com.giriharan.Project1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.giriharan.Project1.model.Triangle;

@Aspect
public class TestingAspect2 {
	
	@Before("allTriangleMethods()")
	public void firstAdvice(JoinPoint joinPoint) {
		// JoinPoint can be used to identify the class whose method was called before or after the advice method was called
		// It contains the info about the method
		System.out.println(joinPoint.toString());
		Triangle triangle = (Triangle) joinPoint.getTarget();
	}
	
	//What if we want to get the arguments of the method being called?
	@Before("args(String)")
	public void secondAdvice(String arg) {
		System.out.println("A method with a single String argument has been called");
		System.out.println("arg:"+arg);
	}
	
	@Pointcut("within(com.giriharan.Project1.model.Triangle)")
	public void allTriangleMethods() {}
}
