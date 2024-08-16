package com.app.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.CustomException.CustomException;
import com.app.dto.Working_projectDTO;
import com.app.entity.client;
import com.app.entity.freelancer;
import com.app.entity.project;
import com.app.entity.working_project;
import com.app.repository.clientRepo;
import com.app.repository.freelancerRepo;
import com.app.repository.projectRepo;
import com.app.repository.working_projectRepo;
@Service
@Transactional
public class workingProjectServiceIMPL implements workingProjectService{

	@Autowired
	public working_projectRepo wpRepository;
	@Autowired
	public clientRepo clientRepository;
	@Autowired
	public freelancerRepo freelancerRepository;
	@Autowired
	public projectRepo projectRepository;
	
	@Override
	public boolean addWorkingProject(Working_projectDTO wprojectDTO) throws CustomException {
		try {
			//com.app.entity.client client, freelancer freelancer2, com.app.entity.project project
			
			Optional<client> enteredClient=clientRepository.findById(wprojectDTO.getClientId());
			Optional<freelancer> enteredFreelancer=freelancerRepository.findById(wprojectDTO.getFreelancingId());
			Optional<project> enteredPreoject=projectRepository.findById(wprojectDTO.getProjectId());
			working_project wproject=new working_project(enteredClient.get(),enteredFreelancer.get(),enteredPreoject.get());
			wpRepository.save(wproject);
			return true;
			
			
		} catch (Exception e) {
			throw new CustomException("Failed to add working project");
		}
	}

}
