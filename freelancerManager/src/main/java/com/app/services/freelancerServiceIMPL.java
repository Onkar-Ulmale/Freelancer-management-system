package com.app.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.CustomException.CustomException;
import com.app.dto.freelancerAddDTO;
import com.app.entity.freelancer;
import com.app.repository.freelancerRepo;


@Service
@Transactional
public class freelancerServiceIMPL implements freelancerService{

	@Autowired
	public freelancerRepo freelancerRepository;
	@Override
	public boolean AddFreelancer(freelancerAddDTO freelancerDTO) throws CustomException {
		try {
			
			freelancer newFreelancer=new freelancer(freelancerDTO.getName(),freelancerDTO.getPhonenumber(),freelancerDTO.getEmail(),freelancerDTO.getPassword());
			freelancerRepository.save(newFreelancer);
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
	
	public freelancerAddDTO findByEmailId(String email) {
		//String name, String phonenumber, String email, String password
		Optional<freelancer> enteredFreelancer=freelancerRepository.findByEmail(email);
		freelancer newFreelancer=enteredFreelancer.get();
		freelancerAddDTO newFreelancerDTO=new freelancerAddDTO(newFreelancer.getName(),newFreelancer.getPhonenumber(),newFreelancer.getEmail(),newFreelancer.getPassword());
		
		return newFreelancerDTO;
		}

}
