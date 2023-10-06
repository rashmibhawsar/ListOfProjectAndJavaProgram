package CoreSpring7AutoWiring_annotation;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import CoreSpring6AutoWiring.Course;

	public class IocMain {

		public static void main(String[] args) {



	ApplicationContext context=new ClassPathXmlApplicationContext("CoreSpring7AutoWiring_annotation/AutoWiringconfig.xml");
	Coursenew d = (Coursenew)context.getBean("course1"); 
	System.out.println(d);
	
	
	}

}
