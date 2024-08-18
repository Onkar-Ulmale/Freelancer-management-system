package com.app.dto;

public class clientGetDTO {
	private Long id;
	private String name;
	private String phonenumber;
	private String email;
	private String password;
	
	public clientGetDTO() {
		
	}
	public clientGetDTO(Long id,String name, String phonenumber, String email, String password) {
		this.id=id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.email = email;
		this.password = password;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	


}
