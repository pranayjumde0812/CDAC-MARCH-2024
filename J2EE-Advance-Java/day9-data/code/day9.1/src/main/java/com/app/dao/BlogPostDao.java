package com.app.dao;

import com.app.entities.BlogPost;

public interface BlogPostDao {
//add new blog post
	String createNewBlog(BlogPost post, 
			Long categoryId, Long authorId);
}
