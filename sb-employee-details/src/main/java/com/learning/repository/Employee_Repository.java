package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entity.Employee1;

public interface Employee_Repository extends JpaRepository<Employee1, Integer> {

}
