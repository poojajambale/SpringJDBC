package com.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdbc.dao.EmployeeDAO;
import com.jdbc.entities.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmpConfig.class);
		EmployeeDAO empDao = (EmployeeDAO) context.getBean("employeeDao");

		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Pooja");
		emp.setCity("Pune");
		
		int result = empDao.insert(emp);
		System.out.println("Employee inserted "+result);
	}

}
