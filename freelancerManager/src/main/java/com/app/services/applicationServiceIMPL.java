package com.app.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.CustomException.CustomException;
import com.app.Enum.appstatus;
import com.app.entity.application;
import com.app.entity.freelancer;
import com.app.entity.project;
import com.app.repository.applicationRepo;
import com.app.repository.freelancerRepo;
import com.app.repository.projectRepo;

@Service
@Transactional
public class applicationServiceIMPL implements applicationService {

	@Autowired
	public applicationRepo applicationRepository;
	@Autowired
	public projectRepo projectrepository;
	@Autowired
	public freelancerRepo freelancerRepository;
	
	@Override
	public boolean addApplication(Date date ,Long project_id ,Long FreelancerId) throws CustomException {
		//Date date,project project, freelancer freelancer1
		Optional<project> enteredproject=projectrepository.findById(project_id);
		Optional<freelancer> enteredfreelancer=freelancerRepository.findById(FreelancerId);
		application newapplication=new application(date,enteredproject.get(),enteredfreelancer.get());
		applicationRepository.save(newapplication);
		return true;
		
	}

	@Override
	public List<application> getAllApplicationByProjectId(Long projectId) throws Exception {
		try {
			return applicationRepository.findApplicationsByProjectId(projectId);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public boolean updateApplicationStatus(String status, Long applicationId) throws CustomException
	{	
		Optional<application> enteredApp=applicationRepository.findById(applicationId);
		application newappli=enteredApp.get();
		appstatus newStatus=appstatus.valueOf(status.toUpperCase());
		newappli.setStatus(newStatus);
		applicationRepository.save(newappli);
		return true;
	}
}
