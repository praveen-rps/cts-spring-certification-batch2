package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.ProductServiceImpl;

@SpringBootApplication
public class SpringDay3AopExampleApplication implements CommandLineRunner{
	
	@Autowired
	ProductServiceImpl service;

	public static void main(String[] args) {
		SpringApplication.run(SpringDay3AopExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
		service.placeOrder();
		service.placeShipment();
		service.payment();
		service.getAddress();
		}
		catch(Exception e) {
			
		}
		
	}

}
