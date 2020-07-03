package com.theHandyBag.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class User_Table {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long user_id;
	private String user_name;
	private String email;
	private String password;
	private String old_password;
	private String name;
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOld_password() {
		return old_password;
	}
	public void setOld_password(String old_password) {
		this.old_password = old_password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User_Table [user_id=" + user_id + ", user_name=" + user_name + ", email=" + email + ", password="
				+ password + ", old_password=" + old_password + ", name=" + name + "]";
	}
	
}
