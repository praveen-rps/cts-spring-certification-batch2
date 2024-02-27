package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl {
	
	public void placeOrder() {
		System.out.println("Order is successfully placed");
	}
	
	public void placeShipment() {
		System.out.println("Order is successfully shipped");
	}
	
	public void payment() {
		System.out.println("Payment is successful");
	}

	public String getAddress() throws Exception {
		 throw new Exception("Exception is thrown");
		//return "Hyderabad";
	}
}
