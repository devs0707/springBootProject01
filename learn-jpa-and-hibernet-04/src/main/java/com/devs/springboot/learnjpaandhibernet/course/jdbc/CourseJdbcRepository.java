package com.devs.springboot.learnjpaandhibernet.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.devs.springboot.learnjpaandhibernet.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;

//	private static String INSERT_QUERY = 
//			"""
//				insert into course (id, name, author) 
//				values(1, 'learn Spring', 'dev')
//			""";

	private static String INSERT_QUERY = """
				insert into course (id, name, author)
				values(?, ?, ?)
			""";
	private static String DELETE_QUERY = """
			delete from course where id = ?
			""";

	private static String SELET_QUERY = """
				select * from course where id = ?
			""";

	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);

	}

	public Course findById(long id) {
		// Result set to Bean Mapping => Row Mappers
		return springJdbcTemplate.queryForObject(SELET_QUERY,new BeanPropertyRowMapper<>(Course.class), id);
	}
}
