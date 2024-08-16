package com.app.dto;

import java.util.Date;

public class reviewAddDTO {
	private int rating;
	private Date date;
	private String comment;
	private Long FreelancerId;
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Long getFreelancerId() {
		return FreelancerId;
	}
	public void setFreelancerId(Long freelancerId) {
		FreelancerId = freelancerId;
	}
	

}
