package com.blogs.service;

import java.lang.module.ResolutionException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.custom_exceptions.ApiException;
import com.blogs.dto.ApiResponse;
import com.blogs.dto.CommentDTO;
import com.blogs.entities.BlogPost;
import com.blogs.entities.Comment;
import com.blogs.entities.User;
import com.blogs.repository.BlogPostRepository;
import com.blogs.repository.CommentRepository;
import com.blogs.repository.UserRepository;

@Service
@Transactional
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BlogPostRepository blogPostRepository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public ApiResponse addComment(CommentDTO commentDTO) {

		User user = userRepository.findById(commentDTO.getCommenterId())
				.orElseThrow(() -> new ResolutionException("Invalid Commenter"));

		BlogPost blogPost = blogPostRepository.findById(commentDTO.getPostId())
				.orElseThrow(() -> new ResolutionException("Invalid Blogpost Id"));

		if (user.getId() == blogPost.getAuthor().getId())
			throw new ApiException("Owner of Blog can't Comment");

		Comment comment = mapper.map(commentDTO, Comment.class);

		comment.setCommenter(user);
		comment.setPost(blogPost);

		Comment save = commentRepository.save(comment);

		return new ApiResponse("Comment Added Successfully");
	}

}
