package com.cdac.CoreSpringFirst.SetterDI;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class IocMain {

		public static void main(String[] args) {

			// TODO Auto-generated method stub
	ApplicationContext context=new ClassPathXmlApplicationContext(
			"com/cdac/CoreSpringFirst/SetterDI/Configuration.xml");

	Student st=(Student) context.getBean("stu");
	System.out.println(st);

	Student st3=(Student) context.getBean("stu");
	System.out.println(st);


	Student st1=(Student) context.getBean("stu1");
	System.out.println(st1);

	Student st2=(Student) context.getBean("stu2");
	System.out.println(st2);
		}

	}



