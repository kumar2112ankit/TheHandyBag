package com.theHandyBag.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

	private Long blogId;
	@Column(name = "blogName")
	private String blogName;
	@Column(name = "blog")
	private String blog;

	@ManyToOne
	@JoinColumn
	private BlogCategory category;
	@Column(name = "createDate")
	private Long createDate;
	@Column(name = "editDate")
	private Long editDate;
	@Column(name = "location")
	private String location;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "media_id", fetch = FetchType.LAZY)
	private Set<Multi_Medi_Type> media;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	// @Column(name = "user_id")
	private User_Table user_Table;

	
	
	public Set<Multi_Medi_Type> getMedia() {
		return media;
	}

	public void setMedia(Set<Multi_Medi_Type> media) {
		this.media = media;
	}

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

	public BlogCategory getCategory() {
		return category;
	}

	public void setCategory(BlogCategory category) {
		this.category = category;
	}

	public User_Table getUser_Table() {
		return user_Table;
	}

	public void setUser_Table(User_Table user_Table) {
		this.user_Table = user_Table;
	}

	
	public Blog(Long blogId, String blogName, String blog, BlogCategory category, Long createDate, Long editDate,
			String location, Set<Multi_Medi_Type> media, User_Table user_Table) {
		super();
		this.blogId = blogId;
		this.blogName = blogName;
		this.blog = blog;
		this.category = category;
		this.createDate = createDate;
		this.editDate = editDate;
		this.location = location;
		this.media = media;
		this.user_Table = user_Table;
	}

	public Blog() {
		
	}
	

}
