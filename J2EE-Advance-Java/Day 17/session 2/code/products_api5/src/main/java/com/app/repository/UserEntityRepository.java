package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.UserEntity;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {
//derived query method
	Optional<UserEntity> findByEmail(String email);
	//derived query metho
	boolean existsByEmail(String email);

}
