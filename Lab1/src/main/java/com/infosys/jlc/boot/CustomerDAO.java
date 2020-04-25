package com.infosys.jlc.boot;

import java.util.List;

/*
* @Author : Srinivas Dande
* @company : Java Learning Center
* */
public interface CustomerDAO {
	public void addCustomer(Customer cust);

	public List<Customer> getAllCustomers();
}