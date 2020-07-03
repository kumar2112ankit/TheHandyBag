package com.theHandyBag.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;



@Entity
@Table
public class Blog {
	 @javax.persistence.Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	  public Long id;

	  public String firstName;
	  public String lastName;

	  public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Blog() {}

	  public Blog(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	  }

	 }
