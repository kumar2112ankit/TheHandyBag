package com.theHandyBag.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theHandyBag.model.Blog;
import com.theHandyBag.service.BlogService;
import com.theHandyBag.service.impl.BlogServiceImpl;

@RestController
public class BlogeController {
	@Autowired
	private BlogService service;

	@GetMapping(value = "/test",produces = MediaType.APPLICATION_JSON_VALUE)
	public Blog findBlo() {
	
		return null;

	}

}
