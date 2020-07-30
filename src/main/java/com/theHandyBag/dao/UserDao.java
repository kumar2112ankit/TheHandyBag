/**
 * 
 */
package com.theHandyBag.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theHandyBag.model.Blog;
import com.theHandyBag.model.User_Table;

/**
 * @author Kumar
 *

	Jul 28, 2020
 */
@Repository
public interface UserDao extends JpaRepository<User_Table, Integer>{

}
