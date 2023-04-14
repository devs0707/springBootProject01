package com.streebo.learningspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguraion {

	@Bean
	public String name() {
		return "Dev";
	}
	
	@Bean
	public int age() {
		return 22;
	}
	
	@Bean
	public Person person() {
		return new Person("Abhi",20, new Address("Ramji Streets", "India"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(), address()); // use existing name and age
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) { // name, age, address1
		return new Person(name,age, address2); // use existing name and age
	}
	
	//	No qualifying bean of type 'com.streebo.learningspringframework.Address' available:
	//	expected single matching bean but found 2: address1,address2
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) { // name, age, address1
		return new Person(name,age, address); // use existing name and age
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address2qualifier") Address address) { 
		return new Person(name,age, address); 
	}
	
	@Bean (name = "address1")
	@Primary // Set this as a primary address
	public Address address() {
		return new Address("Baker Streets", "London");	
	}
	
	@Bean (name = "address2")
	@Qualifier("address2qualifier")
	public Address address2() {
		return new Address("Shivnagar", "Bhavnagar");	
	}
}
