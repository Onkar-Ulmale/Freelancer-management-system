package com.app.services;

import com.app.entity.client;
import com.app.entity.freelancer;
import com.app.repository.clientRepo;
import com.app.repository.freelancerRepo;

public class loginServiceIMPL implements loginService {
	public clientRepo clientRepository;
	public freelancerRepo freelancerRepository;

	public client clientLogin(String email,String password)
	{
		
//		client checkClient=new client();
//		checkClient=clientRepository.exists(email);
//		if(checkClient!=null) 
//		{
//			if(checkClient.getPassword()==password)
//			{
//				return checkClient;
//				
//			}
//			
//		}
		
		return null;
	}
	 
	 public freelancer freelancerLogin(String email,String password) {
		 return null;
	 }
}
