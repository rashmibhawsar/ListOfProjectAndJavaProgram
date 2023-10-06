package com.Aopspring_2Aopspring_Annotation;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	@Before("execution(* com.Aopspring_2Aopspring_Annotation.Employee.set*(..))")
	public void authentication(JoinPoint jp)

	{
		System.out.println("are u trying to do transition(authenication)");
		System.out.println(jp.toString());
		System.out.println(Arrays.toString(jp.getArgs()));
	}
	
	
	@After("setadvice()")
	public void update()


	{
		System.out.println("ur transition is done successfully(update)");
	}
	@Pointcut("execution(* com.Aopspring_2Aopspring_Annotation.Employee.set*(..))")
	private void setadvice()
	{
		
	}
	@Pointcut("execution(* com.Aopspring_2Aopspring_Annotation.Employee.set*(..))")
	private void getadvice()
	{
		
	}
	@Around("getadvice()")
	public void aroundadvice(ProceedingJoinPoint point) {
		System.out.println("currently we are in arround advice");
		System.out.println("this is before call task");
		
		try{
			Object result = point.proceed();
		System.out.println("result received" +result);
		}catch (Throwable e) {
			e.printStackTrace();
		}
		
	}
}
