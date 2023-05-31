package com.devs.rest.webservices.restfulwebservices.user;

import org.hibernate.annotations.ForeignKey;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity(name="user_post")
public class Post {

	@EmbeddedId
	private Integer id;
	private String description;
	public Post(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", description=" + description + "]";
	}
}
