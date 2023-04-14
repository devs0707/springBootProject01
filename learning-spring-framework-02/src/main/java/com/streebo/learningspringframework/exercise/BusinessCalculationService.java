package com.streebo.learningspringframework.exercise;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {

	@Autowired
	private DataService dataService;
	
	
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}


	public int findMax() {
		return Arrays.stream(dataService.retiveDate()).max().orElse(0);
	}
}
