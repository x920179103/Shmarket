package com.yc.shmarket.admincontroller;

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

import com.yc.shmarket.adminservice.AdminService;
import com.yc.shmarket.pojo.Admin;

@Controller
public class SystemController {
	
	@Autowired
	private AdminService adminService;


	

	@RequestMapping(value = "/adminIndex",method=RequestMethod.GET)
	public ModelAndView index(ModelAndView model){
		model.setViewName("jsp/page/admin/adminIndex");
		return model;
	}
	
	/**
	 * 登陆页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/adminLogin",method=RequestMethod.GET)
	public ModelAndView login(ModelAndView model){
		model.setViewName("jsp/page/admin/adminLogin");
		return model;
	}
	
	/**
	 * 注销登录 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/login_out",method=RequestMethod.GET)
	public String loginOut(HttpServletRequest request){
		request.getSession().setAttribute("admin", null);
		return "redirect:jsp/page/admin/adminLogin";
	}
	
	/**
	 * 登录表单提交
	 * @return
	 */
	@RequestMapping(value = "/adminLogin",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> login(
			@RequestParam(value="ausename",required=true) String ausename,
			@RequestParam(value="apwd",required=true) String apwd,
			HttpServletRequest request
			){
		Map<String, String> ret = new HashMap<String, String>();
		if(StringUtils.isEmpty(ausename)){
			ret.put("type", "error");
			ret.put("msg", "用户名不能为空!");
			return ret;
		}
		if(StringUtils.isEmpty(apwd)){
			ret.put("type", "error");
			ret.put("msg", "密码不能为空!");
			return ret;
		}
		Admin admin = adminService.findByAdminName(ausename);
		if(admin == null){
			ret.put("type", "error");
			ret.put("msg", "不存在该用户!");
			return ret;
		}
		if(!apwd.equals(admin.getApwd())){
			ret.put("type", "error");
			ret.put("msg", "密码错误!");
			return ret;
		}
		request.getSession().setAttribute("admin", admin);
		ret.put("type", "success");
		ret.put("msg", "登录成功!");
		return ret;
	}
	


	
	

}
