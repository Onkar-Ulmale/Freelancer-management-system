package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entity.reviews;

public interface reviewsRepo extends JpaRepository<reviews, Integer>{
	
	@Query("SELECT r FROM reviews r WHERE r.freelancer_id = :freelancerID")
	List<reviews> findReviewsByFreelancerId(int freelancer_ID);

}
