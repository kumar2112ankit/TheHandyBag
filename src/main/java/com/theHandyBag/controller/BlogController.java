/**
 * 
 */
package com.theHandyBag.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theHandyBag.model.Blog;

/**
 * @author Kumar
 *

	Jul 26, 2020
 */
@RestController
public class BlogController {

	@PostMapping("/createBloge")
	public Blog createBloge(Blog bloge) {
		return new Blog();
	}
}
