package com.app.services;

import java.util.List;

import com.app.CustomException.CustomException;
import com.app.dto.reviewAddDTO;
import com.app.entity.reviews;

public interface reviewServise {
	boolean addReview(reviewAddDTO reviewDTO)throws CustomException;
	List<reviews> findReviewsByFreelancerId(Long freelancerID)throws CustomException;
}
