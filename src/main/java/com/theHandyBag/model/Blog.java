package com.theHandyBag.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Blog {

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@OneToMany
	@Column(name = "blogId")
	private Long blogId;
	@Column(name = "blogName")
	private String blogName;
	@Column(name = "blog")
	private String blog;
	@Column(name = "createDate")
	private Long createDate;
	@Column(name = "editDate")
	private Long editDate;
	@Column(name = "location")
	private String location;

	@ManyToOne(fetch = FetchType.LAZY)
	private User_Table user_Table;

	public Long getBlogId() {
		return blogId;
	}

	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	public String getBlogName() {
		return blogName;
	}

	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public Long getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}

	public Long getEditDate() {
		return editDate;
	}

	public void setEditDate(Long editDate) {
		this.editDate = editDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public User_Table getUser_Table() {
		return user_Table;
	}

	public void setUser_Table(User_Table user_Table) {
		this.user_Table = user_Table;
	}
}
