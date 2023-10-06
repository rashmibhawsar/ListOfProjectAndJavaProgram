package CoreSpring5JAVADI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DriverConfig {

/* method return bean(driver so return type driver)*/
	@Bean("db2")
	public Driver getDriver()

	{
		Driver d = new Driver();
		d.setName("rashmi");
		d.setPassword("root");
		d.setUsername("localmechine");
		return d;
		

	}
	@Bean
	@Primary
	public Driver getDriver1()

	{
		Driver d = new Driver();
		d.setName("siya");
		d.setPassword("root1");
		d.setUsername("localmc2");
		return d;
		

	}

}
