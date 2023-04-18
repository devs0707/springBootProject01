package com.streebo.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"Learn Spring","Streebo"),
				new Course(2,"Learn AWS","Streebo"),
				new Course(3,"Learn Asure","Streebo"),
				new Course(4,"Learn GCP","Streebo")
				);
	}
}
