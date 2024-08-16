package com.app.services;

import java.util.List;

import com.app.CustomException.CustomException;
import com.app.dto.projectAddDTO;
import com.app.entity.project;

public interface projectService {
	
	public boolean addProject(projectAddDTO projectDTO)throws CustomException;
	public List<project> getAllProjects() throws CustomException;
	public boolean updateProject(project project)throws CustomException;
	public List<project> getAllProjectsByClientId(Long ClientId)throws CustomException;
	
}
