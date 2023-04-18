package com.devs.springboot.learnjpaandhibernet.course.jpa;

import org.springframework.stereotype.Repository;

import com.devs.springboot.learnjpaandhibernet.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional		// To perform DB operation Transactional need to be enabled so use this annotation
public class CourseJpaRespository {

//	@Autowired
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}

}
