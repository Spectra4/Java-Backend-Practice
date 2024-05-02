package com.sbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbi.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Integer> {

}
