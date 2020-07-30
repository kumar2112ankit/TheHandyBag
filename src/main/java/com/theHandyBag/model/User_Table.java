package com.theHandyBag.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user_table")
public class User_Table {
	public User_Table() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer userId;
	@Column(name = "userName")
	private String userName;
	@Column(name = "emailId")
	private String emailId;
	@Column(name = "password")
	private String password;
	@Column(name = "oldPassword")
	private String oldPassword;
	@Column(name = "name")
	private String name;

	
	

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User_Table(Integer userId, String userName, String emailId, String password, String oldPassword, String name,
			Set<Blog> blog) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.oldPassword = oldPassword;
		this.name = name;

	}

	@Override
	public String toString() {
		return "User_Table [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + ", password="
				+ password + ", oldPassword=" + oldPassword + ", name=" + name + "]";
	}

}
