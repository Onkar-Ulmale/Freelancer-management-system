package com.app.services;

import java.util.List;

import com.app.CustomException.CustomException;
import com.app.entity.reviews;

public interface reviewServise {
	boolean addReview(reviews review)throws CustomException;
	List<reviews> findReviewsByFreelancerId(int freelancerID)throws CustomException;
}
