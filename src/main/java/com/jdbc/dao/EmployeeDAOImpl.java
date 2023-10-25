package com.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.jdbc.entities.Employee;

@Component("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Employee employee) {
		String query = "insert into employee(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, employee.getId(), employee.getName(), employee.getCity());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
