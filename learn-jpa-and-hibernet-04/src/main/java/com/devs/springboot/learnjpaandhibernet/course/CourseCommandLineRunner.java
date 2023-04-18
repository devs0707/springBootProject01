package com.devs.springboot.learnjpaandhibernet.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.devs.springboot.learnjpaandhibernet.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRespository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "learn AWS JPA", "devs"));
		repository.save(new Course(2, "learn DevOps JPA", "Abhi"));
		repository.save(new Course(3, "learn SpringBoot JPA", "devs"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		
		System.out.println(repository.findAll());
		System.out.println("Row Counts: "+repository.count());
		
		System.out.println("Find By Author: "+repository.findByAuthor("devs"));
		System.out.println("Find By Author Blank: "+repository.findByAuthor(""));
		
		System.out.println("Find By Course Name: "+repository.findByName("learn DevOps JPA"));
	}

}
