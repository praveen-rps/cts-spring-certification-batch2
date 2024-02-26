package com.examples.springcore.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.examples.springcore.components.Address;
import com.examples.springcore.components.Person;

@Configuration
@Import({DataConfigurations2.class, DataConfigurations3.class})
public class DataConfigurations {
	
	@Bean("a1")
	public Address createAddress1() {
		return new Address();
	}
	
	@Bean("a2")
	public Address createAddress2() {
		return new Address();
	}
	
	@Bean
	public Person createPerson() {
		return new Person(900,"kishore",createAddress1());
	}

}
