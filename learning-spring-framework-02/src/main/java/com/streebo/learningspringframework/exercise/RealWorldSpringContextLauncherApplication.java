package com.streebo.learningspringframework.exercise;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.streebo.learningspringframework.game.GamingConsole;

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(RealWorldSpringContextLauncherApplication.class)){
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}

}
