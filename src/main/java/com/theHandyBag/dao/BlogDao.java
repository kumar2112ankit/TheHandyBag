package com.theHandyBag.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.theHandyBag.model.Blog;
@Repository("dsfjj")
public interface BlogDao extends JpaRepository<Blog,Long>{
	
	

}