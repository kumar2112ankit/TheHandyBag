/**
 * 
 */
package com.theHandyBag.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.theHandyBag.model.Blog;
import com.theHandyBag.model.Multi_Medi_Type;
import com.theHandyBag.model.User_Table;
import com.theHandyBag.service.BlogService;

/**
 * @author Kumar
 *
 * 
 *         Jul 28, 2020
 */
@RestController
public class BlogCXontroller {

	@Autowired
	private BlogService saveBlogService;

	@PostMapping("/saveBlog")
	public String saveBlog(@RequestBody Blog blog) {

		/*
		 * Blog bloge = new Blog(); bloge.setBlog(blog.getBlog());
		 * bloge.setBlogName(blog.getBlogName()); bloge.setCategory(blog.getCategory());
		 * bloge.setCreateDate(blog.getCreateDate());
		 * bloge.setEditDate(blog.getEditDate()); bloge.setLocation(blog.getLocation());
		 * //bloge.setMedia(blog.getMedia());
		 * System.out.println(blog.getMedia().size());
		 * 
		 * Set<Multi_Medi_Type> mediaList = new HashSet<Multi_Medi_Type>(); for
		 * (Multi_Medi_Type media : blog.getMedia()) {
		 * 
		 * mediaList.add(new Multi_Medi_Type(media.getMedia_id(),
		 * media.getCreate_date(), media.getStatus(), media.getBlog(),
		 * media.getLocation(), media.getMeida_type()));
		 * System.out.println(media.getBlog()); } bloge.setMedia(mediaList);
		 * System.out.println(bloge); saveBlogService.saveBlog(bloge);
		 */
		
		if(blog!=null) {
			saveBlogService.saveBlog(blog);
			return "bloge created succesully";
		}
		
		return "Bloge not created due to some proble";

	}

	@GetMapping("/allBloges")
	public List<Blog> createBloge(Blog bloge) {
		return saveBlogService.findAllBloge();
	}
	
	@GetMapping("/blogeByCategory/{category}")
	public List<Blog> blogeByCategory(@PathVariable String category) {
		return saveBlogService.fingByCategory(category);
	}
}
