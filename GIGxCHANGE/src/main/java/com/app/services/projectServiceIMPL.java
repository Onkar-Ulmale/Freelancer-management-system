package com.app.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.CustomException.CustomException;
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
	public boolean addProject(project project) throws CustomException {
		
		try {
			projectRepository.save(project);
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
	public List<project> getAllProjectsByClientId(int ClientId) throws CustomException {
		try {
			return projectRepository.findProjectsByClientId(ClientId);
			
		} catch (Exception e) {
			throw new CustomException("Failed to get projects");
		}
		
	}

}
