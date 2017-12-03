package com.mkyong;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.mkyong.customer.bo.CustomerBo;
import com.mkyong.customer.model.Customer;

public class CustomerBean implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 5957846325926627154L;

	//DI via Spring
	CustomerBo customerBo;
	
	public String name;
	public String address;
	
	public boolean radio1;
	
	private List<String> user_color;	
	
	public String dbColor;
	
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

	public void setCustomerBo(CustomerBo customerBo) {
		this.customerBo = customerBo;
	}
 
	//get all customer data from database
	public List<Customer> getCustomerList(){
		return customerBo.findAllCustomer();
	}
	
	//add a new customer data into database
	public String addCustomer(){
		Customer cust = new Customer();
		cust.setName(getName());
		cust.setAddress(getAddress());
		cust.setRadio1(radio1);	
		dbColor=list2String(this.user_color);
		cust.setUser_color(dbColor);
		
		customerBo.addCustomer(cust);
		
		
		clearForm();
		
		return "";
	}
	
	
	//delete the table.
	public void deleteCustomer(Customer c){
		customerBo.deleteCustomer(c);
	}
	
	public String list2String(List<String> list) {
		String str = null;
		str = list.toString();
		return str;
		}
	//clear form values
	private void clearForm(){
		setName("");
		setAddress("");
	}

	public boolean isRadio1() {
		return radio1;
	}

	public void setRadio1(boolean radio1) {
		this.radio1 = radio1;
	}



	public List<String> getUser_color() {
		return user_color;
	}

	public void setUser_color(List<String> user_color) {
		this.user_color = user_color;
	}

	public CustomerBo getCustomerBo() {
		return customerBo;
	}

	public String getDbColor() {
		return dbColor;
	}

	public void setDbColor(String dbColor) {
		this.dbColor = dbColor;
	}


	
}
