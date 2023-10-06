package CoreSpring6AutoWiring;

	import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class IocMain {

		public static void main(String[] args) {

	ApplicationContext context=new ClassPathXmlApplicationContext("CoreSpring6AutoWiring/congig.xml");
	Course d = (Course)context.getBean("course1"); 
	System.out.println(d);
	
	

		}

	

}
