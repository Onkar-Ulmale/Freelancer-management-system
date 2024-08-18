package com.app.services;

import com.app.dto.clientGetDTO;
import com.app.dto.freelancerAddDTO;

public interface loginService {
	
	 public clientGetDTO clientLogin(String email,String password) ;
	 
	 public freelancerAddDTO freelancerLogin(String email,String password);

}
