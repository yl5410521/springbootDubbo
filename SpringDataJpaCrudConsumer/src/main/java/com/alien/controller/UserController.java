package com.alien.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alien.entity.User;
import com.alien.service.UserService;

@Controller
@EnableAutoConfiguration
public class UserController {

	@Reference(group = "userService", version = "1.0", check = false)
	private UserService userService;

	@ResponseBody
	@GetMapping("/query")
	public ModelAndView query(ModelAndView modelAndView) {
		modelAndView.setViewName("index");
		User user = new User();
		String id = "297ed5e069a8e07f0169a909b3c4002f";
		User use = userService.getUserById(user, id);
		System.out.println("**********" + use.getAddress());
		modelAndView.addObject("user", use);
		return modelAndView;
	}

	@GetMapping("/list")
	public String lists() {
		userService.findAll();
		return "/index";
	}
}
