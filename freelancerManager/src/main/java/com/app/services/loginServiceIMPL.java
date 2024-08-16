package com.app.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public client clientLogin(String email,String password)
	{
		Optional<client> enteredClient=clientRepository.findByEmail(email);
		if(enteredClient.isPresent())
		{
			client newClient=enteredClient.get();
			if(newClient.getPassword()==password) {
				return newClient;
			}	
		}
		return null;
	}
	 
	 public freelancer freelancerLogin(String email,String password) {
		 Optional<freelancer> enteredFreelancer=freelancerRepository.findByEmail(email);
		 if(enteredFreelancer.isPresent())
		 {
			 freelancer newFreelancer=enteredFreelancer.get();
			 if(newFreelancer.getPassword()==password)
			 {
				 return newFreelancer;
			 }
		 }
		 return null;
	 }
}
