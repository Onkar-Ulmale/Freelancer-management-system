package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

//@Table(name = "users")
@Entity
@Table(name = "client")
public  class client {
	
	@Id @NotBlank @NotNull
	private int client_Id;
	@NotBlank
	private String name;
	@NotNull
	private int phonenumber;
	@NotNull
	private String email;
	@NotNull
	private String password;
	
	
	public client(@NotBlank @NotNull int client_Id, @NotBlank String name, @NotNull int phonenumber,
			@NotNull String email, @NotNull String password) {
		super();
		this.client_Id = client_Id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.email = email;
		this.password = password;
	}


	public int getClient_Id() {
		return client_Id;
	}


	public void setClient_Id(int client_Id) {
		this.client_Id = client_Id;
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
	
	
	
	
	

}
