package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.configs.Address;

@SpringBootApplication
public class SpringDay2Application implements CommandLineRunner{
	
	//@Autowired
	//Environment env;
	
	
	@Autowired
	//DbData dbData;
	Address address;

	public static void main(String[] args) {
		SpringApplication.run(SpringDay2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//	System.out.println(dbData.getUname());
//	System.out.println(dbData.getPassword());
//	System.out.println(dbData.getDriver());
//	System.out.println(dbData.getDbname());
	
		System.out.println(address);
		
	}

}
