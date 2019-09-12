package com.yc.shmarket.action;

import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

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

	@GetMapping("toforget2")
	public String toforget2() {
		return "forget2";
	}
	
	@GetMapping("toforget")
	public String toforget() {
		return "forget";
	}

	@PostMapping("toedit")
	@ResponseBody
	public String toedit(HttpSession session,Users user) {
		int uid = user.getUid();
		ub.addressFindAll(uid, session);
		return "edit";
	}

	@PostMapping("confirmNewPwd")
	@ResponseBody
	public Result confirmNewPwd(String upwd, HttpSession session) {
		try {
			ub.confirmNewPwd(session, upwd);
			return new Result(1,"OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Result(0,"网络繁忙请稍后再试");
		}
	}

	@PostMapping("toCheckAndSend")
	@ResponseBody
	public Result forget(String uname, String uemail, HttpSession session) {
		boolean check = ub.checkUnameByUemail(uname, uemail);
		if (check) {
			int sendCode = ub.randomCode();
			session.setAttribute("userNameRpwd", uname);
			session.setAttribute("sendCode", sendCode);
			String subject = "二手交易市场欢迎您";
			String content = "您正在使用邮箱找回密码，验证码：" + sendCode;// + "，有效期五分钟"
			ub.sendMail(uemail, subject, content);

//			// TimerTask实现5分钟后从session中删除checkCode 
//			final Timer timer=new Timer();
//			timer.schedule(new TimerTask() {
//				@Override
//				public void run() {
//					session.removeAttribute("sendCode");
//					System.out.println("sendCode删除成功");
//					timer.cancel();
//				}
//			}, 5 * 60 * 1000);
			System.out.println("toCheckAndSend");
			return new Result(1, "toCheckAndSendOK");
		}
		return new Result(2, "用户名和邮箱不匹配");
	}

	@PostMapping("checkCode")
	@ResponseBody
	public Result checkCode(String code, HttpSession session) {
		System.out.println("checkCode");
		int sendCode = (int) session.getAttribute("sendCode");
		String Code = sendCode + "";
		if (Code.equals(code)) {
			System.out.println("验证码正确");
			return new Result(3, "checkCodeOK");
		} else {
			System.out.println("验证码错误");
			return new Result(2, "验证码错误");
		}
	}

	@GetMapping("tonewPassword")
	public String tonewPassword() {
		return "newPassword";
	}

	@GetMapping("tologin")
	public String tologin() {
		return "login";
	}

	@PostMapping("login")
	@ResponseBody
	public Result login(String name, String password, String code, HttpSession session, Model model) throws Exception {
		Users user;
		try {
//			System.out.println("session：" + session);
			user = ub.login(name, password, code, session);
			session.setAttribute("userName", name);
//			System.out.println(session.getAttribute("userName"));
			return new Result(1, "OK", user);
		} catch (BizException e) {
			// 给用户看
			return new Result(0, e.getMessage());
		} catch (RuntimeException e) {
			e.printStackTrace();
			// 掩盖错误
			return new Result(0, "业务繁忙，请稍后再试！");
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

	/**
	 * 获取生成验证码显示到 UI 界面
	 * 
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

	@RequestMapping("uname")
	@ResponseBody
	public boolean uname(String uname) {
		boolean check = ub.checkUname(uname);
		return check;
	}

	@RequestMapping("checkVerifyCode")
	@ResponseBody
	public Result verifyCode(String verifyCodeText, HttpSession session, Model model) throws BizException {
		String randomcode_key = (String) session.getAttribute("randomcode_key");
		System.out.println(randomcode_key);
		if (verifyCodeText == randomcode_key) {
			return new Result(1, "OK");
		}
		return new Result(0, "验证码错误");
	}

	@RequestMapping("userLoginOut")
	@ResponseBody
	public Result userLoginOut(String name, HttpSession session) throws BizException {
		try {
			session.removeAttribute("userName");
			return new Result(1, "OK");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(0, "网络繁忙，请稍后再试！");
		}
	}

}
