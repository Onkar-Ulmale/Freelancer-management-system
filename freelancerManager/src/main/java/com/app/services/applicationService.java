package com.app.services;

import java.util.Date;
import java.util.List;

import com.app.CustomException.CustomException;
import com.app.dto.applicationGetDTO;

public interface applicationService {
	
	public boolean addApplication( Date date ,Long project_id ,Long FreelancerId)throws CustomException;
	
	public List<applicationGetDTO> getAllApplicationByProjectId(Long projectId)throws CustomException, Exception;
	public boolean updateApplicationStatus(String status, Long applicationId)throws CustomException; 

}
