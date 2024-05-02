package com.sbi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.entity.Account;
import com.sbi.repository.AccountRepo;

@RestController
public class AccountController {
	
	@Autowired
	public AccountRepo repo1;
	
	@PostMapping("add-account")
	public String addNewAccount(@RequestBody Account account) {
		return "Account with name " + account.getName() + " added Successfully." ;
	}
}