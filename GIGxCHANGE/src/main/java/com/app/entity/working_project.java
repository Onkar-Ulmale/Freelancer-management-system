package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



import com.app.Enum.prostatus;

@Entity
public class working_project {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int wProjectId;
	private prostatus projectStatus;
	
	
	@ManyToOne
	@JoinColumn(name = "client_Id")
	private client client;
	
	@ManyToOne
	@JoinColumn(name = "Freelancer_Id")
	private freelancer freelancer2;
	
	@OneToOne
	@JoinColumn(name = "project_Id")
	private project project;

	public working_project( prostatus projectStatus, 
			com.app.entity.client client, freelancer freelancer2, com.app.entity.project project) {
		super();
		
		this.projectStatus = projectStatus;
		
		this.client = client;
		this.freelancer2 = freelancer2;
		this.project = project;
	}
	
	
	public working_project()
	{
		
	}


	public int getwProjectId() {
		return wProjectId;
	}


	public void setwProjectId(int wProjectId) {
		this.wProjectId = wProjectId;
	}


	public prostatus getProjectStatus() {
		return projectStatus;
	}


	public void setProjectStatus(prostatus projectStatus) {
		this.projectStatus = projectStatus;
	}




	public client getClient() {
		return client;
	}


	public void setClient(client client) {
		this.client = client;
	}


	public freelancer getFreelancer2() {
		return freelancer2;
	}


	public void setFreelancer2(freelancer freelancer2) {
		this.freelancer2 = freelancer2;
	}


	public project getProject() {
		return project;
	}


	public void setProject(project project) {
		this.project = project;
	}


	@Override
	public String toString() {
		return "working_project [wProjectId=" + wProjectId + ", projectStatus=" + projectStatus  + ", client=" + client + ", freelancer2=" + freelancer2 + ", project=" + project + "]";
	}
	
}
