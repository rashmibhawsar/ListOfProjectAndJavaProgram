package CoreSpring8_Bean_Init_distroy_annotation;

	import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import CoreSpring7AutoWiring_annotation.Coursenew;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import CoreSpring7AutoWiring_annotation.Coursenew;

public class IocMain {

	public static void main(String[] args) {


AbstractApplicationContext context=new ClassPathXmlApplicationContext("CoreSpring8_Bean_Init_distroy_annotation/AutoWiringconfig.xml");
Book d = (Book)context.getBean("book1"); 
System.out.println(d);
//to shutdown manually , which is declared in abstract applicationcontext
context.registerShutdownHook();//object is finished ie bean is destroyed after executing destroy method is called
Book d1 = (Book)context.getBean("book1");// even thow u call bean stm later after shutdown stm.. still ur bean life cylce will run accourding ie, last shut down
System.out.println(d1);
Mango m1 = (Mango)context.getBean("mango1");// even thow u call bean stm later after shutdown stm.. still ur bean life cylce will run accourding ie, last shut down
System.out.println(d1);
	}
}
