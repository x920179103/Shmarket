package com.yc.shmarket.action;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yc.shmarket.biz.BizException;
import com.yc.shmarket.biz.UserBiz;
import com.yc.shmarket.pojo.Users;
import com.yc.shmarket.util.RandomValidateCode;
import com.yc.shmarket.vo.Result;

@Controller
public class UserAction {

	@Resource
	private UserBiz ub;

	@GetMapping("index")
	public String index() {
		return "index";
	}

	@GetMapping("tologin")
	public String tologin() {
		return "login";
	}

	@PostMapping("login")
	@ResponseBody
	public Result login(String name,String password, String code, HttpSession session, Model model) throws Exception {
		Users user;
		try {
			System.out.println("session：" + session);
			user = ub.login(name, password, code, session);
			return new Result(1,"OK",user);
		} catch (BizException e) {
			//给用户看
			return new Result(0,e.getMessage());
		}catch(RuntimeException e){
			e.printStackTrace();
			//掩盖错误
			return new Result(0,"业务繁忙，请稍后再试！");
		}
		
	}
	

	@GetMapping("toregister")
	public String toregister() {
		return "register";
	}

	@PostMapping("register")
	public String register(Users user) throws Exception {
		ub.register(user);
		return "login";
	}

	@RequestMapping("checkVerifyCode")
	@ResponseBody
	public Result verifyCode(String verifyCodeText, HttpSession session, Model model) throws BizException {
		String randomcode_key = (String) session.getAttribute("randomcode_key");
		System.out.println(randomcode_key);
		if(verifyCodeText == randomcode_key) {
			return new Result(1,"OK");
		}
		return new Result(0,"验证码错误");
	}

	@RequestMapping("uname")
	@ResponseBody
	public boolean uname(String uname) {
		boolean check = ub.checkUname(uname);
		return check;
	}

	/**
	 * 获取生成验证码显示到 UI 界面
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	@RequestMapping(value = "/checkCode")
	public void checkCode(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置相应类型,告诉浏览器输出的内容为图片
		response.setContentType("image/jpeg");
		// 设置响应头信息，告诉浏览器不要缓存此内容
		response.setHeader("pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expire", 0);
		RandomValidateCode randomValidateCode = new RandomValidateCode();
		try {
			randomValidateCode.getRandcode(request, response);// 输出图片方法
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
