package com.sbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbi.entity.BalanceInfo;

public interface BalanceInfoRepo extends JpaRepository<BalanceInfo, Integer> {

}
