package cdac.springmvc.congig;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {
	@Bean("ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setUrl("jdbc:mysql://localhost:3306/Spring");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return ds;
		
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}

}
