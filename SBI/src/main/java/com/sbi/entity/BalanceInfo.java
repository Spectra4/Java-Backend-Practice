package com.sbi.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class BalanceInfo {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int bid;
	@Column(name="Account Balance")
	private int balance;
	@UpdateTimestamp
	private LocalDateTime balance_updateon;
	private Loan loan;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public LocalDateTime getBalance_updateon() {
		return balance_updateon;
	}
	public void setBalance_updateon(LocalDateTime balance_updateon) {
		this.balance_updateon = balance_updateon;
	}
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
}
