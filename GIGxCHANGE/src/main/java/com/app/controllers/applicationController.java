package com.app.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.CustomException.CustomException;
import com.app.dto.applicationUpdateDTO;
import com.app.entity.application;
import com.app.services.applicationService;

@RestController
@RequestMapping("/application")
public class applicationController {
	
	@Autowired
	private applicationService applicationservice;
	
	
	@PostMapping("/addApplication")
	public boolean addApplicataion(@RequestParam Date date,@RequestParam Long FreelancerID,@RequestParam Long PRojectId) 
	{
		try {
			applicationservice.addApplication(date, PRojectId, FreelancerID);
			return true;
		} catch (CustomException e) {
			e.printStackTrace();
		}
		return false;	
	}

	@GetMapping("/getApplication/{id}")
	public List<application> getAllApplicationByPRojectId(@PathVariable Long id) throws Exception
	{
			return applicationservice.getAllApplicationByProjectId(id);
	}
	
	@PostMapping("/UpdateStatus")
	public boolean updateStatus(@RequestBody applicationUpdateDTO applicationUpdate) throws CustomException
	{
		return applicationservice.updateApplicationStatus(applicationUpdate.getStatus(), applicationUpdate.getApplicationId());
		
		
	}
	
}
