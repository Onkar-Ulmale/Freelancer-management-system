package com.app.services;

import java.util.List;

import com.app.CustomException.CustomException;
import com.app.entity.application;

public interface applicationService {
	
	public boolean addApplication(application application)throws CustomException;
	
	public List<application> getAllApplicationByProjectId(int projectId)throws CustomException;
	public boolean updateApplicationStatus(String status, int applicationId)throws CustomException; 
}
