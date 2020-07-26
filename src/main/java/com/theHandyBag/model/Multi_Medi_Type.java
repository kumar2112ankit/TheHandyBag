package com.theHandyBag.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table
public class Multi_Medi_Type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long media_id;
	private Date create_date;
	private String status;
	//user id of blog table
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "blogId")
	private Blog blog;
	private String location;
	private String meida_type;
	public Long getMedia_id() {
		return media_id;
	}
	public void setMedia_id(Long media_id) {
		this.media_id = media_id;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMeida_type() {
		return meida_type;
	}
	public void setMeida_type(String meida_type) {
		this.meida_type = meida_type;
	}
	public Multi_Medi_Type(Long media_id, Date create_date, String status, Blog blog, String location,
			String meida_type) {
		super();
		this.media_id = media_id;
		this.create_date = create_date;
		this.status = status;
		this.blog = blog;
		this.location = location;
		this.meida_type = meida_type;
	}
	public Multi_Medi_Type() {
		
	}
	
	
	
}
