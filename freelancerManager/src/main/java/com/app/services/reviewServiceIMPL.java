package com.app.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.CustomException.CustomException;
import com.app.dto.reviewAddDTO;
import com.app.entity.freelancer;
import com.app.entity.reviews;
import com.app.repository.freelancerRepo;
import com.app.repository.reviewsRepo;

@Service
@Transactional
public class reviewServiceIMPL implements reviewServise {
	
	@Autowired
	public reviewsRepo reviewRepository;
	@Autowired
	public freelancerRepo freelancerRepository;

	@Override
	public boolean addReview(reviewAddDTO reviewDTO) throws CustomException {
		try {
			//rating, @NotBlank @NotNull Date date,
			//@NotBlank @NotNull String comment, freelancer freelancer
			Optional<freelancer>  enteredFreelancer=freelancerRepository.findById(reviewDTO.getFreelancerId());
			reviews newReview=new reviews(reviewDTO.getRating(),reviewDTO.getDate(),reviewDTO.getComment(),enteredFreelancer.get());
			reviewRepository.save(newReview);
			return true;
		} catch (Exception e) {
			throw new CustomException("Failed to save the review");
		}
		
	}

	@Override
	public List<reviews> findReviewsByFreelancerId(Long freelancerID) throws CustomException {
		try {
			return reviewRepository.findReviewsByFreelancerId(freelancerID);
		} catch (Exception e) {
			throw new CustomException("Failed to save the review");
		}
		
	}

}
