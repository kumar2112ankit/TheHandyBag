package com.theHandyBag.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theHandyBag.dao.BlogDao;
import com.theHandyBag.model.Blog;
import com.theHandyBag.service.BlogService;

@Service("impl")
public class BlogServiceImpl implements BlogService {
	@Autowired
	private BlogDao dao;

	public void allBlogService(Blog blog) {
		dao.save(blog);
		
	}

}
