package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.CustomException.CustomException;
import com.app.entity.reviews;
import com.app.repository.reviewsRepo;

@Service
@Transactional
public class reviewServiceIMPL implements reviewServise {
	
	@Autowired
	public reviewsRepo reviewRepository;

	@Override
	public boolean addReview(reviews review) throws CustomException {
		try {
			reviewRepository.save(review);
			return true;
			
		} catch (Exception e) {
			throw new CustomException("Failed to save the review");
		}
		
	}

	@Override
	public List<reviews> findReviewsByFreelancerId(int freelancerID) throws CustomException {
		try {
			return reviewRepository.findReviewsByFreelancerId(freelancerID);
		} catch (Exception e) {
			throw new CustomException("Failed to save the review");
		}
		
	}

}
