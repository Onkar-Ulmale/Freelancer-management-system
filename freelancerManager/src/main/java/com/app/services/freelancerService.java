package com.app.services;

import java.util.List;

import com.app.CustomException.CustomException;
import com.app.dto.freelancerAddDTO;
import com.app.entity.freelancer;

public interface freelancerService {
	
	public boolean AddFreelancer(freelancerAddDTO freelancerDTO)throws CustomException;
	public List<freelancer> getAllFreelancers()throws CustomException;
	public boolean UpdateFreelancer(freelancer freelancer)throws CustomException;
	public freelancer findByEmailId(String email);
	


}
