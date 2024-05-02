package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.dto.Operation;
import com.learning.service.MathOperationService;

@RestController
public class UserInputController {

	@Autowired
	MathOperationService service;
	
	// Accept 2 number and math operation (add/sub/div/mul)
	// http://localhost:8080/get-by-request-param?n1=110&n2=20&option=div
	@GetMapping ("/get-by-request-param")
	public String getByRequestParameter(@RequestParam("n1") double num1,
			@RequestParam("n2") double num2,
			@RequestParam("option") String operation) {
		
		
		return service.operation(num1, num2, operation );
	}
	
	// http://localhost:8080/get-by-path-variable/10/20/div
	@GetMapping("/get-by-path-variable/{n1}/{n2}/{opt}")
	public String getByPathVariable(@PathVariable("n1") double n1,
			@PathVariable("n2")double n2,
			@PathVariable("opt")String option) {
		return service.operation(n1, n2, option);
	}
	
	/*
    {
    	"num1":22,
    	"num2":33,
    	"opt":"add"
    }
    // http://localhost:8080/get-by-json
    */
	@GetMapping("/get-by-json")
	public String getByJson(@RequestBody Operation operation ) {
		return service.operation(operation.getNum1(), operation.getNum2(), operation.getOpt());
	}
	
}
