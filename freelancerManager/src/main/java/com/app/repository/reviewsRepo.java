package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entity.reviews;

public interface reviewsRepo extends JpaRepository<reviews, Long>{
	
	@Query("SELECT r FROM reviews r WHERE r.Freelancer.freelancer_Id = :freelancerID")
	List<reviews> findReviewsByFreelancerId(@Param("freelancerID")Long freelancer_ID);

}
