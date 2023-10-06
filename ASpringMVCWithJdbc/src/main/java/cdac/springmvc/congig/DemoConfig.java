package cdac.springmvc.congig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "cdac.springmvc")
@EnableWebMvc
public class DemoConfig {
	@Bean
	public ViewResolver gerViewResolver()


	{
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/view/");
		view.setSuffix(".jsp");
		return view;
		
	}
	

}
