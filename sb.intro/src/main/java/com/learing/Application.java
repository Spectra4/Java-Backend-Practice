package com.learing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learing.bean.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
//		Student S = new Student();
//		S.printDetails();
		Student st = ctx.getBean(Student.class);
		st.printDetails();
	}

}
