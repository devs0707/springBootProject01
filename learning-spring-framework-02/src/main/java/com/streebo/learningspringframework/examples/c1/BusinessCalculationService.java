package com.streebo.learningspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Component
@Service
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
