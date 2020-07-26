/**
 * 
 */
package com.theHandyBag.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Kumar
 *

	Jul 25, 2020
 */
@Entity
@Table
public class BlogCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long category_id;
	private String category;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "blogId", fetch = FetchType.LAZY)
	private Set<Blog> blog;

	public Long getId() {
		return category_id;
	}

	public void setId(Long category_id) {
		this.category_id = category_id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Set<Blog> getBlog() {
		return blog;
	}

	public void setBlog(Set<Blog> blog) {
		this.blog = blog;
	}

	public BlogCategory(Long category_id, String category, Set<Blog> blog) {
		super();
		this.category_id = category_id;
		this.category = category;
		this.blog = blog;
	}

	public BlogCategory() {
		
	}
	

}
