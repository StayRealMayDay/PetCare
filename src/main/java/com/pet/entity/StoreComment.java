package com.pet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name = "store_comment")
public class StoreComment implements java.io.Serializable{

	
	

	/**
	 * 
	 */
	


	@Id
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	@ManyToOne
	@JoinColumn(name = "StoreUserID")
	private StoreUser storeUser;
	

	@ManyToOne
	@JoinColumn(name = "PetUserID")
	private PetUser petUser;
	
	
	@Column(length = 1000,nullable=false)
	private String comment;
	
	
	
	@Column
	private int stars = 0;
	
	@Column(length = 20,nullable=false)
	private String email;
	
	@Column
	private boolean anonymous = false;
	
	@Column
	private Date dateOfComment;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public StoreUser getStoreUser() {
		return storeUser;
	}

	public void setStoreUser(StoreUser storeUser) {
		this.storeUser = storeUser;
	}

	public PetUser getPetUser() {
		return petUser;
	}

	public void setPetUser(PetUser petUser) {
		this.petUser = petUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAnonymous() {
		return anonymous;
	}

	public void setAnonymous(boolean anonymous) {
		this.anonymous = anonymous;
	}

	public Date getDateOfComment() {
		return dateOfComment;
	}

	public void setDateOfComment(Date dateOfComment) {
		this.dateOfComment = dateOfComment;
	}

	
	
	

}