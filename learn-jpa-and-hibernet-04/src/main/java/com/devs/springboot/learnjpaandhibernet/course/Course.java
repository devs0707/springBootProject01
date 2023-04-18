package com.devs.springboot.learnjpaandhibernet.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity (name="Course")	- If table name is different
@Entity 
public class Course {

	@Id		// 	Select as a primary key
	private long id;
	
	// If we our bean attributes is pointing to different column in table then @Column is required otherwise it's fine to not write.
	
//	@Column(name="name")	// If column name is different in table then use name = and give column name
	
	private String name;
	
//	@Column
	private String author;

	public Course() {

	}

	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}
