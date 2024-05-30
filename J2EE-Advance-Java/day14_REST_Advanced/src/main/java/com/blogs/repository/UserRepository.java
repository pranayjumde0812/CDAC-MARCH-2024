package com.blogs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogs.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmailAndPassword(String email, String password);
}
