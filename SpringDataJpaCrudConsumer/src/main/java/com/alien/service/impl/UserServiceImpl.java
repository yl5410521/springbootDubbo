package com.alien.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alien.entity.User;
import com.alien.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Reference(group="userService", version="1.0")
	UserService userService;


	public User getUserById(User user, String id) {
		return userService.getUserById(user, id);
	}


	@Override
	public List<User> findAll() {
		return userService.findAll();
	}

}
