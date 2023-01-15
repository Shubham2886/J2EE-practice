package com.met.rest;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.met.emp.Employee;
import com.met.services.EmployeeServices;

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
	
	
}
