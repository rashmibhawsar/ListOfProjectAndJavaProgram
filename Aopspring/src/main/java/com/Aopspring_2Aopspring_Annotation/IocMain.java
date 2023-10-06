package com.Aopspring_2Aopspring_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocMain {
	public static void main(String[] args) {


		/*
		 * ApplicationContext context=new ClassPathXmlApplicationContext(
		 * "com/Aopspring_2Aopspring_Annotation/config.xml");
		 * 
		 * Employee st=(Employee) context.getBean("emp"); System.out.println(st);
		 * st.setName("rashmi"); st.register(); System.out.println(st);
		 */
 

	// uncomment when ur running annotation using java
	  ApplicationContext context=new
	  AnnotationConfigApplicationContext(EmployeeConfig.class);
	  Employee e =(Employee) context.getBean(Employee.class); 
	  e.setName("rashmi");
	  e.setName("heena");
	  System.out.println(e);
	  e.getName();
	  
	 

	}
}
