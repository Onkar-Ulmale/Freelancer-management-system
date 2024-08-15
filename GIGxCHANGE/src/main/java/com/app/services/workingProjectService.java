package com.app.services;

import com.app.CustomException.CustomException;
import com.app.entity.working_project;

public interface workingProjectService {
	
	boolean addWorkingProject(working_project wproject)throws CustomException;
	
}
