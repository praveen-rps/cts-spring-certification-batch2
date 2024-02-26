package com.examples.springcore.testers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.examples.springcore.components.Address;
import com.examples.springcore.components.Person;
import com.examples.springcore.configs.DataConfigurations;
import com.examples.springcore.configs.DataConfigurations2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	ApplicationContext context =
	//			new ClassPathXmlApplicationContext("beans.xml");
		
	//	Address address = (Address) context.getBean("adr2");
	//	System.out.println(address);
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DataConfigurations.class);
		
		
		//Person person = (Person) context.getBean("person");
		Address address = (Address) context.getBean("a2");
		System.out.println(address);
		
		Person person = (Person) context.getBean(Person.class);
		System.out.println(person);
		
		String str1 = (String) context.getBean("driver");
		System.out.println(str1);
		
		String str2 = (String) context.getBean("db");
		System.out.println(str2);

	}

}
