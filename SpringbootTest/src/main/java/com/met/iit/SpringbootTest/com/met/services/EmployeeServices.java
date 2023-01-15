package com.met.iit.SpringbootTest.com.met.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.met.iit.SpringbootTest.com.met.dao.EmployeeDAO;
import com.met.iit.SpringbootTest.com.met.emp.Employee;



@Service
public class EmployeeServices {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	
//	public void save(com.met.iit.SpringbootTest.com.met.emp.Employee emp) {
//	
//		employeeDAO.saveUsingDataSource(emp);
//		
//	}
	
	public Collection<com.met.iit.SpringbootTest.com.met.emp.Employee> getAllEmployees(){
		
		return employeeDAO.getAllEmployees();
	}
	
	public Employee getEmployee(int id) {
		return employeeDAO.getEmployee(id);
	}
	
}
