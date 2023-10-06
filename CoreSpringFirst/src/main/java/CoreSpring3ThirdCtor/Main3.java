package CoreSpring3ThirdCtor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("CoreSpring3ThirdCtor/config3.xml");
	Employee e = (Employee)context.getBean("emp1");
	System.out.println(e);
	//Product p = context.getBean("p");
	//p.result():

	}

}
