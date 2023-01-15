package com.met.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.met.dao.EmployeeDAO;
import com.met.emp.Employee;

@Service
public class EmployeeServices {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	
	public void save(Employee emp) {
	
		employeeDAO.saveUsingDataSource(emp);
		
	}
	
	public Collection<Employee> getAllEmployees(){
		
		return employeeDAO.getAllEmployees();
	}
}
