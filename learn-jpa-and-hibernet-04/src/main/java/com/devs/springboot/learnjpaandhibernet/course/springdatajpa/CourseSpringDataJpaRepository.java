package com.devs.springboot.learnjpaandhibernet.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devs.springboot.learnjpaandhibernet.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

	public List<Course> findByAuthor(String author);
	
	public List<Course> findByName(String name);
}
