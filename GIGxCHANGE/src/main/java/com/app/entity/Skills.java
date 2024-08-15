package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Skills {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int skill_Id;
	@NotBlank @NotNull
	private String Name;
	
	@ManyToOne
	@JoinColumn(name = "project_Id")
	private project project;
	
	@ManyToOne
	@JoinColumn(name = "Freelancer_Id")
	private freelancer freelancer;

	public Skills( @NotBlank @NotNull String name, com.app.entity.project project,
			com.app.entity.freelancer freelancer) {
		super();
		
		Name = name;
		this.project = project;
		this.freelancer = freelancer;
	}

	public Skills( @NotBlank @NotNull String name) {
		super();
		
		Name = name;
	}
	
	public Skills()
	{
		
	}

	public int getSkill_Id() {
		return skill_Id;
	}

	public void setSkill_Id(int skill_Id) {
		this.skill_Id = skill_Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public project getProject() {
		return project;
	}

	public void setProject(project project) {
		this.project = project;
	}

	public freelancer getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(freelancer freelancer) {
		this.freelancer = freelancer;
	}

	@Override
	public String toString() {
		return "Skills [skill_Id=" + skill_Id + ", Name=" + Name + ", project=" + project + ", freelancer=" + freelancer
				+ "]";
	}
	

	
}
