package com.examples.springcore.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfigurations2 {
	
	@Bean("driver")
	public String getDriver() {
		return "mysql Driver is used";
	}

}
