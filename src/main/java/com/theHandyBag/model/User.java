/**
 * 
 */
package com.theHandyBag.model;

import java.io.Serializable;

/**
 * @author Kumar
 *

	Jul 28, 2020
 */
public class User implements Serializable{
		
		private Integer userId;
		private String user_name;
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
		public User(Integer userId, String user_name) {
			super();
			this.userId = userId;
			this.user_name = user_name;
		}
		public User() {
			
		}
		
		
		

}
