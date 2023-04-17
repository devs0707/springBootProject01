package com.streebo.learningspringframework.examples.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.streebo.learningspringframework.game.GameRunner;

public class XMLConfigurationContextLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(var context = 
				new ClassPathXmlApplicationContext("contextConfiguration.xml")){
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			
			context.getBean(GameRunner.class).run();
		}
	}

}
