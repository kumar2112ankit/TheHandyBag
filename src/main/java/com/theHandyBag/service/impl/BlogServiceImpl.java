package com.theHandyBag.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theHandyBag.dao.BlogDao;
import com.theHandyBag.dao.MultiMedia;
import com.theHandyBag.dao.UserDao;
import com.theHandyBag.model.Blog;
import com.theHandyBag.model.Multi_Medi_Type;
import com.theHandyBag.model.User_Table;
import com.theHandyBag.service.BlogService;

@Service("impl")
public class BlogServiceImpl implements BlogService {
	@Autowired
	private BlogDao blogdao;
	@Autowired
	private MultiMedia media;
	
	@Autowired
	private UserDao userdao;


	@Override
	public User_Table registerUser(User_Table user) {
		return userdao.save(user);
	}

	@Override
	public void saveBlog(Blog blog) {
		blogdao.save(blog);
		
	}

	@Override
	public List<Blog> findAllBloge() {
		// TODO Auto-generated method stub
		return blogdao.findAll();
	}

	@Override
	public List<Blog> fingByCategory(String category) {
		
		return blogdao.findByCategory(category);
	}

	

}
