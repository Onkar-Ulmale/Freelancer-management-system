package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.CustomException.CustomException;
import com.app.dto.projectAddDTO;
import com.app.entity.project;
import com.app.services.projectService;

@RestController
@RequestMapping("/project")
public class projectController {
	
	@Autowired
	private projectService projectService;
	
	@PostMapping("/addProject")
	public boolean AddProject(@RequestBody projectAddDTO projectDTO) throws CustomException
	{
		projectService.addProject(projectDTO);
		return true;
	}
	
	@GetMapping("/getAllProjects")
	public List<project> getAllProjects() throws CustomException
	{
		return projectService.getAllProjects();
	}
	
	@PostMapping("/getProjectsById/{Id}")
	public List<project> getAllProjectById(@PathVariable Long Id) throws CustomException
	{
		return projectService.getAllProjectsByClientId(Id);
	}

}
