package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.CustomException.CustomException;
import com.app.dto.reviewAddDTO;
import com.app.entity.reviews;
import com.app.services.reviewServise;

@RestController
@RequestMapping("/review")
public class reviewController {
	
	@Autowired
	public reviewServise reviewServiece;
	
	
	@PostMapping("/addReview")
	public boolean addNewReview(@RequestBody reviewAddDTO reviewDTO ) throws CustomException
	{
		return reviewServiece.addReview(reviewDTO);
	}

	@PostMapping("/findByFreelancerId/{Id}")
	public List<reviews> getByFreelancerID(@PathVariable Long Id) throws CustomException
	{
		return reviewServiece.findReviewsByFreelancerId(Id);
	}
}
