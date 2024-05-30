package com.blogs.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="categories")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "posts")
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
			cascade = CascadeType.ALL ,fetch = FetchType.EAGER )
	//@JsonIgnore //this field will be ignored during both ser n de-ser.
	private List<BlogPost> posts=new ArrayList<>();
	
	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
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
	


}
