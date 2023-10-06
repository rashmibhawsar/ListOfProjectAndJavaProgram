package CoreSpring2CollectionSetterDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.CoreSpringFirst.SetterDI.Student;

public class Main2 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("CoreSpringSecond/config2.xml");
		
		Student2 st=(Student2) context.getBean("stu1");
		System.out.println(st);

	

	}

}
