package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.learning.dto.*;

@SpringBootApplication
public class SbSiCiBeancreationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbSiCiBeancreationApplication.class, args);
		DbConnection db = ctx.getBean(DbConnection.class);
		db.printDetails();
	}
	@Bean
	public DbConnection getMysqlDbConnObj() {
		DbConnection db = new DbConnection();
		db.setUsername("Mysql-Driver");
		db.setPassword("Mysql-Password");
		db.setUrl("Mysql-URL");
		db.setDriver("Mysql-Driver");
		return db;
	}
	@Primary
	@Bean
	public DbConnection getOracleDbConnObj() {
		DbConnection db = new DbConnection();
		db.setUsername("Oracle-Driver");
		db.setPassword("Oracle-Password");
		db.setUrl("Oracle-URL");
		db.setDriver("Oracle-Driver");
		return db;
		}
}
