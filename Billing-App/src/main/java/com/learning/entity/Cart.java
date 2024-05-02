package com.learning.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {

	@Id
	private int cart_id;
	private String name;
	private double price;
	private double quantity;
	private String total;
	
	@JoinColumn
	@OneToOne(mappedBy = "cart")
	@JsonManagedReference
	private billingDetails billingdetails;
	
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public billingDetails getBillingdetails() {
		return billingdetails;
	}
	public void setBillingdetails(billingDetails billingdetails) {
		this.billingdetails = billingdetails;
	}
}
