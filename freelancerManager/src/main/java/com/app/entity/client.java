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

//@Table(name = "users")
@Entity
@Table(name = "client")
public  class client {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long client_Id;
	
	private String name;
	
	private String phonenumber;
	
	private String email;
	
	private String password;
	
	@OneToMany(mappedBy = "client")
	private List<project> projectList=new ArrayList<project>();
	
	@OneToMany(mappedBy = "client")
	private List<working_project> wProjectList=new ArrayList<working_project>();

	
	public client(  String name,  String phonenumber,
			 String email,  String password) {
		super();
		
		this.name = name;
		this.phonenumber = phonenumber;
		this.email = email;
		this.password = password;
	}


	public Long getClient_Id() {
		return client_Id;
	}

	public void setClient_Id(Long client_Id) {
		this.client_Id = client_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
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

	public List<project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<project> projectList) {
		this.projectList = projectList;
	}

	public List<working_project> getwProjectList() {
		return wProjectList;
	}

	public void setwProjectList(List<working_project> wProjectList) {
		this.wProjectList = wProjectList;
	}

	@Override
	public String toString() {
		return "client [client_Id=" + client_Id + ", name=" + name + ", phonenumber=" + phonenumber + ", email=" + email
				+ ", password=" + password + ", projectList=" + projectList + ", wProjectList=" + wProjectList + "]";
	}
	
	
	
	

}
