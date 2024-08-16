package com.app.dto;

public class projectAddDTO {
	
	private String name;
	private String details;
	private double budget;
	private Long Client_id;
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
	public Long getClient_id() {
		return Client_id;
	}
	public void setClient_id(Long client_id) {
		Client_id = client_id;
	}
	
	

}
