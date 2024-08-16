package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.LoginRequestDTO;
import com.app.entity.client;
import com.app.entity.freelancer;
import com.app.services.loginService;

@RestController
@RequestMapping("/login")
public class loginController {
	
	@Autowired
	private loginService loginService;
	
//	@PostMapping("/client")
//	public client loginClient(@RequestBody String email,String password) {
//		
//		return loginService.clientLogin(email, password);
//	}
//	
//	@PostMapping("/freelancer")
//	public freelancer loginFreelancer(@RequestBody String email,String password)
//	{
//		return loginService.freelancerLogin(email, password);
//	}

	   @PostMapping("/client")
	    public client loginClient(@RequestBody LoginRequestDTO loginRequest) {
	        return loginService.clientLogin(loginRequest.getEmail(), loginRequest.getPassword());
	    }
	    
	    @PostMapping("/freelancer")
	    public freelancer loginFreelancer(@RequestBody LoginRequestDTO loginRequest) {
	        return loginService.freelancerLogin(loginRequest.getEmail(), loginRequest.getPassword());
	    }
}
