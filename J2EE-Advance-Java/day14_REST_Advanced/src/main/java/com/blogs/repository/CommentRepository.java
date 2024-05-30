package com.blogs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogs.entities.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
