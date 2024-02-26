package com.examples.springcore.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfigurations3 {
	
	@Bean("db")
	public String getDatabase() {
		return "Orcle database ";
	}

}
