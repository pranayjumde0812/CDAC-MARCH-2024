package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Railway;

@Repository
public interface RailwayRepository extends JpaRepository<Railway, Long>{

}
