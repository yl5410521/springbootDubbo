package com.alien.service;

import java.util.List;

import com.alien.entity.User;

public interface UserService {

	/**
	 * 
	 * @param user
	 * @param id
	 * @return
	 */
	public User getUserById(User user, String id);
	/**
	 * 
	 * @return
	 */
	 public List<User> findAll();
}
