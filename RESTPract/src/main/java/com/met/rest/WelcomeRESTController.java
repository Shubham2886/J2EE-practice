package com.met.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeRESTController {

	@GetMapping
	public ResponseEntity<String> welcome(){
		
		return new ResponseEntity<String>("Welcome to Spring REST Services",HttpStatus.OK);
	}
	
	
	
}
