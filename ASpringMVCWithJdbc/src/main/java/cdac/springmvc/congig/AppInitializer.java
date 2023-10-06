package cdac.springmvc.congig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {

		// TODO Auto-generated method stub
		 return new Class[] {JdbcConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {


		// TODO Auto-generated method stub
		return new Class[] {DemoConfig.class};
	}

	@Override
	protected String[] getServletMappings() {


		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}