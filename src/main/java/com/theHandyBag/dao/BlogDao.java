package com.theHandyBag.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


import com.theHandyBag.model.Blog;
@RepositoryRestResource
@Repository("dsfjj")
public interface BlogDao extends JpaRepository<Blog,Long>{
	
	

}
