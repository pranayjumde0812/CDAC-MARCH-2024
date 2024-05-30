package com.blogs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogs.dto.ApiResponse;
import com.blogs.dto.BlogPostDTO;
import com.blogs.service.BlogPostService;

@RestController
@RequestMapping("/posts")
public class BlogPostController {
//depcy 
	@Autowired
	private BlogPostService blogPostService;
	/*
	 * For adding a new blog post.
i/p - title , desc , contents , category id ,  author id 
     URL - http://host:port/posts ,
     Method - POST
     payload - blog post dto 
     resp - DTO (api resp : mesg)
	 */
	@PostMapping
	public ApiResponse addNewPost(@RequestBody BlogPostDTO postDTO)
	{
		System.out.println("in add post "+postDTO);
		return blogPostService.createNewBlog(postDTO);
	}
}
