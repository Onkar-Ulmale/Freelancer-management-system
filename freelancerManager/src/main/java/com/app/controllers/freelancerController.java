package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.CustomException.CustomException;
import com.app.dto.freelancerAddDTO;
import com.app.services.freelancerService;

@RestController
@RequestMapping("/freelancer")
public class freelancerController {
	
	@Autowired
	private freelancerService freelancerService;
	
	@PostMapping("/addFreelancer")
	@CrossOrigin(origins="http://localhost:3000")
	public boolean AddFreelancer(@RequestBody freelancerAddDTO freelancerDTO)throws CustomException
	{
		freelancerService.AddFreelancer(freelancerDTO);
		return true;
	}

}
