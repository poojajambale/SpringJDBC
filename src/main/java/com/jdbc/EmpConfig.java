package com.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jdbc.dao.EmployeeDAO;
import com.jdbc.dao.EmployeeDAOImpl;

@Configuration
@ComponentScan(basePackages = {"com.jdbc.dao"})
public class EmpConfig {
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Pooja@2207");
		return ds;
	}
	
	@Bean
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
//	@Bean("employeeDao")
//	public EmployeeDAO getEmpDao() {
//		EmployeeDAOImpl emp = new EmployeeDAOImpl();
//		emp.setJdbcTemplate(getTemplate());
//		return emp;
//	}
}
