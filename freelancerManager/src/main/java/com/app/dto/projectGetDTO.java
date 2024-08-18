package com.app.dto;

import com.app.entity.project;

public class projectGetDTO {

	private String name;
	private String details;
	private double budget;
	
	public projectGetDTO toDTO(project nproject) 
	{
		projectGetDTO dto=new projectGetDTO(nproject.getName(),nproject.getDetails(),nproject.getBudget());
		return dto;
	}
	
	
	public projectGetDTO(String name, String details, double budget) {
		
		this.name = name;
		this.details = details;
		this.budget = budget;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	
	
}
