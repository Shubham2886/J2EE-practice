package com.met.iit.SpringbootTest.com.met.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.met.iit.SpringbootTest.com.met.emp.Employee;
import com.met.iit.SpringbootTest.com.met.services.EmployeeServices;
@CrossOrigin
@RestController
@RequestMapping("/emp")
public class RESTController {

	@Autowired
	private EmployeeServices employeeServices;
	
	@RequestMapping(produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Employee>> getAllEmps(){
		
		Collection<Employee> allEmployees = employeeServices.getAllEmployees();
  		
		return new ResponseEntity<Collection<Employee>>(allEmployees,HttpStatus.OK); 
	}
	
	@RequestMapping(value = "getEmp/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Employee> getEmp(@PathVariable int id){
		
		Employee employee = employeeServices.getEmployee(id);
		
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		
	}
	
	
}
