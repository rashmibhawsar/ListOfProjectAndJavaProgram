package CoreSpring5JAVADI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocMain {

	public static void main(String[] args) {


ApplicationContext context = new AnnotationConfigApplicationContext(DriverConfig.class);
Driver d = context.getBean(Driver.class); //DIRECT FM CLASS
System.out.println(d);

Driver d1 = (Driver)context.getBean("db2"); //DIRECT FM CLASS
System.out.println(d1);
	}

}
