package com.learning.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	@Column(nullable = true, name ="emp_name")
	private String name;
	@Column(name = "emp_emial")
	private String email;
	@Column(name = "emp_dob")
	private LocalDate dob;
	@CreationTimestamp
	private LocalDateTime creation;
	@UpdateTimestamp
	private LocalDateTime updateon;
	@Column(name = "emp_contact", length = 10)
	private String contact;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDateTime getCreation() {
		return creation;
	}
	public void setCreation(LocalDateTime creation) {
		this.creation = creation;
	}
	public LocalDateTime getUpdateon() {
		return updateon;
	}
	public void setUpdateon(LocalDateTime updateon) {
		this.updateon = updateon;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}