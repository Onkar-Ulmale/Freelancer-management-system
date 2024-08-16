package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.freelancer;

public interface freelancerRepo extends JpaRepository<freelancer, Long>{
	
	Optional<freelancer> findByEmail(String email);

}
