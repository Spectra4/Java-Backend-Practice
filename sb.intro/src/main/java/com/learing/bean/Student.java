package com.learing.bean;

import org.springframework.stereotype.Component;

@Component
public class Student {
	public Student() {
		System.out.println("Student Constructor Created.....");
	}
	public void printDetails() {
		System.out.println("Student Details......");
	}
}
