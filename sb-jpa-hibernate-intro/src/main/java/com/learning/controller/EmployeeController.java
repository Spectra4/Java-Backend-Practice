package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.Employee;
import com.learning.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/save-employee")
	public String saveEmployee(@RequestBody Employee emp) {
		repository.save(emp); // insert or update table record
		return "Employee Save Successfully...!!!";
	}
} 