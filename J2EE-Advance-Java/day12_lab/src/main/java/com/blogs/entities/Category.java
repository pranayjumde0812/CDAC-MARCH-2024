package com.blogs.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	@OneToMany(mappedBy = "chosenCategory",
			cascade = CascadeType.ALL/* ,fetch = FetchType.EAGER */)
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
	
	//Tip - add helper methods to establish a bi asso.
	public void addBlogPost(BlogPost post)
	{
		//add a post ref to the list of posts in category
		posts.add(post);//parent ---> child
		post.setChosenCategory(this);//child --> parent		
	}
	public void removeBlogPost(BlogPost post)
	{
		posts.remove(post);
		post.setChosenCategory(null);
	}
	
	
	@Override
	public String toString() {
		return "Category " + getId() + " [name=" + name + ", description=" + description + "]";
	}

}
