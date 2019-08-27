package com.yc.shmarket.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserAction {

	@GetMapping("index")
	public String index() {

		return "index";
	}
	
	@GetMapping("login")
	public String login() {

		return "login";
	}
	
	@GetMapping("register")
	public String register() {

		return "register";
	}
}
