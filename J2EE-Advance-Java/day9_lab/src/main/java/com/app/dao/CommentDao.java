package com.app.dao;

import com.app.entities.Comment;

public interface CommentDao {
//post new comment
	String postNewComment(Comment newComment, Long commenterId, Long postId);
}
