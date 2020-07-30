package com.theHandyBag.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.theHandyBag.model.Blog;
import com.theHandyBag.model.User_Table;
import com.theHandyBag.service.BlogService;

@RestController
public class RegisterController {
	@Autowired
	private BlogService service;

	/*
	 * @GetMapping(value = "/test",produces = MediaType.APPLICATION_JSON_VALUE)
	 * public Blog findBlo() { service.allBlogService(); return null;
	 * 
	 * }
	 */
	@PostMapping(value = "/register",produces = MediaType.APPLICATION_JSON_VALUE)
	public String registerUser(@RequestBody User_Table user) {
		
	
		User_Table registerUser=service.registerUser(user);
		System.out.println(registerUser.toString());
		return "registerd";
		
		
	}

}
