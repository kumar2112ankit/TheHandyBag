package com.theHandyBag.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String user_id;
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
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
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
	@Override
	public String toString() {
		return "Multi_Medi_Type [media_id=" + media_id + ", create_date=" + create_date + ", status=" + status
				+ ", user_id=" + user_id + ", location=" + location + ", meida_type=" + meida_type + "]";
	}
	
}
