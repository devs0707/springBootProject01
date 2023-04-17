package com.streebo.learningspringframework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MongoDbDataService implements DataService{

	@Override
	public int[] retiveDate() {
		System.out.println("Jump");
		return new int[] { 11, 22, 33, 44, 55 };
	}
	
	public void down() {
		System.out.println("Go into a hole");
	}
	
	public void left() {
		System.out.println("Go Back");
	}
	
	public void right() {
		System.out.println("Accelerate");
	}
}
