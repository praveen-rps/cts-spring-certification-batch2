package com.examples.springcore.components;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
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
	

}
