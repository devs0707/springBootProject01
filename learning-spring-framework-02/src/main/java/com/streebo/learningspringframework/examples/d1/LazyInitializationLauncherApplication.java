package com.streebo.learningspringframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

@Component
@Lazy
class ClassB{
	ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("Initialization Logic");
		this.classA = classA;
	}
	public void doSomething() {
		System.out.println("Do Something");
	}
	
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(LazyInitializationLauncherApplication.class)){
//			Arrays.stream(context.getBeanDefinitionNames())
//				.forEach(System.out::println);
			System.out.println("Initialization of context is completed");
			context.getBean(ClassB.class).doSomething();
		}
	}

}
