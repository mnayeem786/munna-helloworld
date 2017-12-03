package com.mkyong.customer.model;

import java.util.Date;
import java.util.List;

public class Customer{
	
	public long customerId;
	public String name;
	public String address;
	public Date createdDate;
	
	private String user_color;
	
	public boolean radio1;
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public boolean isRadio1() {
		return radio1;
	}
	public void setRadio1(boolean radio1) {
		this.radio1 = radio1;
	}
	public String getUser_color() {
		return user_color;
	}
	public void setUser_color(String user_color) {
		this.user_color = user_color;
	}

	
}