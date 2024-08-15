package com.app.services;

import java.util.List;

import com.app.CustomException.CustomException;
import com.app.entity.project;

public interface projectService {
	
	public boolean addProject(project project)throws CustomException;
	public List<project> getAllProjects() throws CustomException;
	public boolean updateProject(project project)throws CustomException;
	public List<project> getAllProjectsByClientId(int ClientId)throws CustomException;
	
}
