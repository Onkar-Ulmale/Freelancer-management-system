package com.app.dto;

import java.util.Date;

public class applicationGetDTO {

	private Date date;
	private Long freelancer1;
	public applicationGetDTO(Date date, Long freelancer1) {
		this.date = date;
		this.freelancer1 = freelancer1;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getFreelancer1() {
		return freelancer1;
	}
	public void setFreelancer1(Long freelancer1) {
		this.freelancer1 = freelancer1;
	}	
}
