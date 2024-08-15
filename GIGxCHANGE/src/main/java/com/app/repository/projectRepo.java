package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.CustomException.CustomException;
import com.app.entity.project;

public interface projectRepo extends JpaRepository<project, Integer> {
	
	@Query("SELECT p FROM project p WHERE p.client_id = :client_ID")
	List<project> findProjectsByClientId(int client_ID);

}
