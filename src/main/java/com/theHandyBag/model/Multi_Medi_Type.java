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

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table
public class Multi_Medi_Type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer media_id;
	private String create_date;
	private String status;

	/*
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "blog_id",referencedColumnName = "blog_id")
	 */
	@ManyToOne
	@JoinColumn(name = "media_fk")
	@JsonIgnore
	private Blog blog;
	private String location;
	private String meida_type;
	public Integer getMedia_id() {
		return media_id;
	}
	public void setMedia_id(Integer media_id) {
		this.media_id = media_id;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
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
	public Multi_Medi_Type(Integer media_id, String create_date, String status, Blog blog, String location,
			String meida_type) {
		
		this.media_id = media_id;
		this.create_date = create_date;
		this.status = status;
		this.blog = blog;
		this.location = location;
		this.meida_type = meida_type;
	}
	public Multi_Medi_Type() {
		
	}
	@Override
	public String toString() {
		return "Multi_Medi_Type [media_id=" + media_id + ", create_date=" + create_date + ", status=" + status
				+ ", blog=" + blog + ", location=" + location + ", meida_type=" + meida_type + "]";
	}
	
	
}
