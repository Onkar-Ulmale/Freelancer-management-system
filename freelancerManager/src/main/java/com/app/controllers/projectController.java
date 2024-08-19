package com.app.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.CustomException.CustomException;
import com.app.dto.projectAddDTO;
import com.app.dto.projectGetAllDTO;
import com.app.dto.projectGetDTO;
import com.app.services.projectService;

@RestController
@RequestMapping("/project")
public class projectController {
	
	@Autowired
	private projectService projectService;
	
	@PostMapping("/addProject")
	@CrossOrigin(origins="http://localhost:3000")
	public boolean AddProject(@RequestBody projectAddDTO projectDTO) throws CustomException
	{
		projectService.addProject(projectDTO);
		return true;
	}
	
	
	@GetMapping("/getAllProjects")
	@CrossOrigin(origins="http://localhost:3000")
	public List<projectGetAllDTO> getAllProjects() throws CustomException
	{
		return projectService.getAllProjects();
	}
	
	@PostMapping("/getProjectsById/{Id}")
	public List<projectGetDTO> getAllProjectById(@PathVariable Long Id) throws CustomException
	{
		List<projectGetDTO> newDtoList=projectService.getAllProjectsByClientId(Id).stream()
				.map(project-> new projectGetDTO(project.getName(),project.getDetails(),project.getBudget()))
				.collect(Collectors.toList());
				/*
				 * Copyright 2024 the original author or authors.
				 *
				 * Licensed under the Apache License, Version 2.0 (the "License");
				 * you may not use this file except in compliance with the License.
				 * You may obtain a copy of the License at
				 *
				 *      https://www.apache.org/licenses/LICENSE-2.0
				 *
				 * Unless required by applicable law or agreed to in writing, software
				 * distributed under the License is distributed on an "AS IS" BASIS,
				 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
				 * See the License for the specific language governing permissions and
				 * limitations under the License.
				 */

		return newDtoList;
	}

}
