package com.app.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "reviews")
public class reviews {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reviews_Id;
	@NotBlank @NotNull
	private int rating;
	@NotBlank @NotNull
	private Date date ;
	@NotBlank @NotNull
	private String comment ;
	
	@ManyToOne
	@JoinColumn(name = "freelancer_Id")
	private freelancer Freelancer;

	public reviews( @NotBlank @NotNull int rating, @NotBlank @NotNull Date date,
			@NotBlank @NotNull String comment, freelancer freelancer) {
		super();
		
		this.rating = rating;
		this.date = date;
		this.comment = comment;
		Freelancer = freelancer;
	}

	public reviews()
	{
		
	}

	public int getReviews_Id() {
		return reviews_Id;
	}

	public void setReviews_Id(int reviews_Id) {
		this.reviews_Id = reviews_Id;
	}

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

	public freelancer getFreelancer() {
		return Freelancer;
	}

	public void setFreelancer(freelancer freelancer) {
		Freelancer = freelancer;
	}

	@Override
	public String toString() {
		return "reviews [reviews_Id=" + reviews_Id + ", rating=" + rating + ", date=" + date + ", comment=" + comment
				+ ", Freelancer=" + Freelancer + "]";
	}
	
}
