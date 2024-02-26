package com.examples.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examples.springcoredemo.model.Address;
import com.examples.springcoredemo.model.DbConnections;
import com.examples.springcoredemo.model.Person;

@SpringBootApplication
public class SpringcoredemoApplication implements CommandLineRunner{
	
	//@Autowired
	//@Qualifier("mysql")
	DbConnections dbs; // variable level
	
	
	@Autowired
	public SpringcoredemoApplication(DbConnections dbs) {
		super();
		this.dbs = dbs;
	}
	public SpringcoredemoApplication() {
		
	}
	
	public DbConnections getDbs() {
		return dbs;
	}

	//@Autowired
	public void setDbs(DbConnections dbs) {
		this.dbs = dbs;
	}

	

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Autowired
	Address adr;
	
	@Autowired
	Person person;
	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
		//Address adr = (Address) context.getBean(Address.class);
		//Person p = (Person) context.getBean(Person.class);
		//System.out.println(adr);
		//System.out.println(p);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(adr);
		System.out.println(person);
		System.out.println(dbs.getDatabase());
		System.out.println(dbs.getDriver());
		
	}

	
}
