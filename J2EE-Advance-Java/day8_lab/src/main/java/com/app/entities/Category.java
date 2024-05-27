package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Category extends BaseEntity {
	@Column(length = 50,unique = true)
	private String name;
	private String description;
	//for adding Category 1-->* BlogPost
	//Tips - Always init the collection to empty one
	/*
	 * mappedBy -- mandatory in bi dir asso only
	 * where -- appears in the inverse (non owning)
	 * value -- name of the asso. property as it appears 
	 * in the owning side
	 */
	@OneToMany(mappedBy = "chosenCategory")
	private List<BlogPost> posts=new ArrayList<>();

	public Category() {
		// TODO Auto-generated constructor stub
	}
	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	public List<BlogPost> getPosts() {
		return posts;
	}
	public void setPosts(List<BlogPost> posts) {
		this.posts = posts;
	}
	@Override
	public String toString() {
		return "Category " + getId() + " [name=" + name + ", description=" + description + "]";
	}

}
