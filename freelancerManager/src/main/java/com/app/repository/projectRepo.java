package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.CustomException.CustomException;
import com.app.entity.project;

public interface projectRepo extends JpaRepository<project, Long> {
	
	@Query("SELECT p FROM project p WHERE p.client.client_Id = :client_ID")
	List<project> findProjectsByClientId(@Param("client_ID")Long client_ID);

}
