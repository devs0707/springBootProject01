package com.streebo.learningspringframework.exercise;

import org.springframework.stereotype.Component;

@Component
public class MySQLDbDataService implements DataService{

	@Override
	public int[] retiveDate() {
		System.out.println("Jump");
		return new int[] { 1, 2, 3, 4, 5 };
	}
	
	public void up() {
		System.out.println("Up");
	}
	
	public void down() {
		System.out.println("Down");
	}
	
	public void left() {
		System.out.println("Left");
	}
	
	public void right() {
		System.out.println("Right");
	}
}
