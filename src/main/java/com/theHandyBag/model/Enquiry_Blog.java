package com.theHandyBag.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Enquiry_Blog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long enquary_id;
	private String name;
	private String email;
	private String contact_no;
	private String enq_question;
	private Date create_time;
	private String location;
	public Long getEnquary_id() {
		return enquary_id;
	}
	public void setEnquary_id(Long enquary_id) {
		this.enquary_id = enquary_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getEnq_question() {
		return enq_question;
	}
	public void setEnq_question(String enq_question) {
		this.enq_question = enq_question;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Enquiry_Blog [enquary_id=" + enquary_id + ", name=" + name + ", email=" + email + ", contact_no="
				+ contact_no + ", enq_question=" + enq_question + ", create_time=" + create_time + ", location="
				+ location + "]";
	}
	
}
