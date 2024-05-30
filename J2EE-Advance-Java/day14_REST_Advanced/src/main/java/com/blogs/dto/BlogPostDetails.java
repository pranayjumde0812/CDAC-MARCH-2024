package com.blogs.dto;

import java.time.LocalDate;

public class BlogPostDetails {
	private String title;
	private String desc;
	private LocalDate updationDate;
	private String bloggerName;
	private String categoryName;
	public BlogPostDetails() {
		// TODO Auto-generated constructor stub
	}
	public BlogPostDetails(String title, String desc, LocalDate updationDate, String bloggerName, String categoryName) {
		super();
		this.title = title;
		this.desc = desc;
		this.updationDate = updationDate;
		this.bloggerName = bloggerName;
		this.categoryName = categoryName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public LocalDate getUpdationDate() {
		return updationDate;
	}
	public void setUpdationDate(LocalDate updationDate) {
		this.updationDate = updationDate;
	}
	public String getBloggerName() {
		return bloggerName;
	}
	public void setBloggerName(String bloggerName) {
		this.bloggerName = bloggerName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "BlogPostDetails [title=" + title + ", desc=" + desc + ", updationDate=" + updationDate
				+ ", bloggerName=" + bloggerName + ", categoryName=" + categoryName + "]";
	}
	
}
