package com.app.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.CustomException.CustomException;
import com.app.Enum.appstatus;
import com.app.entity.application;
import com.app.repository.applicationRepo;

@Service
@Transactional
public class applicationServiceIMPL implements applicationService {

	@Autowired
	public applicationRepo applicationRepository;
	
	@Override
	public boolean addApplication(application application) throws CustomException {
		try {
			applicationRepository.save(application);
			return true;
		} catch (Exception e) {
			throw new CustomException("Failed to add application");
		}
	}

	@Override
	public List<application> getAllApplicationByProjectId(int projectId) throws CustomException {
		try {
			return applicationRepository.findApplicationsByProjectId(projectId);
		} catch (Exception e) {
			throw new CustomException("Failed to add application");
		}
	}

	@Override
	public boolean updateApplicationStatus(String status, int applicationId) throws CustomException {
		
		Optional<application> enteredApp=applicationRepository.findById(applicationId);
		application newappli=enteredApp.get();
		appstatus newStatus=appstatus.valueOf(status.toUpperCase());
		newappli.setStatus(newStatus);
		applicationRepository.save(newappli);
		return true;
	}



}
