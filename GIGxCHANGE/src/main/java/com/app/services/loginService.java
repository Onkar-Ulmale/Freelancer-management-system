package com.app.services;

import com.app.entity.client;
import com.app.entity.freelancer;

public interface loginService {
	
	 public client clientLogin(String email,String password) ;
	 
	 public freelancer freelancerLogin(String email,String password);

}
