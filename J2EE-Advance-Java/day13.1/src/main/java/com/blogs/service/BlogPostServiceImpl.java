package com.blogs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.dto.BlogPostDetails;
import com.blogs.repository.BlogPostRepository;
@Service
@Transactional
public class BlogPostServiceImpl implements BlogPostService {
	//depcy 
	@Autowired
	private BlogPostRepository blogPostRepository;

	@Override
	public List<BlogPostDetails> getSelectedDetails() {
		// TODO Auto-generated method stub
		return blogPostRepository.getBlogRequiredDetails();
	}

}
