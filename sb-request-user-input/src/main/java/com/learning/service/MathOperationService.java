package com.learning.service;

import org.springframework.stereotype.Service;

@Service
public class MathOperationService {

	public String operation(double num1, double num2, String opt) {
		String result = "";
		
		switch(opt) {
		case "add":
			result = num1 + "+" + num2 + "=" + (num1+num2);
			break;
			
		case "sub":
			result = num1 + "-" + num2 + "=" + (num1-num2);
			break;
			
		case "div":
			result = num1 + "/" + num2 + "=" + (num1/num2);
			break;
			
		case "mul":
			result = num1 + "*" + num2 + "=" + (num1*num2);
			break;
			
			default :
				result = "Please pass valid operation.....";
		}
		
		return result;
	}
}
