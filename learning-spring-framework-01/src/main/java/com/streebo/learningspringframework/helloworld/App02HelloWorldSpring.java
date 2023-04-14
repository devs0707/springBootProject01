package com.streebo.learningspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1. Launch a Spring Context
		try(var context = 
				new AnnotationConfigApplicationContext
					(HelloWorldConfiguraion.class)){
			
			// 2. Configure the things that we want Spring to manage 
			// HelloWorldConfiguration - @Configuration
			// name - @Bean
			
			// 3. Retrieving Beans managed by Spring 
			System.out.println("Name:" +context.getBean("name"));
			System.out.println("Age:" +context.getBean("age"));
			System.out.println("Person:" +context.getBean("person"));
			System.out.println("Person:" +context.getBean("person2MethodCall"));
			System.out.println("Person:" +context.getBean("person3Parameters"));
			System.out.println("Address:" +context.getBean("address1"));
			
			System.out.println("Person:" +context.getBean(Person.class));
			System.out.println("Address:" +context.getBean(Address.class));
			
			System.out.println("Person5:" +context.getBean("person5Qualifier"));
			//	List out all Beans
//			Arrays.stream(context.getBeanDefinitionNames())
//				.forEach(System.out::println);

		}
		

	}

}
