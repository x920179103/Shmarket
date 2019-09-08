package com.yc.shmarket.admin.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.yc.shmarket.admin.service.AdminService;
import com.yc.shmarket.pojo.Admin;

@Controller
public class SystemController {

	@Autowired
	private AdminService adminService;

	@RequestMapping(value = "/adminIndex", method = RequestMethod.GET)
	public ModelAndView index(ModelAndView model) {
		model.setViewName("jsp/page/admin/adminIndex");
		return model;
	}

	/**
	 * 登陆页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/adminLogin", method = RequestMethod.GET)
	public ModelAndView login(ModelAndView model) {
		model.setViewName("jsp/page/admin/adminLogin");
		return model;
	}

	/**
	 * 注销登录
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/login_out", method = RequestMethod.GET)
	public String loginOut(HttpServletRequest request) {
		request.getSession().setAttribute("admin", null);
		return "redirect:adminLogin";
	}

	/**
	 * 登录表单提交
	 * 
	 * @return
	 */
	@RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> login(@RequestParam(value = "ausename", required = true) String ausename,
			@RequestParam(value = "apwd", required = true) String apwd, HttpServletRequest request) {
		Map<String, String> ret = new HashMap<String, String>();
		if (StringUtils.isEmpty(ausename)) {
			ret.put("type", "error");
			ret.put("msg", "用户名不能为空!");
			return ret;
		}
		if (StringUtils.isEmpty(apwd)) {
			ret.put("type", "error");
			ret.put("msg", "密码不能为空!");
			return ret;
		}
		Admin admin = adminService.findByAdminName(ausename);
		System.out.println(admin);
		if (admin == null) {
			ret.put("type", "error");
			ret.put("msg", "不存在该用户!");
			return ret;
		}
		if (!apwd.equals(admin.getApwd())) {
			ret.put("type", "error");
			ret.put("msg", "密码错误!");
			return ret;
		}
		request.getSession().setAttribute("admin", admin);
		ret.put("type", "success");
		ret.put("msg", "登录成功!");
		return ret;
	}

	/**
	 * 以下embed方法都为admin嵌入页面
	 * 
	 * @param model
	 * @return
	 */

	@RequestMapping(value = "/adminembage01", method = RequestMethod.GET)
	public ModelAndView embed01(ModelAndView model) {
		model.setViewName("jsp/page/admin/bage/adminembage01");
		return model;
	}

	@RequestMapping(value = "/adminembage2", method = RequestMethod.GET)
	public ModelAndView embed02(ModelAndView model) {
		model.setViewName("jsp/page/admin/bage/adminembage2");
		return model;
	}

	@RequestMapping(value = "/adminembage3", method = RequestMethod.GET)
	public ModelAndView embed03(ModelAndView model) {
		model.setViewName("jsp/page/admin/bage/adminembage3");
		return model;
	}

	@RequestMapping(value = "/adminembage4", method = RequestMethod.GET)
	public ModelAndView embed04(ModelAndView model) {
		model.setViewName("jsp/page/admin/bage/adminembage4");
		return model;
	}

	@RequestMapping(value = "/adminembage5", method = RequestMethod.GET)
	public ModelAndView embed05(ModelAndView model) {
		model.setViewName("jsp/page/admin/bage/adminembage5");
		return model;
	}

	@RequestMapping(value = "/adminembage6", method = RequestMethod.GET)
	public ModelAndView embed06(ModelAndView model) {
		model.setViewName("jsp/page/admin/bage/adminembage6");
		return model;
	}

	@RequestMapping(value = "/adminembage7", method = RequestMethod.GET)
	public ModelAndView embed07(ModelAndView model) {
		model.setViewName("jsp/page/admin/bage/adminembage7");
		return model;
	}

	@RequestMapping(value = "/adminembage8", method = RequestMethod.GET)
	public ModelAndView embed08(ModelAndView model) {
		model.setViewName("jsp/page/admin/bage/adminembage8");
		return model;
	}

	@RequestMapping(value = "/adminembage9", method = RequestMethod.GET)
	public ModelAndView embed09(ModelAndView model) {
		model.setViewName("jsp/page/admin/bage/adminembage9");
		return model;
	}

	/*
	 * @RequestMapping(value = "/adminList",method=RequestMethod.GET) public
	 * ModelAndView embed10(ModelAndView model){
	 * model.setViewName("jsp/page/admin/bage/adminembage10"); return model; }
	 */
	@RequestMapping(value = "/adminembage11", method = RequestMethod.GET)
	public ModelAndView embed11(ModelAndView model) {
		model.setViewName("jsp/page/admin/bage/adminembage11");
		return model;
	}

	/**
	 * 以下是admin表单验证
	 * 
	 * @param model
	 * @return
	 *//*
		 * 
		 * @RequestMapping(value = "/admininsert",method=RequestMethod.GET) public
		 * ModelAndView admininsert(ModelAndView model){
		 * model.setViewName("jsp/page/admin/form/admininsert"); return model; }
		 */

}
