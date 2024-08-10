package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "freelancer")
public class freelancer {
	
	@Id @NotBlank @NotNull
	private int freelancer_Id;
	@NotBlank
	private String name;
	private String skills;
	@NotNull
	private int phonenumber;
	private String email;
	@NotBlank @NotNull
	private String password;
	
	public freelancer(@NotBlank @NotNull int freelancer_Id, @NotBlank String name, Skills skills,
			@NotNull int phonenumber, String email, @NotBlank @NotNull String password) {
		super();
		this.freelancer_Id = freelancer_Id;
		this.name = name;
		this.skills = skills;
		this.phonenumber = phonenumber;
		this.email = email;
		this.password = password;
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

	public Skills getSkills() {
		return skills;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
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
	
	
	
	
	

}
