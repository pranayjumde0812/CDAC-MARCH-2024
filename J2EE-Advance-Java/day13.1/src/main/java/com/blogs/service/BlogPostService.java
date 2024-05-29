package com.blogs.service;

import java.util.List;

import com.blogs.dto.BlogPostDetails;

public interface BlogPostService {
//add a method to list all blog selected details
	List<BlogPostDetails> getSelectedDetails();
}
