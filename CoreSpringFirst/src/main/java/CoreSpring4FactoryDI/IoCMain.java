package CoreSpring4FactoryDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCMain {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("CoreSpring4FactoryDI/config.xml");
	Exam e=(Exam) context.getBean("ebd");
	System.out.println(e);


	}

}
