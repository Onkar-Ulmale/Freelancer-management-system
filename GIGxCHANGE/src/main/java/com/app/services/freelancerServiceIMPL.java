package com.app.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.CustomException.CustomException;
import com.app.entity.freelancer;
import com.app.repository.freelancerRepo;


@Service
@Transactional
public class freelancerServiceIMPL implements freelancerService{

	@Autowired
	public freelancerRepo freelancerRepository;
	@Override
	public boolean AddFreelancer(freelancer freelancer) throws CustomException {
		try {
			freelancerRepository.save(freelancer);
			return true;
		} catch (Exception e) {
			throw new CustomException("Failed to add Freelancer");
		}
	}

	@Override
	public List<freelancer> getAllFreelancers() throws CustomException {
		
		try {
			return freelancerRepository.findAll();
			
		} catch (Exception e) {
			throw new CustomException("Failed to get Freelancer");
		}
		
	}

	@Override
	public boolean UpdateFreelancer(freelancer freelancer) throws CustomException {
		
		Optional<freelancer> enteredFreelancer=freelancerRepository.findById(freelancer.getFreelancer_Id());
		if(enteredFreelancer.isPresent()) {
			freelancer newFreelancer=new freelancer();
			newFreelancer=enteredFreelancer.get();
			newFreelancer.setName(freelancer.getName());
			newFreelancer.setPhonenumber(freelancer.getPhonenumber());
			newFreelancer.setEmail(freelancer.getEmail());
			newFreelancer.setPassword(freelancer.getPassword());
			freelancerRepository.save(newFreelancer);
		}
		return false;
	}

}
