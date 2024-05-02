package com.sbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbi.entity.Loan;

public interface LoanRepo extends JpaRepository<Loan, Integer> {

}
