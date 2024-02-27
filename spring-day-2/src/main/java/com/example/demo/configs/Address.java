package com.example.demo.configs;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Address implements InitializingBean, DisposableBean{
	
	int dno;
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + "]";
	}

	String street;
	String city;
	
	public Address() {
		dno=302;
		street="Koramangala";
		city="bangalore";
	}
	

	public Address(int dno, String street, String city) {
		super();
		this.dno = dno;
		this.street = street;
		this.city = city;
		System.out.println("Inside the contructor");
	}


	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	/*
	@PostConstruct
	public void initPhase() {
		System.out.println("After bean is constructed");
	}

	@PreDestroy
	public void destroy1() {
		System.out.println("before object is destroyed");
	}
	*/

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside the after properties set");
		
	}


	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside the destroy method");
		
	}
}
