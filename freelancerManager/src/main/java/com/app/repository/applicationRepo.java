package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entity.application;

public interface applicationRepo extends JpaRepository<application, Long>{
	
	@Query("SELECT a FROM application a WHERE a.project.project_Id = :ProjectID")
	List<application> findApplicationsByProjectId(@Param("ProjectID")Long Project_ID);

}
