package com.blogs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.blogs.dto.BlogPostDetails;
import com.blogs.entities.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
	@Query("select new com.blogs.dto.BlogPostDetails(b.title,b.description,b.updatedOn,b.author.firstName,b.chosenCategory.name"
			+ ") from BlogPost b")
	List<BlogPostDetails> getBlogRequiredDetails();

}
