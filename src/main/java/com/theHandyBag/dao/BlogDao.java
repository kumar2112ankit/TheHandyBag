package com.theHandyBag.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.stereotype.Repository;


import com.theHandyBag.model.Blog;
import com.theHandyBag.model.User_Table;
//@RepositoryRestResource(collectionResourceRel = "blog",path = "blog")
@Repository("dsfjj")
public interface BlogDao extends JpaRepository<Blog,Integer>{

	/**
	 * @param category
	 * @return
	 */
	List<Blog> findByCategory(String category);
	
	

}
