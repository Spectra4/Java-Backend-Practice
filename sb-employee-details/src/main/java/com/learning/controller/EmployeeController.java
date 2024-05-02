package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.Employee1;
import com.learning.repository.Employee_Repository;

@RestController
public class EmployeeController {

	@Autowired
	private Employee_Repository repo;
	
	@PostMapping("/save-employee")
	public String saveEmployee(@RequestBody Employee1 emp) {
		repo.save(emp);
		return "Employee Save Successfully...";
	}
	
	@GetMapping("/retrive-employee")
	public List<Employee1> getEmployee(){
		return repo.findAll();
	}
}
