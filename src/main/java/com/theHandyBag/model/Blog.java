package com.theHandyBag.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Blog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer blog_id;
	@Column(name = "blogName")
	private String blogName;
	@Column(name = "blog")
	private String blog;

	
	private String category;
	@Column(name = "createDate")
	private String createDate;
	@Column(name = "editDate")
	private String editDate;
	@Column(name = "location")
	private String location;
	
	@OneToMany(targetEntity = Multi_Medi_Type.class, fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "media_fk",referencedColumnName = "blog_id")
	private Set<Multi_Medi_Type> media;

	
	private Integer userId;

	
	
	public Set<Multi_Medi_Type> getMedia() {
		return media;
	}

	public void setMedia(Set<Multi_Medi_Type> media) {
		this.media = media;
	}

	public Integer getBlogId() {
		return blog_id;
	}

	public void setBlogId(Integer blog_id) {
		this.blog_id = blog_id;
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

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getEditDate() {
		return editDate;
	}

	public void setEditDate(String editDate) {
		this.editDate = editDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Blog() {
		
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Blog(Integer blog_id, String blogName, String blog, String category, String createDate, String editDate,
			String location, Set<Multi_Medi_Type> media, Integer userId) {
		
		this.blog_id = blog_id;
		this.blogName = blogName;
		this.blog = blog;
		this.category = category;
		this.createDate = createDate;
		this.editDate = editDate;
		this.location = location;
		this.media = media;
		this.userId = userId;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Blog [blog_id=" + blog_id + ", blogName=" + blogName + ", blog=" + blog + ", category=" + category
				+ ", createDate=" + createDate + ", editDate=" + editDate + ", location=" + location + ", media="
				+ (media != null ? toString(media, maxLen) : null) + ", userId=" + userId + "]";
	}

	private String toString(Collection<?> collection, int maxLen) {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		int i = 0;
		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; i++) {
			if (i > 0)
				builder.append(", ");
			builder.append(iterator.next());
		}
		builder.append("]");
		return builder.toString();
	}

	

	
	

}
