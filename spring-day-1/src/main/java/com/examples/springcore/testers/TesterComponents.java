package com.examples.springcore.testers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.examples.springcore.components.Person;
import com.examples.springcore.configs.ComponentConfigurations;

public class TesterComponents {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfigApplicationContext context = 
							new AnnotationConfigApplicationContext(ComponentConfigurations.class);
		Person p = context.getBean(Person.class);
		System.out.println(p);

	}

}
