package com.app.services;

import com.app.dto.clientAddDTO;
import com.app.dto.freelancerAddDTO;

public interface loginService {
	
	 public clientAddDTO clientLogin(String email,String password) ;
	 
	 public freelancerAddDTO freelancerLogin(String email,String password);

}
