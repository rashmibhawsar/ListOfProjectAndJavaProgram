package com.Aopspring_2Aopspring_Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan 
@EnableAspectJAutoProxy
public class EmployeeConfig {
	
@Bean	
public Employee getEmployee()
{
	return new Employee();
}

}
