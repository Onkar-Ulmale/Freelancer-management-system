package com.app.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.app.Enum.appstatus;

@Entity
public class application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int application_Id;
	@NotBlank @NotNull
	private Date date;
	private appstatus status;
	
	@ManyToOne
	@JoinColumn(name = "Project_Id")
	private project project;
	
	@ManyToOne
	@JoinColumn(name = "freelancer_Id")
	private freelancer freelancer1;

	public application( @NotBlank @NotNull Date date, appstatus status,
			com.app.entity.project project, freelancer freelancer1) {
		super();
		
		this.date = date;
		this.status = status;
		this.project = project;
		this.freelancer1 = freelancer1;
	}
	public application() 
	{
		
	}
	public int getApplication_Id() {
		return application_Id;
	}
	public void setApplication_Id(int application_Id) {
		this.application_Id = application_Id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public appstatus getStatus() {
		return status;
	}
	public void setStatus(appstatus status) {
		this.status = status;
	}
	public project getProject() {
		return project;
	}
	public void setProject(project project) {
		this.project = project;
	}
	public freelancer getFreelancer1() {
		return freelancer1;
	}
	public void setFreelancer1(freelancer freelancer1) {
		this.freelancer1 = freelancer1;
	}
	@Override
	public String toString() {
		return "application [application_Id=" + application_Id + ", date=" + date + ", status=" + status + ", project="
				+ project + ", freelancer1=" + freelancer1 + "]";
	}
	
	
}
