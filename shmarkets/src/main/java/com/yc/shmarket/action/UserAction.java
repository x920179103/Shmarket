package com.yc.shmarket.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.shmarket.biz.BizException;
import com.yc.shmarket.biz.UserBiz;
import com.yc.shmarket.pojo.Users;

@Controller
public class UserAction {
	
	@Resource
	private UserBiz ub;
	
//	@Resource
//	private Users u;
	
	@GetMapping("index")
	public String index() {
		return "index";
	}

	@GetMapping("tologin")
	public String tologin() {
		return "login";
	}
	@PostMapping("login")
	public String login(Users u) throws BizException {
		ub.login(u);
		return "index";
	}
	
	@GetMapping("toregister")
	public String toregister() {
		return "register";
	}
	@PostMapping("register")
	public String register(Users user) {
		ub.register(user);
		return "login";
	}
	

	@RequestMapping("uname")
	@ResponseBody
	public boolean uname(String uname) {
		boolean  check = ub.checkUname(uname);
		return check;
	}
}
