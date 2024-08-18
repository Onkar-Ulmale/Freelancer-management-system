package com.app.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.CustomException.CustomException;
import com.app.dto.projectAddDTO;
import com.app.dto.projectGetDTO;
import com.app.entity.client;
import com.app.entity.project;
import com.app.repository.clientRepo;
import com.app.repository.projectRepo;

@Service
@Transactional
public class projectServiceIMPL implements projectService{
	
	@Autowired
	public projectRepo projectRepository;
	
	@Autowired
	private clientRepo clientRepository;

	@Override
	public boolean addProject(projectAddDTO projectDTO) throws CustomException {
		
		try {
			
			//name, @NotBlank @NotNull String details,
			//@NotBlank @NotNull double budget, com.app.entity.client client
			Optional<client> enteredClient=clientRepository.findById(projectDTO.getClient_id());
			
			project newproject=new project(projectDTO.getName(),projectDTO.getDetails(),projectDTO.getBudget(),enteredClient.get());
			projectRepository.save(newproject);
			return true;
		} catch (Exception e) {
			throw new CustomException("Failed to add project");
		}
	}

	@Override
	public List<project> getAllProjects() throws CustomException {
		try {
			return projectRepository.findAll();
			
		} catch (Exception e) {
			throw new CustomException("Failed to get the projects");
		}
		
	}

	@Override
	public boolean updateProject(project project) throws CustomException {
		try {
			Optional<project> enteredProject=projectRepository.findById(project.getProject_Id());
			if(enteredProject.isPresent()) {
				project newProject=new project();
				newProject=	enteredProject.get();
				newProject.setName(project.getName());
				newProject.setDetails(project.getDetails());
				newProject.setBudget(project.getBudget());
				projectRepository.save(newProject);
				return true;
			}
		} catch (Exception e) {
			throw new CustomException("Failed to update the project");
		}
		return false;
	}

	@Override
	public List<projectGetDTO> getAllProjectsByClientId(Long ClientId) throws CustomException {
		try {
			List<projectGetDTO> newDTOList=projectRepository.findProjectsByClientId(ClientId).stream()
					.map( project -> new projectGetDTO(project.getName(),project.getDetails(), project.getBudget()))
					.collect(Collectors.toList());
			return newDTOList;
			
		} catch (Exception e) {
			throw new CustomException("Failed to get projects");
		}
		
	}

}
