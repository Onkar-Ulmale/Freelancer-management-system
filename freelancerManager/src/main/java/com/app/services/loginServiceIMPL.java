package com.app.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.clientAddDTO;
import com.app.dto.freelancerAddDTO;
import com.app.entity.client;
import com.app.entity.freelancer;
import com.app.repository.clientRepo;
import com.app.repository.freelancerRepo;

@Service
@Transactional
public class loginServiceIMPL implements loginService {
	@Autowired
	public clientRepo clientRepository;
	@Autowired
	public freelancerRepo freelancerRepository;
	
	
	public loginServiceIMPL(clientRepo clientRepository, freelancerRepo freelancerRepository) {
		super();
		this.clientRepository = clientRepository;
		this.freelancerRepository = freelancerRepository;
	}

	public clientAddDTO clientLogin(String email,String password)
	{
		Optional<client> enteredClient=clientRepository.findByEmail(email);
			client newClient=new client();
					newClient=enteredClient.get();	
			if(newClient.getPassword().equals(password)) {
				clientAddDTO newClientDTO=new clientAddDTO(newClient.getName(),newClient.getPhonenumber(),newClient.getEmail(),newClient.getPassword());
				return newClientDTO;
			}	
		return null;
	}
	 
	 public freelancerAddDTO freelancerLogin(String email,String password) {
		 Optional<freelancer> enteredFreelancer=freelancerRepository.findByEmail(email);
			 freelancer newFreelancer=enteredFreelancer.get();
			 if(newFreelancer.getPassword().equals(password))
			 {
				 //String name, String phonenumber, String email, String password
				 freelancerAddDTO newFreelancerDTO = new freelancerAddDTO(newFreelancer.getName(),newFreelancer.getPhonenumber(),newFreelancer.getEmail(),newFreelancer.getPassword());
				 return newFreelancerDTO;
			 }
		 
		 return null;
	 }
}
