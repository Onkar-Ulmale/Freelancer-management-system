package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.CustomException.CustomException;
import com.app.dto.Working_projectDTO;
import com.app.services.workingProjectService;

@RestController
@RequestMapping("/workingProject")
public class working_projectController {
	
	@Autowired
	private workingProjectService workingProjectService;
	
	@PostMapping("/AddWorking")
	public boolean addWorkingProject(@RequestBody Working_projectDTO workingProjectDTO ) throws CustomException
	{
		return workingProjectService.addWorkingProject(workingProjectDTO);
	}
	
	
	
	
	

}
