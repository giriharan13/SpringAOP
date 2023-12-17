package com.giriharan.Project1.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestingAspect {
	
	@Before("allGetters()")
	public void firstAdvice() {
		System.out.println("first Advice called!");
	}
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("second Advice called!");
	}
	
	@Before("allTriangleMethods()")
	public void thirdAdvice() {
		System.out.println("third Advice called!");
	}
	
	//Combined Pointcut expressions
	//@Before("allGetters() && allTriangleMethods()") it executes if both true
	@Before("allGetters() || allTriangleMethods()") // it executes if any one is true
	public void combinedAdvice() {
		System.out.println("Combined!");
	}
	
	@Pointcut("execution(public * get*())")
	public void allGetters() {}
	
	
	//What if you want a pointcut which configures the advices to run before all the methods of a class?
	//@Pointcut("execution(* com.giriharan.Project1.model.Triangle.*(..))")  -> You can do this but there is an another way
	@Pointcut("within(com.giriharan.Project1.model.Triangle)") // it is more readable than the previous one
	public void allTriangleMethods() {}
	
	
	//@Pointcut(args()) -> runs the advices on the methods that have matched the arguments specified

}
