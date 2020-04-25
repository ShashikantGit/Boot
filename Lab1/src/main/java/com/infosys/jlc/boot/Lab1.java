package com.infosys.jlc.boot;

import java.util.List;
import org.springframework.context.annotation.*;

/*
* @Author : Srinivas Dande
* @company : Java Learning Center
* */
public class Lab1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("custDAO");
		// 1. addCustomer
		Customer cust1 = new Customer(104, "sd", "sd@jlc", 9999, "Blore");
		cdao.addCustomer(cust1);
		// 2. getAllCustomers
		System.out.println("getAllCustomers");
		List<Customer> list = cdao.getAllCustomers();
		list.forEach(cust -> System.out.println(cust));
	}
}