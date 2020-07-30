package com.theHandyBag.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.theHandyBag.model.Blog;
import com.theHandyBag.model.Multi_Medi_Type;
import com.theHandyBag.model.User_Table;

@Service("seml")
public interface BlogService{
	
	
	
	/**
	 * @param user
	 */
	public User_Table registerUser(User_Table user);

	/**
	 * @param blog
	 */
	public void saveBlog(Blog blog);

	/**
	 * @return
	 */
	public List<Blog> findAllBloge();

	/**
	 * @param category
	 * @return
	 */
	public List<Blog> fingByCategory(String category);



}
