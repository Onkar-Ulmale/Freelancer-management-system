package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "freelancer")
public class freelancer {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int freelancer_Id;
	@NotBlank
	private String name;
	
	
	@NotNull
	private int phonenumber;
	private String email;
	@NotBlank @NotNull
	private String password;
	
	@OneToMany(mappedBy = "Freelancer")
	private List<reviews> ReviewsList=new ArrayList<reviews>();
	
	@OneToMany(mappedBy = "freelancer")
	private List<Skills> skillList=new ArrayList<Skills>();
	
	@OneToMany(mappedBy = "freelancer1")
	private List<application> applicationList=new ArrayList<application>();
	
	@OneToMany(mappedBy = "freelancer2")
	private List<working_project> wProjectList=new ArrayList<working_project>();

	public freelancer( @NotBlank String name, @NotNull int phonenumber,
			String email, @NotBlank @NotNull String password, List<reviews> reviewsList, List<Skills> skillList,
			List<application> applicationList, List<working_project> wProjectList) {
		super();
		
		this.name = name;
		this.phonenumber = phonenumber;
		this.email = email;
		this.password = password;
		ReviewsList = reviewsList;
		this.skillList = skillList;
		this.applicationList = applicationList;
		this.wProjectList = wProjectList;
	}

	public freelancer( @NotBlank String name, @NotNull int phonenumber,
			String email, @NotBlank @NotNull String password, List<Skills> skillList) {
		super();
		
		this.name = name;
		this.phonenumber = phonenumber;
		this.email = email;
		this.password = password;
		this.skillList = skillList;
	}

	public freelancer()
	{
		
	}

	public int getFreelancer_Id() {
		return freelancer_Id;
	}

	public void setFreelancer_Id(int freelancer_Id) {
		this.freelancer_Id = freelancer_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<reviews> getReviewsList() {
		return ReviewsList;
	}

	public void setReviewsList(List<reviews> reviewsList) {
		ReviewsList = reviewsList;
	}

	public List<Skills> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<Skills> skillList) {
		this.skillList = skillList;
	}

	public List<application> getApplicationList() {
		return applicationList;
	}

	public void setApplicationList(List<application> applicationList) {
		this.applicationList = applicationList;
	}

	public List<working_project> getwProjectList() {
		return wProjectList;
	}

	public void setwProjectList(List<working_project> wProjectList) {
		this.wProjectList = wProjectList;
	}

	@Override
	public String toString() {
		return "freelancer [freelancer_Id=" + freelancer_Id + ", name=" + name + ", phonenumber=" + phonenumber
				+ ", email=" + email + ", password=" + password + ", ReviewsList=" + ReviewsList + ", skillList="
				+ skillList + ", applicationList=" + applicationList + ", wProjectList=" + wProjectList + "]";
	}
	
	
	
	

}
