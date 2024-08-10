package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "reviews")
public class reviews {
	
	@Id @NotNull
	private int reviews_Id;
	private int freelancer_Id;

	
}
