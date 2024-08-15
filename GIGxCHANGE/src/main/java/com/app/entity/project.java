package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class project {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int project_Id;
	
	@NotBlank @NotNull
	private String name;
	@NotBlank @NotNull
	private String details;
	@NotBlank @NotNull
	private double budget;
	
	@ManyToOne
	@JoinColumn(name = "client_Id")
	private client client;
	
	@OneToMany(mappedBy = "project")
	private List<Skills> Requiredskills=new ArrayList<Skills>();
	
	@OneToMany(mappedBy = "project")
	private List<application> applicationList=new ArrayList<application>();
	
	@OneToOne(mappedBy = "project")
	private working_project wProject;

	public project( @NotBlank @NotNull String name, @NotBlank @NotNull String details,
			@NotBlank @NotNull double budget, com.app.entity.client client, List<Skills> requiredskills,
			List<application> applicationList, working_project wProject) {
		super();
		
		this.name = name;
		this.details = details;
		this.budget = budget;
		this.client = client;
		Requiredskills = requiredskills;
		this.applicationList = applicationList;
		this.wProject = wProject;
	}

	public project( @NotBlank @NotNull String name, @NotBlank @NotNull String details,
			@NotBlank @NotNull double budget, com.app.entity.client client, List<Skills> requiredskills) {
		super();
		
		this.name = name;
		this.details = details;
		this.budget = budget;
		this.client = client;
		Requiredskills = requiredskills;
	}
	
	public project()
	{
		
	}

	public int getProject_Id() {
		return project_Id;
	}

	public void setProject_Id(int project_Id) {
		this.project_Id = project_Id;
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

	public client getClient() {
		return client;
	}

	public void setClient(client client) {
		this.client = client;
	}

	public List<Skills> getRequiredskills() {
		return Requiredskills;
	}

	public void setRequiredskills(List<Skills> requiredskills) {
		Requiredskills = requiredskills;
	}

	public List<application> getApplicationList() {
		return applicationList;
	}

	public void setApplicationList(List<application> applicationList) {
		this.applicationList = applicationList;
	}

	public working_project getwProject() {
		return wProject;
	}

	public void setwProject(working_project wProject) {
		this.wProject = wProject;
	}

	@Override
	public String toString() {
		return "project [project_Id=" + project_Id + ", name=" + name + ", details=" + details + ", budget=" + budget
				+ ", client=" + client + ", Requiredskills=" + Requiredskills + ", applicationList=" + applicationList
				+ ", wProject=" + wProject + "]";
	}
	
	
}
