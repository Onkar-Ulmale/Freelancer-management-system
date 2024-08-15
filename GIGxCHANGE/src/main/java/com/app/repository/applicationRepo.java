package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entity.application;

public interface applicationRepo extends JpaRepository<application, Integer>{
	
	@Query("SELECT a FROM application a WHERE a.project_id = :ProjectID")
	List<application> findApplicationsByProjectId(int Project_ID);

}
