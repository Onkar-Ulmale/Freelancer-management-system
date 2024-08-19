package com.app.dto;

public class projectGetAllDTO {
	private long projectId;
	private String name;
	private String details;
	private double budget;
	public projectGetAllDTO(long freelancerId, String name, String details, double budget) {
		super();
		this.projectId = freelancerId;
		this.name = name;
		this.details = details;
		this.budget = budget;
	}
	public long getprojectId() {
		return projectId;
	}
	public void setprojectId(long freelancerId) {
		this.projectId = freelancerId;
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
