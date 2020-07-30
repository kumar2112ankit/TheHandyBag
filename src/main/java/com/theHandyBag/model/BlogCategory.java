/**
 * 
 */
package com.theHandyBag.model;

import java.util.Collection;
import java.util.Iterator;
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

public class BlogCategory {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer category_id;
	private String category;
	
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "blog_id", fetch = FetchType.LAZY)
	private Set<Blog> blog;
	public Integer getId() {
		return category_id;
	}

	public void setId(Integer category_id) {
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

	public BlogCategory(Integer category_id, String category, Set<Blog> blog) {
		super();
		this.category_id = category_id;
		this.category = category;
		this.blog = blog;
	}

	public BlogCategory() {
		
	}

	

	

	
	

}
