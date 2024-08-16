package com.app.services;

import com.app.CustomException.CustomException;
import com.app.dto.Working_projectDTO;

public interface workingProjectService {
	
	boolean addWorkingProject(Working_projectDTO wprojectDTO)throws CustomException;
	
}
