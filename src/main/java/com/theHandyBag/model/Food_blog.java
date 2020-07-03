package com.theHandyBag.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Food_blog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long blog_id;
	private String blog_name;
	private String blog;
	private Date create_date;
	private Date edit_date;
	//user id of blog table
	private String user_id;
	private String location;
	public Long getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(Long blog_id) {
		this.blog_id = blog_id;
	}
	public String getBlog_name() {
		return blog_name;
	}
	public void setBlog_name(String blog_name) {
		this.blog_name = blog_name;
	}
	public String getBlog() {
		return blog;
	}
	public void setBlog(String blog) {
		this.blog = blog;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getEdit_date() {
		return edit_date;
	}
	public void setEdit_date(Date edit_date) {
		this.edit_date = edit_date;
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
	@Override
	public String toString() {
		return "Food_blog [blog_id=" + blog_id + ", blog_name=" + blog_name + ", blog=" + blog + ", create_date="
				+ create_date + ", edit_date=" + edit_date + ", user_id=" + user_id + ", location=" + location + "]";
	}
	
}
