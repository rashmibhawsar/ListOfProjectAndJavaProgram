package CoreSpring8_Bean_Init_distroy_annotation;

import javax.naming.spi.InitialContextFactory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Book implements InitializingBean,DisposableBean{

	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}

	public void destroy() throws Exception {
		System.out.println(" book class destroyed");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("book class is created");
		
	}
	
	

}
