package com.app.services;

import java.util.List;

import com.app.CustomException.CustomException;
import com.app.dto.projectAddDTO;
import com.app.dto.projectGetAllDTO;
import com.app.dto.projectGetDTO;
import com.app.entity.project;

public interface projectService {
	
	public boolean addProject(projectAddDTO projectDTO)throws CustomException;
	public List<projectGetAllDTO> getAllProjects() throws CustomException;
	public boolean updateProject(project project)throws CustomException;
	public List<projectGetDTO> getAllProjectsByClientId(Long ClientId)throws CustomException;
	
}
