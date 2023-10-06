package com.Aopspring.Aopspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocMain {
	public static void main(String[] args) {


ApplicationContext context=new ClassPathXmlApplicationContext(
		"com/Aopspring/Aopspring/config.xml");
Account st=(Account) context.getBean("acc1");
System.out.println(st);
st.deposit(1000);
System.out.println(st);
st.withdrawl(2000);
	}
}
